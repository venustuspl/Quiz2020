package com.example.Quiz2020.mapper;

import com.example.Quiz2020.domain.Question;
import com.example.Quiz2020.domain.QuestionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class QuestionMapper {

    @Autowired
    AnswerMapper answerMapper;

    public Question mapToQuestion(final QuestionDto questionDto) {
        return new Question(
                questionDto.getId(),
                questionDto.getContent());

    }


    public List<QuestionDto> mapToQuestionDto(final List<Question> questionList) {
        return questionList.stream()
                .map(q ->
                new QuestionDto(
                q.getId(),
                q.getQuestion(),
                answerMapper.mapToAnswerStringListByQuestionId((int)q.getId()),
                answerMapper.selectGoodAnswer((int)q.getId())))
                .collect(Collectors.toList());



    }

//    public List<QuestionDto> mapToQuestionDtoList(final List<Question> questionList) {
//        return questionList.stream()
//                .map(q -> new QuestionDto(q.getId(), q.getQuestion()))
//                .collect(Collectors.toList());
//    }

    public List<String> mapToQuestionStringList(final List<Question> questionList) {
        return questionList.stream()
                .map(q ->  q.getQuestion())
                .collect(Collectors.toList());
    }

}

