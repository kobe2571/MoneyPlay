package com.moneyplay.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moneyplay.mapper.UserMapper;
import com.moneyplay.service.UserService;

@Service
public class UserServiceImpl implements UserService 
{
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<String> getAllUsersService() 
	{
		List<String> userList = new ArrayList<String>();
		
		try
		{
			userList = userMapper.getAllUsers();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return userList;
	}
}
