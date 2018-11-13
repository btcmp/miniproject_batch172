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

import com.marcomm.model.MasterCompany;
import com.marcomm.model.MasterUser;
import com.marcomm.service.MasterCompanyService;

@Controller
@RequestMapping("/company")
public class MasterCompanyController {

	@Autowired
	MasterCompanyService companyService;
	
	@RequestMapping
	public String index() {
		return "company";
	}
	
	//save data
	@RequestMapping(value="/savecompany", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void save(@RequestBody MasterCompany company) {
		companyService.saveCompany(company);
		
	}
	
	//getall data
	@RequestMapping(value="/getallcompany", method = RequestMethod.GET)
	@ResponseBody
	public List<MasterCompany> getAllCompany (){
		List<MasterCompany> companies = companyService.getAllService();
		return companies;
	}
	
	//getcode
	@RequestMapping(value="/getcodecompany", method = RequestMethod.GET)
	@ResponseBody
	public String getCode() {
		return companyService.getCode();
	}
	
	//getid atau search
	@RequestMapping(value="/searchcompany/{id}", method = RequestMethod.GET)
	@ResponseBody
	public MasterCompany getCompanyById(@PathVariable("id") int id) {
		MasterCompany company = companyService.getCompanyById(id);
		return company;
	}
	
	//getbyname
	@RequestMapping(value="/searchnamecompany/{name}", method = RequestMethod.GET)
	@ResponseBody
	public List<MasterCompany> getCompanyByName(@PathVariable("name") String name){
		return companyService.getCompanyByName(name);
	}
	
	//update data
	@RequestMapping(value="/updatecompany/{id}", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void update(@PathVariable("id") int id, @RequestBody MasterCompany company) {
		companyService.update(id, company);
	}
	
	//delete data
	@RequestMapping(value="/deletecompany/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable("id") int id) {
		companyService.delete(id);
	}
	
	//getuser to get role id, role name, employee id, employee name, username
	@RequestMapping(value="/getuser", method = RequestMethod.GET)
	@ResponseBody
	public MasterUser getUser() {
		return companyService.getUser();
	}
}
