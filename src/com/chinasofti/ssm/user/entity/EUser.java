package com.chinasofti.ssm.user.entity;


public class EUser {
	private Integer uid;
	private String usernameString;
	private String passwordString;
	
	
	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUsernameString() {
		return usernameString;
	}

	public void setUsernameString(String usernameString) {
		this.usernameString = usernameString;
	}

	public String getPasswordString() {
		return passwordString;
	}

	public void setPasswordString(String passwordString) {
		this.passwordString = passwordString;
	}

	@Override
	public String toString() {
		return "EUser [uid=" + uid + ", usernameString=" + usernameString
				+ ", passwordString=" + passwordString + "]";
	}

	public EUser(Integer uid, String usernameString, String passwordString) {
		super();
		this.uid = uid;
		this.usernameString = usernameString;
		this.passwordString = passwordString;
	}

	public EUser(String usernameString, String passwordString) {
		super();
		this.usernameString = usernameString;
		this.passwordString = passwordString;
	}

	public EUser() {
		super();
	}

}
