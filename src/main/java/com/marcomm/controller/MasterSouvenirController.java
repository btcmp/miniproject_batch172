package com.marcomm.controller;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.bankmega.traning.model.Department;
import com.bankmega.traning.model.Employee;
import com.marcomm.model.MasterSouvenir;
import com.marcomm.model.MasterUnit;
import com.marcomm.service.MasterSouvenirService;
import com.marcomm.service.MasterUnitService;

@Controller
@RequestMapping(value="/souvenir")
public class MasterSouvenirController {
	
	@Autowired
	MasterSouvenirService masterSouvenirService;
	@Autowired
	MasterUnitService masterUnitService;
	
	/*@ModelAttribute
	public MasterSouvenir getSouvenirForm() {
		return new MasterSouvenir();
	}*/
	
	
	@RequestMapping
	public String index(Model model){
		List<MasterSouvenir> masterSouvenirs= masterSouvenirService.gelAllSouvenir();
		List<MasterUnit> masterUnits = masterUnitService.getAllUnit();
		model.addAttribute("souvenirs", masterSouvenirs);
		model.addAttribute("units", masterUnits);
		return "souvenir";
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void save(@RequestBody MasterSouvenir masterSouvenir) {
		masterSouvenirService.save(masterSouvenir);
	}
	
	@RequestMapping(value="/getcode",method=RequestMethod.GET)
	@ResponseBody
	public String getCode() {
		return masterSouvenirService.getCode();
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)//ok
	@ResponseBody
	public List<MasterSouvenir> getAllSouvenir(){
		return masterSouvenirService.gelAllSouvenir();
	}
	
	@RequestMapping(value="/getbyid/{id}", method=RequestMethod.GET)//id ok
	@ResponseBody
	public MasterSouvenir getSouvenirById(@PathVariable("id") int id) {
		MasterSouvenir souvenir= masterSouvenirService.getSouvenirById(id);
		return souvenir;
	}
	@RequestMapping(value="/update", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void update(@RequestBody MasterSouvenir masterSouvenir) {
		masterSouvenirService.update(masterSouvenir);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)//id belum bisa
	@ResponseStatus(HttpStatus.OK)
	public void updateDelete(@RequestBody MasterSouvenir masterSouvenir) {
		System.out.println(masterSouvenir);
		masterSouvenirService.updateDelete(masterSouvenir);
	}
	
	/*s
	@RequestMapping(value="/getbynameunit/{name}", method=RequestMethod.GET)
	@ResponseBody
	public List<MasterUnit> getByNameUnit(@PathVariable("name") String name) {
		return masterSouvenirService.getByNameUnit(name);
*/
	@RequestMapping(value="/getbyname/{name}", method=RequestMethod.GET)
	@ResponseBody
	public List<MasterSouvenir> getByName(@PathVariable("name") String name){
		return masterSouvenirService.getByName(name);
		
	}
	
	public List<MasterUnit> getAllUnit(){
		return masterUnitService.getAllUnit();
	}
}
