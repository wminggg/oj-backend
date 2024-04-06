package com.oj.gateway.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 白名单
 *
 * @author wming
 * @date 2024/04/06
 */
@Data
@Component
@ConfigurationProperties(prefix = "gateway")
public class GatewayConfiguration {

  public List<String> whiteList;
}
