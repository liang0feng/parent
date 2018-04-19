package com.atguigu.usermanager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.usermanager.mapper.UserMapper;
import com.atguigu.usermanager.pojo.User;
import com.atguigu.usermanager.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	
	@Override
	public User selectOne(Long id) {
		return userMapper.selectByPrimaryKey(1);
	}

}
