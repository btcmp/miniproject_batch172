package com.bankmega.traning.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bankmega.traning.dao.DepartmentDao;
import com.bankmega.traning.model.Department;
import com.bankmega.traning.model.Employee;
import com.bankmega.traning.model.User;
import com.bankmega.traning.service.DepartmentService;

@Controller
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;
	
	@Autowired
	private HttpSession httpSession;
	
	@ModelAttribute("deptForm")
	public Department deptForm(){
		return new Department();
	}
	
	@RequestMapping
	public String index(Model model){
		//User applicationUser =  (User) httpSession.getAttribute("application-user");
		//System.out.println("application username : "+ applicationUser.getUsername());
		List<Department> departments = departmentService.getAllDepartments();
		model.addAttribute("departments", departments);
		return "department";
	}
	
	//do save
		@RequestMapping(value="/dosave", method=RequestMethod.POST)
		public String save(@Valid @ModelAttribute("deptForm") Department department, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes){

			if(bindingResult.hasErrors()){
				List<Department> departments = departmentService.getAllDepartments();
				model.addAttribute("departments", departments);
				return "department";
			}
			departmentService.save(department);
			
			redirectAttributes.addFlashAttribute("message", "Department berhasil ditambahkan");
			return "redirect:/department";
		}
	
		//delete hapus
		@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
		@ResponseStatus(HttpStatus.OK)
		public void delete(@PathVariable int id){
			departmentService.delete(id);
		}
		
		//export data to PDF or XLS
		@RequestMapping(value = "/export", method = RequestMethod.GET)
		public ModelAndView generatePdf(@RequestParam(value="output", defaultValue="") String output, HttpServletResponse response) throws Exception {
			
		    if(output.equalsIgnoreCase("xls")) {
		    	System.out.println("Calling generate XLS...");
			    List<Department> departments = departmentService.getAllDepartments();		      
			    return new ModelAndView("departmentXlsView","departments",departments);
		    } else {
		    	System.out.println("Calling generatePdf()...");
		    	response.setHeader("Content-Disposition", "attachment; filename=\"department.pdf\"");
			    response.setContentType("application/pdf");
			    List<Department> departments = departmentService.getAllDepartments();		      
			    return new ModelAndView("departmentPdfView","departments",departments);
		    }
		 }
}
