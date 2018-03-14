package com.xzit.vo.entry;

import com.xzit.vo.position.position;
import com.xzit.vo.section.Section;

public class entry implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	private int staff_id;
	private String staff_name;
	//private String staff_section;
	//private String staff_position;
	private Section section;
	private position position;
	private String staff_entryapplytime;
	private String staff_entrycondition;
	private String staff_entrycomplytime;
	private String staff_salary;
	public int getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}
	public String getStaff_name() {
		return staff_name;
	}
	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}
	public Section getSection() {
		return section;
	}
	public void setSection(Section section) {
		this.section = section;
	}
	public position getPosition() {
		return position;
	}
	public void setPosition(position position) {
		this.position = position;
	}
	public String getStaff_entryapplytime() {
		return staff_entryapplytime;
	}
	public void setStaff_entryapplytime(String staff_entryapplytime) {
		this.staff_entryapplytime = staff_entryapplytime;
	}
	public String getStaff_entrycondition() {
		return staff_entrycondition;
	}
	public void setStaff_entrycondition(String staff_entrycondition) {
		this.staff_entrycondition = staff_entrycondition;
	}
	public String getStaff_entrycomplytime() {
		return staff_entrycomplytime;
	}
	public void setStaff_entrycomplytime(String staff_entrycomplytime) {
		this.staff_entrycomplytime = staff_entrycomplytime;
	}
	public String getStaff_salary() {
		return staff_salary;
	}
	public void setStaff_salary(String staff_salary) {
		this.staff_salary = staff_salary;
	}
	public entry(int staff_id, String staff_name, Section section,
			com.xzit.vo.position.position position,
			String staff_entryapplytime, String staff_entrycondition,
			String staff_entrycomplytime, String staff_salary) {
		super();
		this.staff_id = staff_id;
		this.staff_name = staff_name;
		this.section = section;
		this.position = position;
		this.staff_entryapplytime = staff_entryapplytime;
		this.staff_entrycondition = staff_entrycondition;
		this.staff_entrycomplytime = staff_entrycomplytime;
		this.staff_salary = staff_salary;
	}
	public entry() {
		super();
	}

	
}
