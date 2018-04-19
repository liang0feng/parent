package com.atguigu.usermanager.mapper.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.atguigu.usermanager.mapper.UserMapper;
import com.atguigu.usermanager.pojo.User;

@ContextConfiguration(locations= {
		"classpath:spring/applicationContext-dao.xml",		
		"classpath:spring/applicationContext.xml"
		})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserMapperTest {

	@Autowired
	UserMapper usermapper;
	@Autowired
	User user;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSelectOne() {
		System.out.println("dfad");
		List<User> list = usermapper.select(null);
		for (User user : list) {
			System.out.println(user);
		}
	}

	@Test
	public void testSelect() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsert() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertSelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectCountByExample() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteByExample() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByExample() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByExampleSelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByExample() {
		fail("Not yet implemented");
	}

}
