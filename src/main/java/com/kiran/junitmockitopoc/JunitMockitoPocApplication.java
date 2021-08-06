package com.kiran.junitmockitopoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class JunitMockitoPocApplication {

    public static void main(String[] args) {
        SpringApplication.run(JunitMockitoPocApplication.class, args);
    }

}
