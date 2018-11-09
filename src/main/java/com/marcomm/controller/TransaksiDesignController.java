package com.marcomm.controller;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.marcomm.model.MasterProduct;
import com.marcomm.model.MasterUser;
import com.marcomm.model.TransaksiDesign;
import com.marcomm.model.TransaksiDesignItem;
import com.marcomm.model.TransaksiEvent;
import com.marcomm.service.MasterProductService;
import com.marcomm.service.TransaksiDesignService;
import com.marcomm.service.TransaksiEventService;

@Controller
@RequestMapping("/design")
public class TransaksiDesignController {
	
	@Autowired
	MasterProductService masterProductService;
	@Autowired
	TransaksiEventService eventService;
	@Autowired
	TransaksiDesignService transaksiDesignService;
	
	ServletContext servletContext;
	@RequestMapping
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("transaksidesign");
		List<MasterProduct> products = masterProductService.getAll();
		List<TransaksiEvent> events = eventService.getAllService();
		modelAndView.addObject("events", events);
		modelAndView.addObject("products", products);
		return modelAndView;
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	@ResponseBody
	public TransaksiDesign save(@RequestBody TransaksiDesign transaksiDesign) {
		transaksiDesignService.save(transaksiDesign);
		return transaksiDesign;
	}

	@RequestMapping(value="/getcode",method=RequestMethod.GET)
	@ResponseBody
	public String getCode() {
		return transaksiDesignService.getCodeById();
	}
	@RequestMapping(value="/getrequestby",method=RequestMethod.GET)
	@ResponseBody
	public MasterUser getRequestBy() {
		return transaksiDesignService.getRequestBy();
	}
	
	@RequestMapping(value="/getevent",method=RequestMethod.GET)
	@ResponseBody
	public List<TransaksiEvent> getEvent(){
		return transaksiDesignService.getEventAvailable();
	}
	
	@RequestMapping(value="/getall",method=RequestMethod.GET)
	@ResponseBody
	public List<TransaksiDesign> getAll(){
		List<TransaksiDesign> designs = transaksiDesignService.getAll();
		return designs;
	}
	
	@RequestMapping(value="/getdesignbyid/{id}",method=RequestMethod.GET)
	@ResponseBody
	public TransaksiDesign getDesignById(@PathVariable("id") int id) {
		return transaksiDesignService.getById(id);
	}
	
	@RequestMapping(value="/getitembyid/{id}",method=RequestMethod.GET)
	@ResponseBody
	public TransaksiDesignItem getItemById(@PathVariable("id") int id) {
		return transaksiDesignService.getByIdItem(id);
	}
	
	@RequestMapping(value="/getitembydesignid/{id}",method=RequestMethod.GET)
	@ResponseBody
	public List<TransaksiDesignItem> getItemByDesignId(@PathVariable("id") int id){
		return transaksiDesignService.getItemByDesignId(id);
	}
	
	@RequestMapping(value="/upload",method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void upload(@RequestParam("file") CommonsMultipartFile[] files) {
		
		try {
			for (CommonsMultipartFile file : files) {
				byte[] bytes = file.getBytes();
				Path path =Paths.get("H://Bootcamp//UploadFile//"+file.getOriginalFilename());
				Files.write(path, bytes);
			}			
		} catch (Exception e) {
		}
	}
	
	
//	KOLOM ANGGI
	@RequestMapping(value="/update",method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void update(@RequestBody TransaksiDesign transaksiDesign) {
	transaksiDesignService.update(transaksiDesign);
		 
	}
}
