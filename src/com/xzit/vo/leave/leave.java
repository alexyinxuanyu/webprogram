package com.xzit.vo.leave;

import com.xzit.vo.position.position;
import com.xzit.vo.section.Section;

public class leave implements java.io.Serializable{
	/**
	 * ������Ϣʵ����
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int staff_id;//ְԱ���
	private String staff_name;//ְԱ����
	/*
	private String staff_section;//ְԱ��������
	private String staff_position;//ְԱְ��*/
	private Section section;
	private position position;
	private String staff_leaveapplytime;//ְԱ�����뿪ʱ��
	private String staff_leavecondition;//ְԱ�뿪���״��
	private String staff_leavecomplytime;//ְԱ�뿪���ʱ��
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
