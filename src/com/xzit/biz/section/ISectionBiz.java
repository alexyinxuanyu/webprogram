package com.xzit.biz.section;

import java.util.List;

import com.xzit.vo.section.Section;

public interface ISectionBiz {
	public List<Section> findAll(int pageNo);//��ѯ������Ϣ
	public void deleteSection(Section section);//ɾ��������Ϣ
	public void updeteSection(Section section);//�޸Ĳ�����Ϣ
	public void addSection(Section section);//���Ӳ�����Ϣ
	public Section findbyId(Section section);//����Ų�ѯ������Ϣ
	public Section findbyName(Section section);//�����Ʋ�ѯ������Ϣ
	public int getSectionCount();

}
