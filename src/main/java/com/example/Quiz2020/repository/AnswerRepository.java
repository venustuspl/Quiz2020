package com.example.Quiz2020.repository;

import com.example.Quiz2020.domain.Answer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long> {

    @Override
    public List<Answer> findAll();

    @Override
    public Optional<Answer> findById(Long id);

    @Override
    Answer save (Answer answer);

    @Override
    public void deleteById(Long id);

    @Override
    long count();

    @Query(nativeQuery = true)
    List<Answer> retriveAllQuestionAnswers(@Param("ID") int questionId);
}