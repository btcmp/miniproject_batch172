package com.marcomm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.marcomm.model.MasterProduct;
import com.marcomm.service.MasterProductService;

@Controller
@RequestMapping("/product")
public class MasterProductController {
	
	@Autowired
	MasterProductService productService;
	
	@RequestMapping
	public String index() {
		return "product";
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void save(@RequestBody MasterProduct master) {
		productService.save(master);
	}
	
	@RequestMapping(value="/getcode",method=RequestMethod.GET)
	@ResponseBody
	public String getCode() {
		return productService.getCode();
	}
}
