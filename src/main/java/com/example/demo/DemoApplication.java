package com.example.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//        禁用banner
//        SpringApplicationBuilder builder = new SpringApplicationBuilder(DemoApplication.class);
//        builder.application().setAdditionalProfiles("prod");
//        builder.bannerMode(Banner.Mode.OFF).run(args);
        SpringApplication.run(DemoApplication.class, args);
    }

}
