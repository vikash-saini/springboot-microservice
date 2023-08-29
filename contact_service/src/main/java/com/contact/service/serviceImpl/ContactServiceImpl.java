package com.contact.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.contact.service.entity.ContactEntity;


@Component
public class ContactServiceImpl {

	
	public	static List<ContactEntity> contact = new ArrayList<>();
	 
	 static {
		 contact.add(new ContactEntity(132L,"vikas@gmail.com","4541366",13L));		
	 }
		
	
	public List<ContactEntity> getallUsers(){
		
		return contact;
	}
	
	public List<ContactEntity> getUserById(Long id){
		
		List filteredUser =contact.stream().filter(obj->obj.getUserId().equals(id)).collect(Collectors.toList());
		System.out.println(filteredUser);
		return filteredUser;
	}
	
	public ContactEntity addUser(ContactEntity c){
		System.out.println(c.toString());
		contact.add(c);
		System.out.println("ContactAdded");
		return c;
	}
}
