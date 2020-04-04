package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.UserBean;
import com.dao.UserDao;

@RestController
public class UserController {

	@Autowired
	UserDao userDao;
	
	@PostMapping(value="/addUser")
	public String addUser(UserBean userBean)
	{		System.out.println(userBean.getFname());
			userDao.insertUser(userBean);
			return "user added";
		
	}
	
	@GetMapping("/users")
	public ArrayList<UserBean> listUsers() {
		return userDao.listUsers();
	}
	
}
