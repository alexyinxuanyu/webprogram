package com.xzit.vo.section;

import java.util.HashSet;
import java.util.Set;

public class Section implements java.io.Serializable {

	/**
	 * 部门信息实体类
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int section_id;//部门编号
	private String section_name;//部门名称
	private String section_organ;//部门所属地
	private String  section_phone; //电话
	private String section_fax; //传真
	private String section_date;//成立日期
	private Set emp = new HashSet();
	private Set we = new HashSet();
	private Set ew = new HashSet();
	public int getSection_id() {
		return section_id;
	}
	public void setSection_id(int section_id) {
		this.section_id = section_id;
	}
	public String getSection_name() {
		return section_name;
	}
	public void setSection_name(String section_name) {
		this.section_name = section_name;
	}
	public String getSection_organ() {
		return section_organ;
	}
	public void setSection_organ(String section_organ) {
		this.section_organ = section_organ;
	}
	public String getSection_phone() {
		return section_phone;
	}
	public void setSection_phone(String section_phone) {
		this.section_phone = section_phone;
	}
	public String getSection_fax() {
		return section_fax;
	}
	public void setSection_fax(String section_fax) {
		this.section_fax = section_fax;
	}
	public String getSection_date() {
		return section_date;
	}
	public void setSection_date(String section_date) {
		this.section_date = section_date;
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
	public Section(int section_id, String section_name, String section_organ,
			String section_phone, String section_fax, String section_date,
			Set emp, Set we, Set ew) {
		super();
		this.section_id = section_id;
		this.section_name = section_name;
		this.section_organ = section_organ;
		this.section_phone = section_phone;
		this.section_fax = section_fax;
		this.section_date = section_date;
		this.emp = emp;
		this.we = we;
		this.ew = ew;
	}
	public Section() {
		super();
	}


	

}
