package com.marcomm.service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bankmega.traning.dao.UserDao;
import com.marcomm.dao.MasterUserDao;
import com.marcomm.dao.MasterUserDaoImpl;
import com.marcomm.model.MasterRole;
import com.marcomm.model.MasterUser;

@Service
@Transactional

public class FungsiService {

	public static String getUserLog() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			String username = ((UserDetails) principal).getUsername();
			return username;
		} else {
			String username = principal.toString();
			return username;
		}

	}
	
	
	

	/*public static String getRole() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		MasterUserDaoImpl userDao = new MasterUserDaoImpl();
		List<MasterUser> users = userDao.getAll();

		String username = new String();
		String role = new String();
		
		if (principal instanceof UserDetails) {
			username = ((UserDetails) principal).getUsername();

		} else {
			username = principal.toString();
		}

		for (MasterUser user : users) {
			if (user.getUsername().equals(username)) {
				role = user.getmRole().getRoleName();
			} else {
				role = "AdministratorZ";
			}
		}
		return role;

	}*/

	 
}
