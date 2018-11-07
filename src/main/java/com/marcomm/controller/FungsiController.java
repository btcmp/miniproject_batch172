package com.marcomm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marcomm.service.FungsiService;

@Controller
@RequestMapping("/fungsi")
public class FungsiController {

	@Autowired
	FungsiService fungsiService;
	
	@RequestMapping(value="/getuserlogin", method=RequestMethod.GET)
	@ResponseBody
	public String getEmpById() {
		String userlog = fungsiService.getUserLog();
		return userlog;
	}
	
	
	
	
	/*@RequestMapping(value="/getRolelogin", method=RequestMethod.GET)
	@ResponseBody
	public String getRole() {
		String userlog = fungsiService.getRole();
		return userlog;
	}*/
	
}
