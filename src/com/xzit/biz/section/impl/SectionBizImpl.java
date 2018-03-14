package com.xzit.biz.section.impl;

import java.util.List;

import com.xzit.biz.section.ISectionBiz;
import com.xzit.dao.section.ISectionDao;
import com.xzit.dao.section.impl.SectionDaoImpl;
import com.xzit.vo.section.Section;

public class SectionBizImpl implements ISectionBiz {
	ISectionDao sectiondao=new SectionDaoImpl();

	public List<Section> findAll(int pageNo) {
		return sectiondao.findAll(pageNo);
	}

	public void deleteSection(Section section) {
		sectiondao.deleteSection(section);
	}

	public void updeteSection(Section section) {
		sectiondao.updeteSection(section);
	}

	public void addSection(Section section) {
		sectiondao.addSection(section);
	}

	public Section findbyId(Section section) {
		return sectiondao.findbyId(section);
	}

	public Section findbyName(Section section) {
		return sectiondao.findbyName(section);
	}

	public int getSectionCount() {
		return sectiondao.getSectionCount();
	}



}
