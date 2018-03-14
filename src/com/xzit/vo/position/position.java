package com.xzit.vo.position;

import java.util.HashSet;
import java.util.Set;

public class position implements java.io.Serializable{
	//position_id, position_name, position_type, position_number, position_vacation
	private static final long serialVersionUID = 1L;
	public int position_id;
	public String position_name;
	public String position_type;
	public String position_number;
	public String position_vacation;
	private Set emp = new HashSet();
	private Set we = new HashSet();
	private Set ew = new HashSet();
	public int getPosition_id() {
		return position_id;
	}
	public void setPosition_id(int position_id) {
		this.position_id = position_id;
	}
	public String getPosition_name() {
		return position_name;
	}
	public void setPosition_name(String position_name) {
		this.position_name = position_name;
	}
	public String getPosition_type() {
		return position_type;
	}
	public void setPosition_type(String position_type) {
		this.position_type = position_type;
	}
	public String getPosition_number() {
		return position_number;
	}
	public void setPosition_number(String position_number) {
		this.position_number = position_number;
	}
	public String getPosition_vacation() {
		return position_vacation;
	}
	public void setPosition_vacation(String position_vacation) {
		this.position_vacation = position_vacation;
	}
	public Set getEmp() {
		return emp;
	}
	public void setEmp(Set emp) {
		this.emp = emp;
	}
	public Set getWe() {
		return we;
	}
	public void setWe(Set we) {
		this.we = we;
	}
	public Set getEw() {
		return ew;
	}
	public void setEw(Set ew) {
		this.ew = ew;
	}
	public position(int position_id, String position_name,
			String position_type, String position_number,
			String position_vacation, Set emp, Set we, Set ew) {
		super();
		this.position_id = position_id;
		this.position_name = position_name;
		this.position_type = position_type;
		this.position_number = position_number;
		this.position_vacation = position_vacation;
		this.emp = emp;
		this.we = we;
		this.ew = ew;
	}
	public position() {
		super();
	}




	
}
