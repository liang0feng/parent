package com.atguigu.usermanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.usermanager.pojo.User;
import com.atguigu.usermanager.service.UserService;

@RequestMapping("user")
@Controller
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping(value="{id}",method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<User> selectOne(@PathVariable("id") Long id){
		System.out.println("controller");
		try {
			User user = userService.selectOne(id);
			return ResponseEntity.status(HttpStatus.OK).body(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	}
}
