package com.example.Quiz2020.controller;


import com.example.Quiz2020.domain.AnswerDto;
import com.example.Quiz2020.mapper.AnswerMapper;
import com.example.Quiz2020.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1")
public class AnswerController {
    @Autowired
    private AnswerMapper answerMapper;

    @Autowired
    private DbService service;

    @RequestMapping(method = RequestMethod.GET, value = "/answers")
    public List<AnswerDto> getAnswers() {
        return answerMapper.mapToAnswerDtoList(service.getAllAnswers());

    }

    @RequestMapping(method = RequestMethod.GET, value = "/answer/{answerId}")
    public AnswerDto getAnswer(@PathVariable Long answerId) throws Exception {

        return answerMapper.mapToAnswerDto(service.getAnswer(answerId).orElseThrow(Exception::new));

    }

    @RequestMapping(method = RequestMethod.GET, value = "/allquestionanswers/{questionId}")
    public List<AnswerDto> getAllQuestionAnswers(@PathVariable int questionId) {

        return answerMapper.mapToAnswerDtoList(service.getAllQuestionAnswers(questionId));

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/answers/{answerId}")
    public void deleteAnswer(@PathVariable Long answerId) {
        service.deleteAnswer(answerId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/answers")
    public AnswerDto updateAnswer(@RequestBody AnswerDto answerDto) {

        return answerMapper.mapToAnswerDto(service.saveAnswer(answerMapper.mapToAnswer(answerDto)));
    }


    @RequestMapping(method = RequestMethod.POST, value = "/answers", consumes = APPLICATION_JSON_VALUE)
    public void createAnswer(@RequestBody AnswerDto answerDto) {

        service.saveAnswer(answerMapper.mapToAnswer(answerDto));
    }

}
