package com.contact.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.contact.service.entity.ContactEntity;
import com.contact.service.serviceImpl.ContactServiceImpl;


@RestController
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	ContactServiceImpl cotactServiceImpl;
	
	@GetMapping("/")
	@ResponseBody
	public String name() {
		return "This is contact service";
	}
	
	@GetMapping("/allcontact")
	public List<ContactEntity> getAllContact(){
		
		List<ContactEntity> contacts = cotactServiceImpl.getallUsers();
		
		return contacts;
	}
	
	@GetMapping("/user/{id}")
	public List<ContactEntity> getuserById(@PathVariable("id") Long id){
		System.out.println("userId"+id);
		List c = cotactServiceImpl.getUserById(id);
		
		System.out.println(c.toString());
		
		return c;
	}
	
	@PostMapping("/adduser")
	public ContactEntity adduser(@RequestBody ContactEntity contact){
		System.out.println(contact.toString());
		ContactEntity newuser = cotactServiceImpl.addUser(contact);		
		return newuser;
	}

}
