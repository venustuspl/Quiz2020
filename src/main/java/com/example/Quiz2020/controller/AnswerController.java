package com.example.Quiz2020.controller;


import com.example.Quiz2020.domain.Answer;
import com.example.Quiz2020.domain.AnswerDto;
import com.example.Quiz2020.domain.Question;
import com.example.Quiz2020.domain.QuestionDto;
import com.example.Quiz2020.mapper.AnswerMapper;
import com.example.Quiz2020.service.DbService;
import com.google.gson.Gson;
import com.sun.xml.bind.v2.util.CollisionCheckStack;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1")
public class AnswerController {

    @Autowired
    private AnswerMapper answerMapper;

    @Autowired
    private DbService service;

    @Autowired
    private ModelMapper modelMapper;

    @RequestMapping(method = RequestMethod.GET, value = "/quiz")
    public String getQuiz() {

//        List<AnswerDto> answerDtos = service.getAllAnswers().stream()
//                .map(a -> modelMapper.map(a, AnswerDto.class))
//                .collect(Collectors.toList());
//
//        Map<Long, List<AnswerDto>> answerDtoMap = answerDtos.stream()
//                .collect(Collectors.groupingBy(AnswerDto::getQuestionId));

        List<QuestionDto> questionDtoList = service.getAllQuestions().stream()
                .map(q -> modelMapper.map(q, QuestionDto.class))
                .collect(Collectors.toList());

        Map<QuestionDto, List<AnswerDto>> quizMap = new HashMap<>();

        for (QuestionDto questionDto : questionDtoList) {
            quizMap.put(questionDto, new ArrayList<>(service.getAllAnswers().stream()
                    .map(a -> modelMapper.map(a, AnswerDto.class))
                    .filter(a -> a.getQuestionId() == questionDto.getId())
                    .collect(Collectors.toList())));
        }

        Gson gson = new Gson();
        String result = gson.toJson(quizMap);


        return result;
    }


    @RequestMapping(method = RequestMethod.GET, value = "/answers")
    public List<AnswerDto> getAnswers() {
        List<AnswerDto> answers = service.getAllAnswers().stream()
                .map(answer -> convertToAnswerDto(answer))
                .collect(Collectors.toList());

        return answers;

    }

    @RequestMapping(method = RequestMethod.GET, value = "/answer/{answerId}")
    public AnswerDto getAnswer(@PathVariable Long answerId) throws Exception {

        return convertToAnswerDto(service.getAnswer(answerId).orElseThrow(Exception::new));

    }

    @RequestMapping(method = RequestMethod.GET, value = "/allquestionanswers/{questionId}")
    public List<AnswerDto> getAllQuestionAnswers(@PathVariable int questionId) {
        List<AnswerDto> answers = service.getAllAnswers().stream()
                .map(answer -> convertToAnswerDto(answer))
                .filter(answerDto -> answerDto.getQuestionId() == questionId)
                .collect(Collectors.toList());

        return answers;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/answers/{answerId}")
    public void deleteAnswer(@PathVariable Long answerId) {

        service.deleteAnswer(answerId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/answers")
    public AnswerDto updateAnswer(@RequestBody AnswerDto answerDto) {

        return convertToAnswerDto(service.saveAnswer(answerMapper.mapToAnswer(answerDto)));
    }


    @RequestMapping(method = RequestMethod.POST, value = "/answers", consumes = APPLICATION_JSON_VALUE)
    public void createAnswer(@RequestBody AnswerDto answerDto) {

        service.saveAnswer(answerMapper.mapToAnswer(answerDto));
    }

    private AnswerDto convertToAnswerDto(Answer answer) {
        AnswerDto answerDto = modelMapper.map(answer, AnswerDto.class);
        return answerDto;
    }

    private Answer convertToAnswerEntity(AnswerDto answerDto) {
        Answer answer = modelMapper.map(answerDto, Answer.class);
        return answer;
    }

}
