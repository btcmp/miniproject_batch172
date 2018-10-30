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
	public void save(@RequestBody MasterProduct masterProduct) {
		productService.save(masterProduct);
	}
	
	@RequestMapping(value="/getcode",method=RequestMethod.GET)
	@ResponseBody
	public String getCode() {
		return productService.getCode();
	}
	
	@RequestMapping(value="/getall",method=RequestMethod.GET)
	@ResponseBody
	public List<MasterProduct> getAllProduct(){
		return productService.getAll();
	}
	@RequestMapping(value="/getbyid/{id}", method=RequestMethod.GET)
	@ResponseBody
	public MasterProduct getEmpById(@PathVariable("id") int id) {
		MasterProduct master = productService.getById(id);
		return master;
	}
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void deleteProduct(@RequestBody MasterProduct masterProduct) {
		System.out.println(masterProduct);
		productService.delete(masterProduct);
	}
}
