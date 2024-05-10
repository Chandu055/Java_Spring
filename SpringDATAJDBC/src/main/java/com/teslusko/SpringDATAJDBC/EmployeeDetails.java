package com.teslusko.SpringDATAJDBC;

public class EmployeeDetails 
{
	private Integer id;
	private String ename;
	private String officename;
	private Integer salary;
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String ename) {
		this.ename = ename;
	}
	public void setOfficename(String officename) {
		this.officename = officename;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", ename=" + ename + ", officename=" + officename + ", salary=" + salary
				+ "]";
	}
	public EmployeeDetails(Integer id, String ename, String officename, Integer salary) {
		super();
		this.id = id;
		this.ename = ename;
		this.officename = officename;
		this.salary = salary;
	}
	
	
	
	
	
	
	
}