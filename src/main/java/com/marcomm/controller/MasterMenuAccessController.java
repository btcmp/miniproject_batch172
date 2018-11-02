package com.marcomm.controller;

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

import com.marcomm.model.MasterMenu;
import com.marcomm.model.MasterMenuAccess;
import com.marcomm.service.MasterMenuAccessService;

@Controller
@RequestMapping("/access")
public class MasterMenuAccessController {

	@Autowired
	MasterMenuAccessService accessService;
	
	@RequestMapping
	public String index(Model model) {
		List<MasterMenu> masterMenus= accessService.getMenu();
		model.addAttribute("masterMenus", masterMenus);
		return "menuaccess";
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void save(@RequestBody MasterMenuAccess menuAccess) {
		accessService.save(menuAccess);
	}
	@RequestMapping(value="/getid/{id}",method=RequestMethod.GET)
	@ResponseBody
	public MasterMenuAccess getId(@PathVariable("id")int id) {
		MasterMenuAccess menuAccess=accessService.getId(id);
		return menuAccess;
	}
	@RequestMapping(value="/getall",method=RequestMethod.GET)
	@ResponseBody
	public List<MasterMenuAccess> getAllAccess(){
		return accessService.getAll();
	}
	@RequestMapping(value="/getcode",method=RequestMethod.GET)
	@ResponseBody
	public String getCode() {
		return accessService.getCode();
	}
	@RequestMapping(value="/update/{id}",method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable("id")int id,@RequestBody MasterMenuAccess menuAccess) {
		accessService.update(id,menuAccess);
	}
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void deleteAccess(@PathVariable("id")int id) {
		accessService.delete(id);
	}
	@RequestMapping(value="/getmenu",method=RequestMethod.GET)
	@ResponseBody
	public List<MasterMenu> getMenuByMenuAccess(MasterMenuAccess access){
		return accessService.getMenu();
		
	}
}
