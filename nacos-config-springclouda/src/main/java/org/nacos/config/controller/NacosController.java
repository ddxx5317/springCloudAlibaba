package org.nacos.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class NacosController {
	
	@Value("${nacos_key}")
	private String nacosKey;
	
	@RequestMapping("/index")
	public String index() {
		System.out.println(HttpStatus.OK.getReasonPhrase());
		return this.nacosKey;
	}
}
