package org.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "org.dubbo.provider.service.impl")
public class DubboProviderApp {
	public static void main(String[] args) {
		SpringApplication.run(DubboProviderApp.class);
	}
}
