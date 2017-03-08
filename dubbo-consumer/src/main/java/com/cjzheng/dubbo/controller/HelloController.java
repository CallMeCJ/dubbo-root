package com.cjzheng.dubbo.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.cjzheng.dubbo.api.IControlService;

/**
 * 
 * @Description: TODO
 * @author: zhengchaojie
 * @date 2017��3��8�� ����11:16:44
 *
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
