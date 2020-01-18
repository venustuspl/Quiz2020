package com.example.Quiz2020.repository;

import com.example.Quiz2020.domain.Ranking;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RankingRepository extends CrudRepository<Ranking, Long> {

    @Override
    public List<Ranking> findAll();

    @Override
    public Optional<Ranking> findById(Long id);

    @Override
    Ranking save(Ranking Ranking);

    @Override
    public void deleteById(Long id);

    @Override
    long count();


}
