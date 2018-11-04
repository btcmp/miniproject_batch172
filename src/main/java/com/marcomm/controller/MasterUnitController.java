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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.marcomm.model.MasterUnit;
import com.marcomm.service.MasterUnitService;
 

@Controller
@RequestMapping("/unit")
public class MasterUnitController {
	
	@Autowired
	MasterUnitService masterUnitService;
	 
	//Welcome Message
	@RequestMapping
	public String index(Model model) {
		List<MasterUnit> masterUnits = masterUnitService.getAllUnit();
		model.addAttribute("masterunits", masterUnits);
		return "master_unit";
	} 
	
	//save data
	@RequestMapping(value = "/save", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void saveMasterUnit(@RequestBody MasterUnit masterUnit) {
		masterUnitService.saveMasterUnit(masterUnit);
	}
	
	//get unit by id
	@RequestMapping(value="/getbyid/{id}", method=RequestMethod.GET)
	@ResponseBody
	public MasterUnit getUnitById(@PathVariable("id") int id) {
		MasterUnit masterUnit = masterUnitService.getUnitById(id);
		return masterUnit;
	}
	
	// get all data
	@RequestMapping(value="/getallunit", method=RequestMethod.GET)
	@ResponseBody
	public List<MasterUnit> getAllUnit(){
		return masterUnitService.getAllUnit();
	}
	
	// delete unit
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void deleteUnit(@PathVariable("id") int id) {
		masterUnitService.deleteUnit(id);
	}
	
	//update unit
	@RequestMapping(value="/update", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void updateUnit(@RequestBody MasterUnit masterUnit) {
		masterUnitService.updateUnit(masterUnit);
	}
	
	//get code
	@RequestMapping(value="/getcode", method=RequestMethod.GET)
	@ResponseBody
	public String getCode() {
		return masterUnitService.getCode();
	}
	//get by name
	@RequestMapping(value="/getbyname/{name}", method=RequestMethod.GET)
	@ResponseBody
	public List<MasterUnit> getByName(@PathVariable("name") String name){
		
		return masterUnitService.getByName(name);
	}
	
	
}
