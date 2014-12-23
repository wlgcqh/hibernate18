package com.qiheng.hibernate;

import java.sql.Timestamp;
import java.util.Set;

public class Student {
	
	private String id;
	
	private String student_name;
	
	private String address;
	
	private int version;
	
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}


	
	
	
}
