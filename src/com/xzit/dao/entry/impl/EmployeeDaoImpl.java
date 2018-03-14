package com.xzit.dao.entry.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xzit.dao.entry.IEmployeeDao;
import com.xzit.vo.entry.entry;



public class EmployeeDaoImpl implements IEmployeeDao {

	Configuration cfg = new Configuration().configure();
	SessionFactory sf = cfg.buildSessionFactory();
	Session session = sf.openSession();
	public List<entry> getAll() {
		String hql="from entry";
		Query query = session.createQuery(hql);
		//分页功能
//		query.setFirstResult(0);
//		query.setMaxResults(2);
		List<entry> em_list = query.list();
		return em_list;
	}


	
	
	public int Add(entry employee) {
		int count=0;
		try {
			session.beginTransaction();
			session.save(employee);
			session.getTransaction().commit();
			count=1;
		} catch (HibernateException e) {
			count=0;
			session.getTransaction().rollback();
			e.printStackTrace();
		}
		return count;
	}

	public int delete(int employee_Id) {
		int count=0;
		entry emp = new entry();
		emp.setStaff_id(employee_Id);
		try {
			session.beginTransaction();
			session.delete(emp);
			session.getTransaction().commit();
			count=1;
		} catch (HibernateException e) {
			count=0;
			session.getTransaction().rollback();
			e.printStackTrace();
		}
		return count;
	}

	public int Update(entry employee) {
		int count=0;
		try {
			session.beginTransaction();
			session.update(employee);
			session.getTransaction().commit();
			count=1;
		} catch (HibernateException e) {
			count=0;
			session.getTransaction().rollback();
			e.printStackTrace();
		}
		return count;
	}


	public entry getbyemid(int employee_Id) {
		entry employee = (entry)session.get(entry.class, employee_Id);
		String[] l=employee.getStaff_entryapplytime().split("T");
		employee.setStaff_entryapplytime(l[0]);
		String[] w=employee.getStaff_entrycomplytime().split("T");
		employee.setStaff_entrycomplytime(w[0]);
		return employee;
	}
	public List<entry> getbyidcard(String employee_Id) {
		String hql="from entry where staff_salary=?";
		List<entry> elist=new ArrayList<entry>();
		try{
			Query query= session.createQuery(hql);
			query.setParameter(0, employee_Id);
			elist=query.list();
			for (int i = 0; i < elist.size(); i++) {  
			       System.out.println("findByPage:"  
			        + elist.get(i).getStaff_name());  
			       String[] l=elist.get(i).getStaff_entrycomplytime().split("T");
			       elist.get(i).setStaff_entrycomplytime(l[0]);;
			       String[] w=elist.get(i).getStaff_entryapplytime().split("T");
			       elist.get(i).setStaff_entryapplytime(w[0]);
			    }
		}catch(HibernateException e){
			e.printStackTrace();
		}finally{
			session.close();
			sf.close();
		}
		return elist;
	}
	
	
	public int getTotalPage(int rowsPerPage) {
		int rows = 0;  
		try {
			String hql = "select count(*) from entry";  
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
		 String hql = "select count(*) from entry ";  
		 int rows = 0;  
		 try {
			Query query = session.createQuery(hql);  
			 rows = ((Long) query.iterate().next()).intValue();
		} catch (HibernateException e) {
			e.printStackTrace();
		}  
		 return rows;  
	}

	public List<entry> findByPage(int page, int rowsPerPage) {
		List<entry> list = null;
		try {
			Query query = session.createQuery("from entry order by staff_id asc");  
			query.setMaxResults(rowsPerPage); // 每页最多显示几条  
			query.setFirstResult((page - 1) * rowsPerPage); // 每页从第几条记录开始  
			list = query.list();
		
			for (int i = 0; i < list.size(); i++) {  
			       System.out.println("findByPage:"  
			        + list.get(i).getStaff_name());  
			       String[] l=list.get(i).getStaff_entrycomplytime().split("T");
			       list.get(i).setStaff_entrycomplytime(l[0]);;
			       String[] w=list.get(i).getStaff_entryapplytime().split("T");
			       list.get(i).setStaff_entryapplytime(w[0]);
			    }
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return list;  
	}




	
	

}
