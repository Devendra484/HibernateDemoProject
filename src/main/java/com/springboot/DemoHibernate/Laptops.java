package com.springboot.DemoHibernate;

import jakarta.persistence.*;

@Entity
public class Laptops {
	@Id
	@Column(name = "id", nullable = false)
	private Long id;

	private String name;
	private double price;
	@ManyToOne
	private Students students;


	public Long getId() {
		return id;
	}

	public void setId(long i) {
		this.id = i;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public Students getStudents() {
		return students;
	}

	public void setStudents(Students students) {
		this.students = students;
	}

	
	@Override
	public String toString() {
		return "Laptops [id=" + id + ", name=" + name + ", price=" + price  + "]";
	}
	
	
	
}
