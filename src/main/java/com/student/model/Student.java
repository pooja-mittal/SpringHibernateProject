package com.student.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="student", schema="system")
public class Student {
	
	int id;
	String name, city, ReportingManager, contact;
	
	public Student() {
		
	}
	public Student(int id, String name, String city, String reportingManager, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		ReportingManager = reportingManager;
		this.contact = contact;
	}
	public Student(String name, String city, String reportingManager, String contact) {
		super();
		this.name = name;
		this.city = city;
		ReportingManager = reportingManager;
		this.contact = contact;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getReportingManager() {
		return ReportingManager;
	}
	public void setReportingManager(String reportingManager) {
		ReportingManager = reportingManager;
	}
	

}
