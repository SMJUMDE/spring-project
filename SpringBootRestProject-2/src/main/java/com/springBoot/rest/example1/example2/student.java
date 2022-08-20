package com.springBoot.rest.example1.example2;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class student {
	
	@javax.persistence.Id
	@GeneratedValue
	private long Id;
	private String name;
	private String Aadhar;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadhar() {
		return Aadhar;
	}
	public void setAadhar(String aadhar) {
		Aadhar = aadhar;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Aadhar, Id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		return Objects.equals(Aadhar, other.Aadhar) && Id == other.Id && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "student [Id=" + Id + ", name=" + name + ", Aadhar=" + Aadhar + "]";
	}
	
	
	
	

}
