package com.example.Quiz2020.controller;

import com.example.Quiz2020.domain.Question;
import com.example.Quiz2020.domain.QuestionDto;
import com.example.Quiz2020.mapper.QuestionMapper;
import com.example.Quiz2020.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1")
public class QuestionController {

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private DbService service;

//    @RequestMapping(method = RequestMethod.GET, value = "/questions")
//    public List<QuestionDto> get() {
//        return questionMapper.mapToQuestionDtoList(service.getAllQuestions());
//
//    }

//    @RequestMapping(method = RequestMethod.GET, value = "/question/{questionId}")
//    public QuestionDto getQuestion(@RequestParam Long questionId) throws Exception {
//
//        return questionMapper.mapToQuestionDto(service.getQuestion(questionId).orElseThrow(Exception::new));
//
//    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/questions/{questionId}")
    public void deleteQuestion(@PathVariable Long questionId) {
        service.deleteQuestion(questionId);
    }

//    @RequestMapping(method = RequestMethod.PUT, value = "/questions")
//    public QuestionDto updateQuestion(@RequestBody QuestionDto questionDto) {
//
//        return questionMapper.mapToQuestionDto(service.saveQuestion(questionMapper.mapToQuestion(questionDto)));
//    }


    @RequestMapping(method = RequestMethod.POST, value = "/questions", consumes = APPLICATION_JSON_VALUE)
    public void createQuestion(@RequestBody QuestionDto questionDto) {

        service.saveQuestion(questionMapper.mapToQuestion(questionDto));
    }

}

