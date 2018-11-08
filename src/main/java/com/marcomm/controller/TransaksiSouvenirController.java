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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.portlet.ModelAndView;

import com.marcomm.model.FormSouvenir;
import com.marcomm.model.MasterEmployee;
import com.marcomm.model.MasterSouvenir;
import com.marcomm.model.TransaksiSouvenir;
import com.marcomm.model.TransaksiSouvenirItem;
import com.marcomm.service.MasterEmployeeService;
import com.marcomm.service.MasterSouvenirService;
import com.marcomm.service.TransaksiEventService;
import com.marcomm.service.TransaksiSouvenirItemService;
import com.marcomm.service.TransaksiSouvenirService;

@Controller
@RequestMapping("/transaksisouvenir")
public class TransaksiSouvenirController {
	
	@Autowired
	TransaksiSouvenirService transaksiSouvenirService;
	
	@Autowired
	TransaksiEventService transaksiEventService; 
	       
	@Autowired
	TransaksiSouvenirItemService transaksiSouvenirItemService;
	
	@Autowired
	MasterSouvenirService masterSouvenirService;
	
	@Autowired
	MasterEmployeeService masterEmployeeService;
	
	@RequestMapping
	
	public String index (Model model) {
		List<MasterSouvenir> souvenirs = masterSouvenirService.gelAllSouvenir();
		model.addAttribute("souvenirs", souvenirs);
		return "transaksi_souvenir";
	}
	
	/*SAVE --> ADD DATA*/
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseBody
	public TransaksiSouvenir save(@RequestBody TransaksiSouvenir transaksiSouvenir){
		transaksiSouvenirService.save(transaksiSouvenir);
		return transaksiSouvenir;
	}
	
	/*GET ALL TRANSAKSI SOUVENIR*/ 
	public List<TransaksiSouvenir> getAll(){
		List<TransaksiSouvenir> souvenirs = transaksiSouvenirService.getAll();
		return souvenirs; 
	}
	
	/*GET BY ID*/
	@RequestMapping(value="/getbyid/{id}", method=RequestMethod.GET) 
	@ResponseBody
	public TransaksiSouvenir getTransaksiSouvenir(@PathVariable("id") int id) {
		return transaksiSouvenirService.getTransaksiSouvenir(id);
	}
	
	/*UPDATE*/
	@RequestMapping(value="/update", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void updateTransSouvenir(@RequestBody TransaksiSouvenir transaksiSouvenir) {
		transaksiSouvenirService.updateTransSouvenir(transaksiSouvenir);
	}
	
	/*DELETE*/
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void deleteTranSouvenir(@PathVariable("id") int id) {
		transaksiSouvenirService.deleteTransSouvenir(id);
	}
	
	/*GET CODE*/
	@RequestMapping(value="/getcode", method=RequestMethod.GET)
	@ResponseBody
	public String getCodeTrans() {
		return transaksiSouvenirService.getCodeTrans();
	}
	
	/*GET ALL EMPLOYEE*/
	@RequestMapping(value="/getallemployee", method=RequestMethod.GET)
	@ResponseBody
	public List<MasterEmployee> getAllEmployee(){
		return masterEmployeeService.getAllEmployee();
	}
}
