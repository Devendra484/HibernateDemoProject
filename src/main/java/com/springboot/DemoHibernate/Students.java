package com.springboot.DemoHibernate;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="Students")

public class Students {
	
	@Id
    private Long sId;
	private String sName;
	private String  sRollNo;
	private Integer sMarks;
	@OneToMany(mappedBy="students",fetch=FetchType.EAGER)
	private List<Laptops> laptopsList=new ArrayList<Laptops>();
	
	
	public Long getId() {
		return sId;
	}
	public void setId(Long sId) {
		this.sId = sId;
	}
	public String getName() {
		return sName;
	}
	public void setName(String sName) {
		this.sName = sName;
	}
	public String getRollNo() {
		return sRollNo;
	}
	public void setRollNo(String sRollNo) {
		this.sRollNo = sRollNo;
	}
	public Integer getMarks() {
		return sMarks;
	}
	public void setMarks(Integer sMarks) {
		this.sMarks = sMarks;
	}
	
	
	public List<Laptops> getLaptopsList() {
		return laptopsList;
	}
	public void setLaptopsList(List<Laptops> laptopsList) {
		this.laptopsList = laptopsList;
	}
	@Override
	public String toString() {
		return "Students [sId=" + sId + ", sName=" + sName + ", sRollNo=" + sRollNo + ", sMarks=" + sMarks + "]";
	}
	
	
}
