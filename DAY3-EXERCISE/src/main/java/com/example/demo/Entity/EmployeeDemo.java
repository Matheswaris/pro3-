package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EmployeeDemo")
public class EmployeeDemo {

	@Id
	@Column(name="eid")
	private int eid;
	@Column(name="ename")
	private String ename;
	@Column(name="eage")
	private int eage;
	@Column(name="esalary")
	private long esalary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	public long getEsalary() {
		return esalary;
	}
	public void setEsalary(long esalary) {
		this.esalary = esalary;
	}
	public EmployeeDemo(int eid, String ename, int eage, long esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
		this.esalary = esalary;
	}
	public EmployeeDemo()
	{
		
	}
	
}
