package com.anurag.tools.mtiui.controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    public CommandLineRunner loadData(MtlRepository mtlRepository, ExceptionRepository exceptionRepository) {
        return args -> {
            // Sample MTL data
            if (mtlRepository.count() == 0) {
                mtlRepository.save(new Mtl("MTL001", "MTL 1"));
                mtlRepository.save(new Mtl("MTL002", "MTL 2"));
                mtlRepository.save(new Mtl("MTL003", "MTL 3"));
                mtlRepository.save(new Mtl("MTL004", "MTL 4"));
            }

            // Sample Exception data
            if (exceptionRepository.count() == 0) {
                exceptionRepository.save(new Exception("Exception 1"));
                exceptionRepository.save(new Exception("Exception 2"));
                exceptionRepository.save(new Exception("Exception 3"));
                exceptionRepository.save(new Exception("Exception 4"));
                exceptionRepository.save(new Exception("Exception 5"));
            }
        };
    }
}
