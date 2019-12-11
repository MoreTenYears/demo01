package com.example.demo01.pojo;/**
 * @创建人:YH
 * @创建时间:2019/12/10
 * @描述:
 */

import java.io.Serializable;

/**
 *@ClassName User
 *@Author huaYan
 *@Date 2019/12/10 22:54
 *@Version 1.0
 *@desc
 **/
public class User implements Serializable {

	private Integer id;

	private String username;

	private String password;

	private String address;

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", address='" + address + '\'' +
				'}';
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
