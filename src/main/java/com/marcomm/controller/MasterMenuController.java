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

import com.marcomm.model.MasterMenu;
import com.marcomm.service.MasterMenuService;

@Controller
@RequestMapping("/menu")
public class MasterMenuController {

	@Autowired
	MasterMenuService menuService;
	
	@RequestMapping
	public String index() {
		return "menu";
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void save(@RequestBody MasterMenu masterMenu) {
		menuService.save(masterMenu);	
	}
	@RequestMapping(value="/getid/{id}",method=RequestMethod.GET)
	@ResponseBody
	public MasterMenu getId(@PathVariable("id")int id) {
		MasterMenu masterMenu=menuService.getId(id);
		return masterMenu;
	}
	@RequestMapping(value="/getall",method=RequestMethod.GET)
	@ResponseBody
	public List<MasterMenu> getAllMenu(){
		return menuService.getAll();
	}
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void deleteMenu(@PathVariable ("id")int id) {
		menuService.delete(id);
	}
	@RequestMapping(value="/update/{id}",method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable("id")int id, @RequestBody MasterMenu masterMenu) {
		menuService.update(id,masterMenu);	
	}
	@RequestMapping(value="/getcode",method=RequestMethod.GET)
	@ResponseBody
	public String getCode() {
		return menuService.getCode();
		
	}
	
}
