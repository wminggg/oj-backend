package com.oj.gateway.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.util.pattern.PathPatternParser;

import java.util.Collections;
import java.util.List;

/**
 * 处理跨域
 *
 * @author wming
 * @date 2024/04/06
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "cors")
public class CorsConfig {

    // 从配置文件中读取允许的域名列表
    private List<String> allowedOrigins;

    @Bean
    public CorsWebFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();
        // 允许所有 HTTP 方法
        config.addAllowedMethod("*");
        // 允许携带凭证信息（如 Cookies）
        config.setAllowCredentials(true);
        // 使用配置文件中的允许域名列表
        config.setAllowedOriginPatterns(allowedOrigins);
        // 允许所有请求头
        config.addAllowedHeader("*");
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource(new PathPatternParser());
        source.registerCorsConfiguration("/**", config);
        return new CorsWebFilter(source);
    }
}
