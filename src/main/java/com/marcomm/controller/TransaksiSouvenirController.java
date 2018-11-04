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

import com.marcomm.model.TransaksiSouvenir;
import com.marcomm.service.TransaksiSouvenirService;

@Controller
@RequestMapping("/transaksisouvenir")
public class TransaksiSouvenirController {
	
	@Autowired
	TransaksiSouvenirService transaksiSouvenirService;
	
	@RequestMapping
	@ResponseBody
	public String index() {
		return "selamat datang di transaksi souvenir rev1";
	}
	
	/*SAVE*/
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void saveTransaksiSouvenir (@RequestBody TransaksiSouvenir transaksiSouvenir) {
		transaksiSouvenirService.saveTransaksiSouvenir(transaksiSouvenir);
	}
	
	/*GET ALL*/ 
	@RequestMapping(value="/getall", method=RequestMethod.GET)
	@ResponseBody
	public List<TransaksiSouvenir> getAllTransaksiSouvenir(){
		return transaksiSouvenirService.getAllTransaksiSouvenir();
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
}
