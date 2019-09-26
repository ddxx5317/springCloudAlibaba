package com.dubbo.nacos.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@EnableDubbo
@SpringBootApplication
public class DubboConsumer {

	public static void main(String[] args) {
		SpringApplication.run(DubboConsumer.class, args);
	}

}
