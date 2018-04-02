package com.bankmega.traning.controller;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.bankmega.traning.model.User;

import antlr.collections.List;

@Controller
public class PDFController {

   @RequestMapping(value = "/generate/output", method = RequestMethod.GET)
   ModelAndView generatePdf(HttpServletRequest request,
     HttpServletResponse response) throws Exception {
    System.out.println("Calling generatePdf()...");
      //user data
    response.setHeader("Content-Disposition", "attachment; filename=\"users.pdf\"");
    response.setContentType("application/pdf");
     java.util.List<User> users = new ArrayList();
      User user = new User();
      user.setUsername("arrizaqu@yahoo.com");
      users.add(user);
      users.add(user);
      users.add(user);
      
      return new ModelAndView("UserSummary","users",users);
   }
}