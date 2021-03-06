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
import com.marcomm.model.MasterRole;
import com.marcomm.service.MasterMenuAccessService;

@Controller
@RequestMapping("/access")
public class MasterMenuAccessController {

	@Autowired
	MasterMenuAccessService accessService;
	
	@RequestMapping
	public String index(Model model) {
		List<MasterMenu> masterMenus= accessService.getMenu();
		List<MasterRole> masterRoles= accessService.getRole();
		model.addAttribute("masterMenus", masterMenus);
		model.addAttribute("masterRoles", masterRoles);
		return "menuaccess";
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	@ResponseBody
	public MasterMenuAccess save(@RequestBody MasterMenuAccess menuAccess) {
		/*System.out.println(menuAccess);*/
		accessService.save(menuAccess);
		return menuAccess;
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
	@RequestMapping(value="/getrole",method=RequestMethod.GET)
	@ResponseBody
	public List<MasterRole>getRoleByMenuAccess(MasterMenuAccess access){
		return accessService.getRole();
	}
	@RequestMapping(value="/getmenuaccess/{id}",method=RequestMethod.GET)
	@ResponseBody
	public MasterMenuAccess getMenuAccess(@PathVariable int id){
		
		return accessService.getMenuAccess(id);
	}
	@RequestMapping(value="/getmenurole/{id}",method=RequestMethod.GET)
	@ResponseBody
	public MasterMenuAccess getMenuRole(@PathVariable int id) {
		return accessService.getMenuRole(id);
		
	}
	
}
