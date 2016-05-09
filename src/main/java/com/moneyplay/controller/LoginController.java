package com.moneyplay.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.moneyplay.model.UserModel;
import com.moneyplay.service.LoginService;

@Controller
@RequestMapping(value = "/login")
public class LoginController
{
	@RequestMapping(value = "/userLogin", method = RequestMethod.POST)
	public List<String> userLoginController(@RequestBody UserModel user)
	{
		return null;
	}
}
