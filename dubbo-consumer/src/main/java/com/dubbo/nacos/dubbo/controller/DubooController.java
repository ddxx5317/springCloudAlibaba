package com.dubbo.nacos.dubbo.controller;

import org.dubbo.api.service.DubboService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

@RestController
public class DubooController {
	
	@Reference
	private DubboService dubboService;

	@RequestMapping("/index")
	public String index() {
		System.out.println(HttpStatus.OK.getReasonPhrase());
		return dubboService.findById(10L);
	}
}
