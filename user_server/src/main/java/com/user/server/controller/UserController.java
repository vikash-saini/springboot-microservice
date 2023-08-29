package com.user.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.server.entity.ContactEntity;
import com.user.server.entity.UserEntity;
import com.user.server.serviceimpl.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserServiceImpl userServiceImpl;
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/")
	@ResponseBody
	public String name() {
		return " Thus is user Controller";
	}
	
	@GetMapping("/allusers")
	public List<UserEntity> getAllusers(){
		
		List<UserEntity> allusers = userServiceImpl.getallUsers();
		
		return allusers;
	}
	
	@GetMapping("/{id}")
	public UserEntity getuserById(@PathVariable("id") int id){
		
		UserEntity user = userServiceImpl.getUserById(id);
		
		List<ContactEntity> contacts = this.restTemplate.getForObject("http://contact-service/contact/user/"+user.getUserId(), List.class);
		
		System.out.println("Contact from microserver: "+ contacts.toString());
		
		user.setContacts(contacts);
		
		return user;
	}
	
	@PostMapping("/adduser")
	public UserEntity adduser(@RequestBody UserEntity user){
		System.out.println(user.toString());
		UserEntity newuser = userServiceImpl.addUser(user);
		
		return newuser;
	}
}
