package com.xzit.dao.position.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xzit.dao.position.IPositionDao;
import com.xzit.vo.position.position;
import com.xzit.vo.section.Section;


public class PositionDaoImpl implements IPositionDao {
	
	public List<position> findAll() {
		List<position> positionList=null;
		//创建配置文件对象
		Configuration cfg=new Configuration().configure();
		//通过配置文件对象创建session工厂
		SessionFactory sf=cfg.buildSessionFactory();
		//通过工厂对象创建session对象
		Session session=sf.openSession();		
		String hql="from position";
		try {
			Query query=session.createQuery(hql);
			positionList=query.list();

		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			session.close();
			sf.close();
		}		
		return positionList;
	}


	public position findbyId(position position) {
		position curposition=null;
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		String hql="from position where position_id=?";
		try {
			Query query=session.createQuery(hql);
			query.setParameter(0, position.getPosition_id());			
			List<position> positionList=query.list();
			if(positionList.size()!=0){
			curposition=positionList.get(0);
			}
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return curposition;
	}

	public position findbyName(position position) {
		position curposition=null;
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		String hql="from position where position_name=?";
		try {
			Query query=session.createQuery(hql);
			query.setParameter(0, position.getPosition_name());			
			List<position> positionList=query.list();
			if(positionList.size()!=0){
			curposition=positionList.get(0);
			}
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return curposition;
	}

	public position findbyType(position position) {
		position curposition=null;
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		String hql="from position where position_type=?";
		try {
			Query query=session.createQuery(hql);
			query.setParameter(0, position.getPosition_type());			
			List<position> positionList=query.list();
			if(positionList.size()!=0){
			curposition=positionList.get(0);
			}
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return curposition;
	}


	public void deletePosition(position position) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		try {
			session.beginTransaction();
			session.delete(position);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		
	}


	public void updetePosition(position position) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		String hql=" update position set position_name=?, position_type=?, position_number=?, position_vacation=? where position_id=?";
		try {
			session.beginTransaction();
			Query query=session.createQuery(hql);
			query.setString(0, position.getPosition_name());
			query.setString(1, position.getPosition_number());
			query.setString(2, position.getPosition_type());
			query.setString(3, position.getPosition_vacation());
			query.setInteger(4, position.getPosition_id());
	        query.executeUpdate();
			
			session.getTransaction().commit();
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}
		
	}


	public void addPosition(position position) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		try {
			session.beginTransaction();
			session.save(position);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		
	}


	public List<position> getAllByPage(int pageNo) {//页数，几条数据
		List<position> positionList=null;
		//创建配置文件对象
		Configuration cfg=new Configuration().configure();
		//通过配置文件对象创建session工厂
		SessionFactory sf=cfg.buildSessionFactory();
		//通过工厂对象创建session对象
		Session session=sf.openSession();		
		String hql="from position";
		try {
			Query query = session.createQuery(hql);
			query.setFirstResult((pageNo-1)*2);//从第(pageNo-1)*2条开始
			query.setMaxResults(2);//每个页面显示两条数据
			positionList=query.list();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return positionList;
	}
	public int getPositionCount() {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		List<position> positionList  = new ArrayList<position>();
		String hql = "from position";
		Query query = session.createQuery(hql);
		positionList = query.list();
		return positionList.size();
	}
}
