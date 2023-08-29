package com.user.server.entity;

import java.util.List;

public class UserEntity {

	public Long userId;
	
	public String name;
	
	public int age;
	
	public List<ContactEntity> contacts;

	public UserEntity(long id, String name, int age, List<ContactEntity> contacts) {
		// TODO Auto-generated constructor stub
		this.userId = id;
		this.name = name;
		this.age = age;
		this.contacts = contacts;
	}
	
	public UserEntity(long id, String name, int age) {
		// TODO Auto-generated constructor stub
		this.userId = id;
		this.name = name;
		this.age = age;		
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<ContactEntity> getContacts() {
		return contacts;
	}

	public void setContacts(List<ContactEntity> contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
}
