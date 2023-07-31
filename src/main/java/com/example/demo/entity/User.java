package com.example.demo.entity;



import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId;
	@Column(name="user_name")
	private String userName;
	@Column(name="user_address")
	private String userAddress;
	@Column(name="user_phno")
	private String userPhno;
	@Column(name="user_email")
	private String userEmail;
	@Column(name="user_password")
	private String userPassword;
	@Column(name="user_type")
	private String usertype;
	
	@OneToMany(mappedBy="user")
	private Set<Booking> booking;
	
	public User() {
		
	}
	public User(int userId, String userName, String userAddress, String userPhno, String userEmail, String userPassword,
			String usertype) {
		
		this.userId = userId;
		this.userName = userName;
		this.userAddress = userAddress;
		this.userPhno = userPhno;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.usertype = usertype;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserPhno() {
		return userPhno;
	}
	public void setUserPhno(String userPhno) {
		this.userPhno = userPhno;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAddress=" + userAddress + ", userPhno="
				+ userPhno + ", userEmail=" + userEmail + ", userPassword=" + userPassword + ", usertype=" + usertype
				+ "]";
	}
	
	
	
	
	
	
	
	

}
