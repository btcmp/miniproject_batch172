package com.marcomm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.marcomm.model.Event;
import com.marcomm.model.MasterProduct;
import com.marcomm.service.EventService;
import com.marcomm.service.MasterProductService;
import com.marcomm.service.TransaksiDesignService;

@Controller
@RequestMapping("/design")
public class TransaksiDesignController {
	
	@Autowired
	MasterProductService masterProductService;
	@Autowired
	EventService eventService;
	@Autowired
	TransaksiDesignService transaksiDesignService;
	@RequestMapping
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("transaksidesign");
		List<MasterProduct> products = masterProductService.getAll();
		List<Event> events = eventService.getAllService();
		modelAndView.addObject("events", events);
		modelAndView.addObject("products", products);
		return modelAndView;
	}
	
	@RequestMapping(value="/getcode",method=RequestMethod.GET)
	@ResponseBody
	public String getCode() {
		return transaksiDesignService.getCodeById();
	}
}
