package com.oj.judge;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Description: 主类（项目启动入口）
 * @Author: MING
 * @Date: 2024/03/05
 */

@SpringBootApplication
@EnableScheduling
@EnableDiscoveryClient
@ComponentScan("com.oj")
@EnableFeignClients(basePackages = {"com.oj.client"})
@Slf4j
public class JudgeApplication {

    public static void main(String[] args) {
        SpringApplication.run(JudgeApplication.class, args);
        log.info("> oj-judge-服务启动完成 <");
    }

}
