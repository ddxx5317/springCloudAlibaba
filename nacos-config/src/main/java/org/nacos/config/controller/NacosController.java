package org.nacos.config.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.nacos.api.config.annotation.NacosValue;

@RestController
public class NacosController {
	
	@NacosValue(value = "${nacos_key:000000000}", autoRefreshed = true)
	private String nacosKey;

	@RequestMapping("/index")
	public String index() {
		System.out.println("into......");
		return this.nacosKey;
		
	}
}
