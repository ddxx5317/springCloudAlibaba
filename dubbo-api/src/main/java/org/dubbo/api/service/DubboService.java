package org.dubbo.api.service;

import javax.validation.constraints.NotBlank;

public interface DubboService {
	public String findById(@NotBlank Long id);
}
