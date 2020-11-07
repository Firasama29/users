package com.doc.user.model;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class User implements Serializable{

	private static final long serialVersionUID = -4170807646707713946L;
		@Id				//must use
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
		private String userName;
		private String email;
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		private Date dob;

		public User() {
			super();
		}

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

		@Override
		public String toString() {
			return "User [id=" + id + ", userName=" + userName + ", email=" + email + ", dob=" + dob + "]";
		}
}
