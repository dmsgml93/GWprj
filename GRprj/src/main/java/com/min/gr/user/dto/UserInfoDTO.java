package com.min.gr.user.dto;

public class UserInfoDTO {

	String user_id;
	String user_type;
	String user_email;
	String user_phone;
	String user_name;
	String user_address;
	String user_gender;
	String user_birth;
	String user_eagree;

	
	public UserInfoDTO(String user_id, String user_type, String user_email, String user_phone, String user_name,
			String user_address, String user_gender, String user_birth, String user_eagree) {
		super();
		this.user_id = user_id;
		this.user_type = user_type;
		this.user_email = user_email;
		this.user_phone = user_phone;
		this.user_name = user_name;
		this.user_address = user_address;
		this.user_gender = user_gender;
		this.user_birth = user_birth;
		this.user_eagree = user_eagree;
	}


	public UserInfoDTO() {
	}


	public String getUser_id() {
		return user_id;
	}


	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}


	public String getUser_type() {
		return user_type;
	}


	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}


	public String getUser_email() {
		return user_email;
	}


	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}


	public String getUser_phone() {
		return user_phone;
	}


	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}


	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	public String getUser_address() {
		return user_address;
	}


	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}


	public String getUser_gender() {
		return user_gender;
	}


	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}


	public String getUser_birth() {
		return user_birth;
	}


	public void setUser_birth(String user_birth) {
		this.user_birth = user_birth;
	}


	public String getUser_eagree() {
		return user_eagree;
	}


	public void setUser_eagree(String user_eagree) {
		this.user_eagree = user_eagree;
	}


	
	@Override
	public String toString() {
		return "userDto [user_id=" + user_id + ", user_type=" + user_type + ", user_email=" + user_email
				+ ", user_phone=" + user_phone + ", user_name=" + user_name + ", user_address=" + user_address
				+ ", user_gender=" + user_gender + ", user_birth=" + user_birth + ", user_eagree=" + user_eagree + "]";
	}
}
