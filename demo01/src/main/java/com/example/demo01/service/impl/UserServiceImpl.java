package com.example.demo01.service.impl;/**
 * @创建人:YH
 * @创建时间:2019/12/10
 * @描述:
 */

import com.example.demo01.dao.UserMapper;
import com.example.demo01.pojo.User;
import com.example.demo01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName UserServiceImpl
 *@Author huaYan
 *@Date 2019/12/10 23:01
 *@Version 1.0
 *@desc
 **/
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}
}
