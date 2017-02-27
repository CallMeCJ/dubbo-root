package com.cjzheng.dubbo.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.cjzheng.dubbo.api.IControlService;

/**
 * @date: 2017年2月27日下午3:50:38
 * @author: zhengchaojie
 * @version: v1.0
 */

@Service("controlService")
public class ControlServiceImpl implements IControlService {

	@Override
	public String sayHello(Map<String, Object> paramsMap) {
		System.out.println("You Have Arrived Producer");
		return "success";
	}

}
