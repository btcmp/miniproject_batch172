/*package com.marcomm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.marcomm.model.MasterEmployee;
import com.marcomm.model.MasterRole;
import com.marcomm.model.MasterUser;
import com.marcomm.service.MasterUserService;

@Controller
@RequestMapping("/transaksidesign")
public class TransaksiDesign {

	@Autowired
	MasterUserService userService;
	
	@RequestMapping
	public String index(Model model) {
		List<MasterRole> roles= userService.getAllRole();
		List<MasterEmployee> employees= userService.getAllEmployee();
		model.addAttribute("roles", roles);
		model.addAttribute("employees", employees);
		return "user";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void save(@RequestBody MasterUser masterUser) {
		userService.save(masterUser);
	}
	
	
	
	@RequestMapping(value="/getall",method=RequestMethod.GET)
	@ResponseBody
	public List<MasterUser> getAllUser(){
		return userService.getAll();
	}
	
	
	
	@RequestMapping(value="/getbyid/{id}", method=RequestMethod.GET)
	@ResponseBody
	public MasterUser getEmpById(@PathVariable("id") int id) {
		MasterUser master = userService.getById(id);
		return master;
	}


}
*/