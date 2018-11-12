package com.marcomm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marcomm.model.MasterEmployee;
import com.marcomm.model.MasterUser;
import com.marcomm.service.MasterEmployeeService;

@Controller
@RequestMapping("/employee")
public class MasterEmployeeController {

	@Autowired
	MasterEmployeeService employeeService;
	
	@RequestMapping(value="/getemployeesnotuse",method=RequestMethod.GET)
	@ResponseBody
	public List<MasterEmployee> getEmployeeNotUse(){
		 List<MasterEmployee> employeesNoUse= employeeService.getEmployeesNotInUser();
		 return employeesNoUse;
	}
		 
}
  