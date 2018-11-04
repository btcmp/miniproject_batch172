package com.marcomm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.marcomm.model.Event;
import com.marcomm.service.EventService;

@Controller
@RequestMapping("/event")
public class EventController {
	
	@Autowired
	EventService eventService;
	
	@RequestMapping
	public String index() {
		return "event";
	}
	
	//save data
	@RequestMapping(value="/saveevent", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void save(@RequestBody Event event) {
		eventService.saveEvent(event);
	}
	
	//get all data
	@RequestMapping(value="/getallevent", method = RequestMethod.GET)
	@ResponseBody
	public List<Event> getAllEvent(){
		List<Event> events = eventService.getAllService();
		return events;
	}
	
	//getcode
	@RequestMapping(value="/getcodeevent", method = RequestMethod.GET)
	@ResponseBody
	public String getCode() {
		return eventService.getCode();
	}
}
