package com.telusko.SrpingJDBCAPI.dao;

import org.springframework.stereotype.Component;

@Component
public class employee 
{

	private Integer id;
	private String sname;
	private Integer sage;
	private String scity;
	public void setId(Integer id) {
		this.id = id;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setSage(int i) {
		this.sage = i;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", sname=" + sname + ", sage=" + sage + ", scity=" + scity + "]";
	}
	
	
	
	
}
