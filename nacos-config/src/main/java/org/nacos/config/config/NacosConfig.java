package org.nacos.config.config;

import org.springframework.context.annotation.Configuration;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;

@Configuration
@NacosPropertySource(dataId = "nacos.config", autoRefreshed = true)
public class NacosConfig {
}