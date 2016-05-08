package com.moneyplay.service;

import com.moneyplay.model.UserModel;

public class LoginService 
{
	public String userLoginService(UserModel user)
	{
		return user.getUserName();
	}
}
