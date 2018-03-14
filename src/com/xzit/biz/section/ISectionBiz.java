package com.xzit.biz.section;

import java.util.List;

import com.xzit.vo.section.Section;

public interface ISectionBiz {
	public List<Section> findAll(int pageNo);//查询部门信息
	public void deleteSection(Section section);//删除部门信息
	public void updeteSection(Section section);//修改部门信息
	public void addSection(Section section);//增加部门信息
	public Section findbyId(Section section);//按编号查询部门信息
	public Section findbyName(Section section);//按名称查询部门信息
	public int getSectionCount();

}
