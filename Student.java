package org.anudip.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int sid;
	private String sName;
	private String sLocation;
	public Student() {
		

	}
	public Student(int sid, String sName, String sLocation) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.sLocation = sLocation;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsLocation() {
		return sLocation;
	}
	public void setsLocation(String sLocation) {
		this.sLocation = sLocation;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + ", sLocation=" + sLocation + "]";
	}
	
	
	
	
	
	

}
