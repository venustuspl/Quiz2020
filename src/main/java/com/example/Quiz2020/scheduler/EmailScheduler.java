package com.example.Quiz2020.scheduler;

import com.example.Quiz2020.config.AdminConfig;
import com.example.Quiz2020.domain.Mail;
import com.example.Quiz2020.repository.RankingRepository;
import com.example.Quiz2020.service.SimpleEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EmailScheduler {

    @Autowired
    private SimpleEmailService simpleEmailService;

    @Autowired
    private RankingRepository rankingRepository;

    @Autowired
    private AdminConfig adminConfig;


    private static final String SUBJECT = "Ranking details.";

    @Scheduled(cron = "0 0 10 * * *")
    public void sendInformationEmail() {
        long size = rankingRepository.count();
        simpleEmailService.send(new Mail(
                //"venustus.pl@gmail.com",
                 adminConfig.getAdminMail(),
                SUBJECT,
                "Currently in database you got: " + size +  (size > 1 ? " rankings." : " ranking.")
        ));
    }
}
