package com.oj.actuator;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description: 主类（项目启动入口）
 * @Author: MING
 * @Date: 2024/03/05
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class, RedisAutoConfiguration.class})
@EnableDiscoveryClient
@EnableAdminServer
@Slf4j
public class ActuatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActuatorApplication.class, args);
        log.info("> oj-actuator-服务启动完成 <");
    }

}
