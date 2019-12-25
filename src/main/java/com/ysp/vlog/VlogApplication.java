package com.ysp.vlog;

import com.ysp.vlog.config.StorageProperties;
import com.ysp.vlog.service.method.StorageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class VlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(VlogApplication.class, args);
    }

}
