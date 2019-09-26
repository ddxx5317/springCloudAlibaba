package org.nacos.discovery.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;

@RestController
public class DiscoveryController {

    @NacosInjected
    private NamingService namingService;
    

    @Value("${server.port}")
    private int serverPort;

    @Value("${spring.application.name}")
    private String applicationName;

    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    public List<Instance> get(@RequestParam String serviceName) throws NacosException {
        return namingService.getAllInstances(serviceName);
    }
    
	/*
	 * @PostConstruct public void registerInstance() throws NacosException{
	 * namingService.registerInstance(applicationName,"127.0.0.1",serverPort); }
	 */
}

