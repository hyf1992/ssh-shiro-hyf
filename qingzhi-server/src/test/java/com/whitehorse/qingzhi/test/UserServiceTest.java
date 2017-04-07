package com.whitehorse.qingzhi.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.whitehorse.qingzhi.entity.User;
import com.whitehorse.qingzhi.service.UserService;
import com.whitehorse.qingzhi.shiro.spring.SpringUtils;

/**
* @author hyf
* @date 2017年4月5日
* @description 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-hibernate.xml")
public class UserServiceTest {
	@Autowired
	private UserService userService;
	@Test
	public void testFindUserByName(){
		
		User user = userService.findByUsername("admin");
		System.out.println(user);
	}
}
