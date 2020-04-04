package com.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.bean.UserBean;

@Repository
public class UserDao {

	ArrayList<UserBean> users = new ArrayList<>();
	
	public void insertUser(UserBean userBean)
	{
		users.add(userBean);
	}

	public ArrayList<UserBean> listUsers() {
		
		
		return users;
	}
	
}
