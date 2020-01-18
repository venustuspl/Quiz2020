package com.example.Quiz2020.mapper;

import com.example.Quiz2020.domain.Ranking;
import com.example.Quiz2020.domain.RankingDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class RankingMapper {

    public Ranking mapToRanking(final RankingDto rankingDto) {
        return new Ranking(
                rankingDto.getRankingId(),
                rankingDto.getLogin(),
                rankingDto.getPoints(),
                rankingDto.getTestDate());
    }


    public RankingDto mapToRankingDto(final Ranking ranking) {
        return new RankingDto(
                ranking.getRankingId(),
                ranking.getLogin(),
                ranking.getPoints(),
                ranking.getTestDate()
        );
    }

    public List<RankingDto> mapToRankingDtoList(final List<Ranking> rankingList) {
        return rankingList.stream()
                .map(r -> new RankingDto(r.getRankingId(), r.getLogin(), r.getPoints(), r.getTestDate()))
                .collect(Collectors.toList());
    }


}
