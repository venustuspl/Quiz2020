package com.example.Quiz2020.repository;

import com.example.Quiz2020.domain.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface QuestionRepository extends CrudRepository<Question , Long> {

    @Override
    public List<Question> findAll();

    @Override
    public Optional<Question> findById(Long id);

    @Override
    Question save (Question answer);

    @Override
    public void deleteById(Long id);

    @Override
    long count();
}