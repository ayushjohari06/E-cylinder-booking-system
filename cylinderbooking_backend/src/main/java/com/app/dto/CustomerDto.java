package com.app.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.app.pojos.Login;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


//@Getter
//@Setter
@ToString
public class CustomerDto {
	
	@NotBlank(message = "name must be req")
	private String fullName;
	
	@NotBlank(message = "user name must be requerd")
	private String userName;
	
	
	@NotBlank(message = "password must be reqired")
	private String password;
	
	@NotBlank(message = "mob number must be requerd")
	private String mobileNumber;
	
	@NotBlank(message = "email must be requerd")
	@Email
	private String email;
	
	@NotBlank(message = "aadhar card must be requerd")
	private String aadharCard;
	
	@NotBlank(message = "address must be requerd")
	private String address;
	
	@NotBlank(message = "city must be requerd")
	private String city;
	
	@Pattern(regexp = "(domestic|industrial" ,message = "Option must be domestic or industrial")
	private String cylinderType;
	
	private Login login;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCylinderType() {
		return cylinderType;
	}

	public void setCylinderType(String cylinderType) {
		this.cylinderType = cylinderType;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
	
	
	
}
