package com.xzit.vo.leave;

import com.xzit.vo.position.position;
import com.xzit.vo.section.Section;

public class leave implements java.io.Serializable{
	/**
	 * 部门信息实体类
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int staff_id;//职员编号
	private String staff_name;//职员名称
	/*
	private String staff_section;//职员所属部门
	private String staff_position;//职员职能*/
	private Section section;
	private position position;
	private String staff_leaveapplytime;//职员申请离开时间
	private String staff_leavecondition;//职员离开完成状况
	private String staff_leavecomplytime;//职员离开完成时间
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
	public String getStaff_leaveapplytime() {
		return staff_leaveapplytime;
	}
	public void setStaff_leaveapplytime(String staff_leaveapplytime) {
		this.staff_leaveapplytime = staff_leaveapplytime;
	}
	public String getStaff_leavecondition() {
		return staff_leavecondition;
	}
	public void setStaff_leavecondition(String staff_leavecondition) {
		this.staff_leavecondition = staff_leavecondition;
	}
	public String getStaff_leavecomplytime() {
		return staff_leavecomplytime;
	}
	public void setStaff_leavecomplytime(String staff_leavecomplytime) {
		this.staff_leavecomplytime = staff_leavecomplytime;
	}
	public leave(int staff_id, String staff_name, Section section,
			com.xzit.vo.position.position position,
			String staff_leaveapplytime, String staff_leavecondition,
			String staff_leavecomplytime) {
		super();
		this.staff_id = staff_id;
		this.staff_name = staff_name;
		this.section = section;
		this.position = position;
		this.staff_leaveapplytime = staff_leaveapplytime;
		this.staff_leavecondition = staff_leavecondition;
		this.staff_leavecomplytime = staff_leavecomplytime;
	}
	public leave() {
		super();
	}

		

	
	
}
