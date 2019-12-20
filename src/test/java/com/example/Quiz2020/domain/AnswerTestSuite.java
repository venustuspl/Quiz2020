package com.example.Quiz2020.domain;

import com.example.Quiz2020.service.DbService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnswerTestSuite {

    @Autowired
    private DbService service;

    @Test
    public void testAnswerSave() {
        //Given
        Answer answer = new Answer(1, "TAK", true);

        //When
        long id = 0;
        id = service.saveAnswer(answer).getAnswerId();

        //Then

        Assert.assertTrue(id > 0);
        //CleanUp
        service.deleteAnswer(id);
    }
}