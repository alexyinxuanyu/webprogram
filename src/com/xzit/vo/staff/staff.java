package com.xzit.vo.staff;
import com.xzit.vo.section.Section;
import com.xzit.vo.position.position;

public class staff implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
private int staff_id;
private String staff_name;

//private String staff_section;
//private String staff_position;
private Section section;
private position position;
private String staff_birthday;
private String staff_gender;
private String staff_seniority;
private String staff_education;
private String staff_height;
private String staff_blood;
private String staff_national;
private String staff_mail;
private String staff_phone;
private String staff_native;
private String staff_idcard;
private String staff_condition;
private String Staff_source;
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
public String getStaff_birthday() {
	return staff_birthday;
}
public void setStaff_birthday(String staff_birthday) {
	this.staff_birthday = staff_birthday;
}
public String getStaff_gender() {
	return staff_gender;
}
public void setStaff_gender(String staff_gender) {
	this.staff_gender = staff_gender;
}
public String getStaff_seniority() {
	return staff_seniority;
}
public void setStaff_seniority(String staff_seniority) {
	this.staff_seniority = staff_seniority;
}
public String getStaff_education() {
	return staff_education;
}
public void setStaff_education(String staff_education) {
	this.staff_education = staff_education;
}
public String getStaff_height() {
	return staff_height;
}
public void setStaff_height(String staff_height) {
	this.staff_height = staff_height;
}
public String getStaff_blood() {
	return staff_blood;
}
public void setStaff_blood(String staff_blood) {
	this.staff_blood = staff_blood;
}
public String getStaff_national() {
	return staff_national;
}
public void setStaff_national(String staff_national) {
	this.staff_national = staff_national;
}
public String getStaff_mail() {
	return staff_mail;
}
public void setStaff_mail(String staff_mail) {
	this.staff_mail = staff_mail;
}
public String getStaff_phone() {
	return staff_phone;
}
public void setStaff_phone(String staff_phone) {
	this.staff_phone = staff_phone;
}
public String getStaff_native() {
	return staff_native;
}
public void setStaff_native(String staff_native) {
	this.staff_native = staff_native;
}
public String getStaff_idcard() {
	return staff_idcard;
}
public void setStaff_idcard(String staff_idcard) {
	this.staff_idcard = staff_idcard;
}
public String getStaff_condition() {
	return staff_condition;
}
public void setStaff_condition(String staff_condition) {
	this.staff_condition = staff_condition;
}
public String getStaff_source() {
	return Staff_source;
}
public void setStaff_source(String staff_source) {
	Staff_source = staff_source;
}
public staff(int staff_id, String staff_name, Section section,
		com.xzit.vo.position.position position, String staff_birthday,
		String staff_gender, String staff_seniority, String staff_education,
		String staff_height, String staff_blood, String staff_national,
		String staff_mail, String staff_phone, String staff_native,
		String staff_idcard, String staff_condition, String staff_source) {
	super();
	this.staff_id = staff_id;
	this.staff_name = staff_name;
	this.section = section;
	this.position = position;
	this.staff_birthday = staff_birthday;
	this.staff_gender = staff_gender;
	this.staff_seniority = staff_seniority;
	this.staff_education = staff_education;
	this.staff_height = staff_height;
	this.staff_blood = staff_blood;
	this.staff_national = staff_national;
	this.staff_mail = staff_mail;
	this.staff_phone = staff_phone;
	this.staff_native = staff_native;
	this.staff_idcard = staff_idcard;
	this.staff_condition = staff_condition;
	Staff_source = staff_source;
}
public staff() {
	super();
}


}
