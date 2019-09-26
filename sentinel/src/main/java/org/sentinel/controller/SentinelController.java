package org.sentinel.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

@RestController
public class SentinelController {

	@RequestMapping("/index")
	@SentinelResource("index")
	public String index() {
		return HttpStatus.OK.getReasonPhrase();
	}
}
