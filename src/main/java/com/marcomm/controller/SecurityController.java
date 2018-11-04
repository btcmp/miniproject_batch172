package com.marcomm.controller;
 
import java.security.Principal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
 
/**
 *
 * @author Agung Setiawan
 */
@Controller
@RequestMapping("/login")
public class SecurityController {
    
	@RequestMapping
	
	public String doLogin(Model model, @RequestParam(value="error", required=false) String error, @RequestParam(value="logout", required=false) String logout){
		if(error != null){
			model.addAttribute("error", "user or password invalid..");
		} 
		if(logout != null){
			model.addAttribute("logout", "anda baru saja keluar..");
		}

		return "security/login2";
	} 
    
}