package com.cjzheng.dubbo.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.cjzheng.dubbo.api.IControlService;

/**
 * @date: 2017年2月27日下午3:52:37
 * @author: zhengchaojie
 * @version: v1.0
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
	@Resource
	private IControlService controlService;

	@RequestMapping("/sayhello")
	@ResponseBody
	public String hello(String name) {
		return controlService.sayHello(null);
	}

}
