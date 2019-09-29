package org.sentinel.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

@RestController
public class SentinelController {

	@RequestMapping("/index")
	@SentinelResource(value = "index",fallback = "fallback")
	public String index() {
		System.out.println(HttpStatus.OK.getReasonPhrase());
		return HttpStatus.OK.getReasonPhrase();
	}
	
	public String fallback() {
		System.out.println(HttpStatus.METHOD_NOT_ALLOWED.getReasonPhrase());
		return "服务暂时不可用、请稍微重试！！！";
	}
}
