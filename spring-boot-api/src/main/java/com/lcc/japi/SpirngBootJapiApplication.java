package com.lcc.japi;

import com.lcc.japi.configuration.JapiInitialconfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpirngBootJapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpirngBootJapiApplication.class, args);
        //重启自动生成api
        JapiInitialconfiguration.initialJapi();
    }

}
