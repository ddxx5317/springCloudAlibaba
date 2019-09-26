package org.dubbo.provider.service.impl;

import javax.validation.constraints.NotBlank;
import org.dubbo.api.service.DubboService;
import com.alibaba.dubbo.config.annotation.Service;

@Service
public class DubboServiceImpl implements DubboService{

	@Override
	public String findById(@NotBlank Long id) {
		return "name"+id;
	}

}
