package com.example.Quiz2020.controller;

import com.example.Quiz2020.domain.RankingDto;
import com.example.Quiz2020.mapper.RankingMapper;
import com.example.Quiz2020.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1")
public class RankingController {
    @Autowired
    private RankingMapper rankingMapper;

    @Autowired
    private DbService service;

    @RequestMapping(method = RequestMethod.GET, value = "/rankings")
    public List<RankingDto> getRankings() {
        return rankingMapper.mapToRankingDtoList(service.getAllRankings());

    }

    @RequestMapping(method = RequestMethod.GET, value = "/ranking/{rankingId}")
    public RankingDto getRanking(@PathVariable Long rankingId) throws Exception {

        return rankingMapper.mapToRankingDto(service.getRanking(rankingId).orElseThrow(Exception::new));

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/rankings/{rankingId}")
    public void deleteRanking(@PathVariable Long rankingId) {
        service.deleteRanking(rankingId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/rankings")
    public RankingDto updateRanking(@RequestBody RankingDto rankingDto) {

        return rankingMapper.mapToRankingDto(service.saveRanking(rankingMapper.mapToRanking(rankingDto)));
    }


    @RequestMapping(method = RequestMethod.POST, value = "/rankings", consumes = APPLICATION_JSON_VALUE)
    public void createRanking(@RequestBody RankingDto rankingDto) {

        service.saveRanking(rankingMapper.mapToRanking(rankingDto));
    }

}
