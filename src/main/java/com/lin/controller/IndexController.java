/**
 * 
 */
package com.lin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Title: IndexController
 * Description:
 * @author XxX
 * @date 2017年4月11日上午11:54:34
 * @since 
 */
@Controller
public class IndexController {

	@ResponseBody
	@RequestMapping("config")
	public ModelAndView config(){
		ModelAndView model=new ModelAndView("config/config");
		return model;
	}
	
}
