package com.doc.user.dto;
import java.io.Serializable;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class UserDTO implements Serializable{
	private static final long serialVersionUID = 7556677967737775510L;

	public UserDTO() {
		super();
	}
	
	private long id;
	private String userName;
	private String email;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dob;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
