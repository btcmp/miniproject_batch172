package com.marcomm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
 
import com.marcomm.model.MasterUser;
import com.marcomm.service.MasterUserService;

@Controller
@RequestMapping("/user")
public class MasterUserController {
	
	@Autowired
	MasterUserService userService;
	
	@RequestMapping
	public String index() {
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
	/*, method=RequestMethod.DELETE*/
/*	@RequestMapping(value="/delete/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable int id){
		UserService.delete(id);
	}*/
	
	/*@RequestMapping(value="/delete",method=RequestMethod.POST)*/
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void deleteProduct(@PathVariable ("id") int id) {
		userService.delete(id);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void update(@RequestBody MasterUser masterUser) {
		userService.update(masterUser);
	}


}