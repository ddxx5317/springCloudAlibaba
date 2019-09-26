package com.dubbo.nacos.nacosdemo.service.impl;
import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.nacos.nacosdemo.service.DemoService;

@Service
public class DefaultService implements DemoService {

    @Override
	public String sayName(String name) {
		return "hi,"+name;
    }
}