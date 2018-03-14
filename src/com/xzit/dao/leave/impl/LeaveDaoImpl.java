package com.xzit.dao.leave.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xzit.dao.leave.ILeaveDao;
import com.xzit.vo.leave.leave;

public class LeaveDaoImpl implements ILeaveDao {
	//创建配置文件对象
	Configuration cfg=new Configuration().configure();
	//通过配置文件对象创建session工厂
	SessionFactory sf=cfg.buildSessionFactory();
	//通过工厂对象创建session对象
	Session session=sf.openSession();	
	
	public List<leave> getAll() {
		String hql="from leave";
		Query query = session.createQuery(hql);
		//分页功能
//		query.setFirstResult(0);
//		query.setMaxResults(2);
		List<leave> st_list = query.list();
		return st_list;
	}

	public leave getbystid(int staff_id) {
		leave leave = (leave)session.get(leave.class, staff_id);
		String[] l=leave.getStaff_leaveapplytime().split("T");
		leave.setStaff_leaveapplytime(l[0]);
		String[] w=leave.getStaff_leavecomplytime().split("T");
		leave.setStaff_leavecomplytime(w[0]);
		return leave;
	}


	public int addLeave(leave leave) {
		int count=0;
		try {
			session.beginTransaction();
			session.save(leave);
			session.getTransaction().commit();
			count=1;
		} catch (HibernateException e) {
			count=0;
			session.getTransaction().rollback();
			e.printStackTrace();
		}
		return count;
	}

	public int deleteLeave(int staff_id) {
		int count=0;
		leave lea = new leave();
		lea.setStaff_id(staff_id);
		try {
			session.beginTransaction();
			session.delete(lea);
			session.getTransaction().commit();
			count=1;
		} catch (HibernateException e) {
			count=0;
			session.getTransaction().rollback();
			e.printStackTrace();
		}
		return count;
	}

	public int updateLeave(leave leave) {
		int count=0;
		try {
			session.beginTransaction();
			session.update(leave);
			session.getTransaction().commit();
			count=1;
		} catch (HibernateException e) {
			count=0;
			session.getTransaction().rollback();
			e.printStackTrace();
		}
		return count;
	}

	public int getTotalPage(int rowsPerPage) {
		int rows = 0;  
		try {
			String hql = "select count(*) from leave";  
			Query query = session.createQuery(hql);  
			rows = ((Long) query.iterate().next()).intValue();
		} catch (HibernateException e) {
			e.printStackTrace();
		}  
		if (rows % rowsPerPage == 0) {  
		     return rows / rowsPerPage;  
		} else {  
		     return rows / rowsPerPage + 1;  
	    }  
	}

	public int getNum() {
		String hql = "select count(*) from leave ";  
		 int rows = 0;  
		 try {
			Query query = session.createQuery(hql);  
			rows = ((Long) query.iterate().next()).intValue();
		} catch (HibernateException e) {
			e.printStackTrace();
		}  
		 return rows;  
	}

	////////////这里要注意 可能出错
	public List<leave> findByPage(int page, int rowsPerPage) {
		List<leave> list = null;
		try {
			Query query = session.createQuery("from leave order by staff_id asc");  
			query.setMaxResults(rowsPerPage); // 每页最多显示几条  
			query.setFirstResult((page - 1) * rowsPerPage); // 每页从第几条记录开始  
			list = query.list();
		
			for (int i = 0; i < list.size(); i++) {  
			       System.out.println("findByPage:"  
			        + list.get(i).getStaff_name());  
			       String[] l=list.get(i).getStaff_leavecomplytime().split("T");
			       list.get(i).setStaff_leavecomplytime(l[0]);;
			       String[] w=list.get(i).getStaff_leaveapplytime().split("T");
			       list.get(i).setStaff_leaveapplytime(w[0]);
			    }
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return list;  
	}

}
