package com.xzit.dao.section.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xzit.dao.section.ISectionDao;
import com.xzit.vo.section.Section;

public class SectionDaoImpl implements ISectionDao {

	//创建配置文件对象
	Configuration cfg=new Configuration().configure();
	//通过配置文件对象创建session工厂
	SessionFactory sf=cfg.buildSessionFactory();
	//通过工厂对象创建session对象
	Session session=sf.openSession();	
	
	//查询所有部门信息
	public List<Section> findAll(int pageNo) {
		List<Section> secList=null;
		String hql="from Section";
		try {
			Query query=session.createQuery(hql);
			query.setFirstResult((pageNo-1)*2);//从第(pageNo-1)*2条开始
			query.setMaxResults(2);//每个页面显示两条数据
			secList=query.list();	
			for (int i = 0; i < secList.size(); i++) {  
			       System.out.println("findByPage:"  
			        + secList.get(i).getSection_name()); 
			       String[] l=secList.get(i).getSection_date().split("T");
			       secList.get(i).setSection_date(l[0]);
			       
			    }
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			session.close();
			sf.close();
		}		
		return secList;
	}

	
	//添加部门信息
	public void addSection(Section section) {
		try {
			session.beginTransaction();
			session.save(section);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.getTransaction().rollback();
		}
	}

	//删除部门信息
	public void deleteSection(Section section) {
		try {
			session.beginTransaction();
			session.delete(section);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.getTransaction().rollback();
		}

	}
	//修改部门信息
	public void updeteSection(Section section) {
		try {
			session.beginTransaction();
			session.update(section);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}

	}

	//按编号查询部门信息
	public Section findbyId(Section section) {
		Section cursection=null;
		String hql="from Section where section_id=?";
		try {
			Query query=session.createQuery(hql);
			query.setParameter(0, section.getSection_id());			
			List<Section> sectionList=query.list();
			if(sectionList.size()!=0){
			cursection=sectionList.get(0);
			}
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cursection;
	}
	//按名称查询部门信息
	public Section findbyName(Section section) {
		Section cursection=null;
		String hql="from Section where section_name=?";
		try {
			Query query=session.createQuery(hql);
			query.setParameter(0, section.getSection_name());			
			List<Section> sectionList=query.list();
			if(sectionList.size()!=0){
			cursection=sectionList.get(0);
			}
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cursection;
	}
	public int getSectionCount() {
		List<Section> secList  = new ArrayList<Section>();
		String hql = "from Section";
		Query query = session.createQuery(hql);
		secList = query.list();
		return secList.size();
	}



}
