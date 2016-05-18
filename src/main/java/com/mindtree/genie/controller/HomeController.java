package com.mindtree.genie.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.genie.entities.GenieForm;
import com.mindtree.genie.entities.UserDetails;
import com.mindtree.genie.service.GenieService;

import antlr.collections.List;

@Controller
public class HomeController {
	
	@Autowired
	 private GenieService genieService;
	
	public void setGenieService(GenieService genieService) {
		this.genieService = genieService;
	}

	@RequestMapping("/LoginView")
	public ModelAndView login(Map model) {
		ModelAndView modelAndView = new ModelAndView("Login");
		model.put("userDetails", new UserDetails());
		return modelAndView;
	}

	@RequestMapping("/Validate")
	public ModelAndView validate(@ModelAttribute UserDetails userdetails,Map model) {
		UserDetails user;
		ModelAndView modelAndView=new ModelAndView();
		user=genieService.validateUser(userdetails);
		
		if(user==null)
		{
			modelAndView.setViewName("error");
			modelAndView.addObject("message","U r not a valid User");
		}
		
		else if("user".equalsIgnoreCase(user.getRole()))
		{
			modelAndView.setViewName("genieform");
			model.put("genieForm", new GenieForm());
			modelAndView.addObject("user",user);
		}
		
		else if("associate".equalsIgnoreCase(user.getRole()))
		{
			modelAndView.setViewName("viewform");
			List list=(List) genieService.getAllAssignedGenie(user.getMid());
			System.out.println("list "+list);
			modelAndView.addObject("genieList",list);
		}
		else if("admin".equalsIgnoreCase(user.getRole()))
		{
			modelAndView.setViewName("genieform");
			modelAndView.addObject("user",user);
		}
		return modelAndView;
	}
	
	@RequestMapping("/addGenie")
	public ModelAndView addGenie(@ModelAttribute GenieForm genieForm)
	{
		System.out.println("genie Form"+genieForm);
		String message=genieService.saveGenie(genieForm);
		ModelAndView modelAndView=new ModelAndView("success");
		modelAndView.addObject("msg","Genie raised");
		return modelAndView;
		
	}

}
