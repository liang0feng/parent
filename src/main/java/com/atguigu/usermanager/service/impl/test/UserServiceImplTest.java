package com.atguigu.usermanager.service.impl.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.atguigu.usermanager.pojo.User;
import com.atguigu.usermanager.service.UserService;

@ContextConfiguration(locations= {
		"classpath:spring/applicationContext-dao.xml",
		"classpath:spring/applicationContext.xml"
})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceImplTest {
	
	@Autowired
	UserService userService;

	@Test
	public void testSelectOne() {
		System.out.println(userService);
		User selectOne = userService.selectOne(1L);
		System.out.println(selectOne);
	}

}
