package com.oj.auth;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description: 主类（项目启动入口）
 * @Author: MING
 * @Date: 2024/03/05
 */

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("com.oj")
@EnableFeignClients(basePackages = {"com.oj.client"})
@Slf4j
public class AuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
        log.info("> oj-auth-服务启动完成 <");
    }

}
