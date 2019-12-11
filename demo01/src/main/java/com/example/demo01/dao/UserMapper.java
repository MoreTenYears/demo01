package com.example.demo01.dao;

import com.example.demo01.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @创建人:YH
 * @创建时间:2019/12/10
 * @描述:
 */
@Repository
@Mapper
public interface UserMapper {

  List<User> findAll();

}
