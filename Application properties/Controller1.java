package com.example;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller1 {
	

	
	
	@RequestMapping("index")
public String index() {
		
		return "index";
	}
	
	@RequestMapping("app")
	public ModelAndView  app(Userdetails ud) {
	

		
		ModelAndView mav=new ModelAndView();
		mav.addObject("details", ud);
		mav.setViewName("app");
		
	
		return mav;
		//view page
		
	}
	
	

}


