package com.example.simpleweb;

import com.example.simpleweb.dao.StudentDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = {StudentDao.class})
public class SimplewebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimplewebApplication.class, args);
    }

}
