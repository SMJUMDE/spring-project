package com.ifs.Department.sample;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	@GeneratedValue
	private long departmentId;
	private String departmentName;
	private String departmentDescription;
	

	private Department() {
		super();
		// TODO Auto-generated constructor stub
	}


	private Department(long departmentId, String departmentName, String departmentDescription) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentDescription = departmentDescription;
	}


	public long getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public String getDepartmentDescription() {
		return departmentDescription;
	}


	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}

	
	
	

}
