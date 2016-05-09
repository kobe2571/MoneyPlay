package com.moneyplay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.moneyplay.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController 
{
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
	public List<String> getAllUsersController()
	{
		return userService.getAllUsersService();
	}
}
