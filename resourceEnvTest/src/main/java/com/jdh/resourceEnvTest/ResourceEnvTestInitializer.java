package com.jdh.resourceEnvTest;

import com.jdh.resourceEnvTest.model.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ResourceEnvTestInitializer implements ApplicationRunner {

    @Autowired TestService testService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("log info -> {}", testService.getTest());
        log.error("log error -> {}", testService.getTest());
    }
}
