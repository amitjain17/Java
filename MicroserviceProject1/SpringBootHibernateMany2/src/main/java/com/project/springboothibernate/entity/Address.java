package com.project.springboothibernate.entity;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Jpa_Address_Many")
public class Address {
	
	@Id
	private String id;
	private String value;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "address")
	private List<Student> student;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Address(String id, String value) {
		super();
		this.id = id;
		this.value = value;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Address(String id, String value, List<Student> student) {
		super();
		this.id = id;
		this.value = value;
		this.student = student;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", value=" + value + ", student=" + student + "]";
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	
	

}
