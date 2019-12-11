package com.example.demo01.controller;/**
 * @创建人:YH
 * @创建时间:2019/12/10
 * @描述:
 */

import com.example.demo01.pojo.User;
import com.example.demo01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *@ClassName UserController
 *@Author huaYan
 *@Date 2019/12/10 23:02
 *@Version 1.0
 *@desc
 **/
@RestController
public class UserController {

	@Autowired
	UserService userService;


	@RequestMapping("/findAll")
	public List<User> findAll(){

		return userService.findAll();

	}

}
