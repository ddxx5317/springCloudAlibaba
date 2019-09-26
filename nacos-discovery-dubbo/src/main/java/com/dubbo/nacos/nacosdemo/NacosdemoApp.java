package com.dubbo.nacos.nacosdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@EnableDubbo
@SpringBootApplication
public class NacosdemoApp {

	public static void main(String[] args) {
		SpringApplication.run(NacosdemoApp.class, args);
	}

}
