package com.marcomm.controller;

import java.util.List;

import org.hibernate.mapping.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.bankmega.traning.service.EmployeeService;
import com.marcomm.model.MasterEmployee;
import com.marcomm.model.TransaksiEvent;
import com.marcomm.service.MasterEmployeeService;
import com.marcomm.service.TransaksiEventService;

@Controller
@RequestMapping("/event")
public class TransaksiEventController {
	
	@Autowired
	TransaksiEventService eventService;
	
	@Autowired
	MasterEmployeeService employeeService;
	
	@RequestMapping
	public String index(Model model) {
		List<GrantedAuthority> authorities2 = (List<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
		model.addAttribute("rolename", authorities2.get(0).getAuthority());

		List<MasterEmployee> allEmployee = employeeService.getAllEmployee();
		model.addAttribute("allEmployee", allEmployee);
		return "event";
	}
	
	//save data
	@RequestMapping(value="/saveevent", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void save(@RequestBody TransaksiEvent event) {
		eventService.saveEvent(event);
	}
	
	//get all data
	@RequestMapping(value="/getallevent", method = RequestMethod.GET)
	@ResponseBody
	public List<TransaksiEvent> getAllEvent(){
		List<TransaksiEvent> events = eventService.getAllService();
		return events;
	}
	
	//getcode
	@RequestMapping(value="/getcodeevent", method = RequestMethod.GET)
	@ResponseBody
	public String getCode() {
		return eventService.getCode();
	}
	
	//getid atau search
	@RequestMapping(value="/searchevent/{id}", method = RequestMethod.GET)
	@ResponseBody
	public TransaksiEvent getEventById(@PathVariable("id") int id) {
		TransaksiEvent event = eventService.getEventById(id);
		return event;
	}
	
	//update data
	@RequestMapping(value="/updateevent/{id}", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void update(@PathVariable("id") int id, @RequestBody TransaksiEvent event) {
		eventService.updateEvent(id, event);
	}
	
	//close event request
	@RequestMapping(value="/closeevent/{id}", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void close(@PathVariable("id") int id) {
		eventService.closeEvent(id);
	}

	
	//accept event request
	@RequestMapping(value="/acceptevent/{id}", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void accept(@PathVariable("id") int id, @RequestBody TransaksiEvent event) {
		eventService.acceptEvent(id, event);
	}
	
	//reject event request
	@RequestMapping(value="/rejectevent/{id}", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void reject(@PathVariable("id") int id, @RequestBody TransaksiEvent event) {
		eventService.rejectEvent(id, event);
	}
}
