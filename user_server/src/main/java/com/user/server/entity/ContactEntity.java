package com.user.server.entity;

public class ContactEntity {

	private Long cid;
	private String email;
	private String mobile;
	private Long userId;
	
	public ContactEntity(Long cid, String emaill, String mobile, Long userId) {
		super();
		this.cid = cid;
		this.email = emaill;
		this.mobile = mobile;
		this.userId = userId;
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getEmaill() {
		return email;
	}

	public void setEmaill(String emaill) {
		this.email = emaill;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
	
	
	
}
