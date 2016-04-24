package com.icoder.jxhouse.controller.index;

import com.icoder.jxhouse.controller.base.BaseController;
import com.icoder.jxhouse.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/hello")
public class HomeController extends BaseController{
	@Autowired
	private UserService userService;

	 @RequestMapping(value = "/haha", method = RequestMethod.GET)
		public String index1(){
			 userService.text();
			return "index";
		}
}
