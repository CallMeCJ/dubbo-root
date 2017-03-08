package com.cjzheng.dubbo.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.cjzheng.dubbo.api.IControlService;

/**
 * 
 * @Description: TODO
 * @author: zhengchaojie
 * @date 2017年3月8日 上午11:12:00
 *
 */

@Service("controlService")
public class ControlServiceImpl implements IControlService {

	@Override
	public String sayHello(Map<String, Object> paramsMap) {
		System.out.println("You Have Arrived Producer");
		return "success";
	}

}
