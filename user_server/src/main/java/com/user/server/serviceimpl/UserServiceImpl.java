package com.user.server.serviceimpl;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.user.server.entity.ContactEntity;
import com.user.server.entity.UserEntity;

@Component
public class UserServiceImpl {

	public	static List<UserEntity> userList = new ArrayList<>();
	
	public	static List<ContactEntity> contact = new ArrayList<>();
		 
	 static {
//		 contact.add(new ContactEntity(132L,"vikas@gmail.com","4541366",13L));
		 userList.add(new UserEntity(13L,"vikas",25));
		 userList.add(new UserEntity(14L,"vidhi",25));
	 }
		
	
	public List<UserEntity> getallUsers(){
		
		return userList;
	}
	
	public UserEntity getUserById(int id){
		
		UserEntity filteredUser =	userList.stream().filter(obj->obj.getUserId() ==id).findFirst().get();
		
		
		return filteredUser;
	}
	
	public UserEntity addUser(UserEntity user){
		System.out.println(user.toString());
		userList.add(user);
		System.out.println("useradded");
		return user;
	}
}
