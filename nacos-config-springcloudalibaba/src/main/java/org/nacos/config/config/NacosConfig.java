package org.nacos.config.config;

import org.springframework.context.annotation.Configuration;

import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;

@Configuration
@NacosConfigurationProperties(dataId = "nacos-config.properties", autoRefreshed = true)
public class NacosConfig {
}