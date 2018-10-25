package com.marcomm.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.marcomm.model.MasterUnit;
import com.marcomm.service.MasterUnitService;

@Controller
@RequestMapping("/masterunit")
public class MasterUnitController {
	
	@Autowired
	MasterUnitService masterUnitService;
	
	//coba
	@RequestMapping
	@ResponseBody
	public String index() {
		return "Selamat Datang !!";
	} 
	
	//save data
	@RequestMapping(value = "/save", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void saveMasterUnit(@RequestBody MasterUnit masterUnit) {
		//set date
		Date date = new Date();
		masterUnit.setCreatedDate(date);
		masterUnit.setUpdatedDate(date);
		masterUnitService.saveMasterUnit(masterUnit);
	}
}
