package com.xzit.dao.staff.impl;








import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xzit.dao.staff.IManageDao;
import com.xzit.vo.entry.entry;
import com.xzit.vo.staff.staff;







public class ManageDaoImpl implements IManageDao {
	Configuration cfg = new Configuration().configure();
	SessionFactory sf = cfg.buildSessionFactory();
	Session session = sf.openSession();
	
	public staff getUser(staff user) {
		
		// TODO Auto-generated method stub
		String hql="from staff where staff_name=? and staff_idcard=? and staff_seniority=?";
		try {
			//创建Query对象
			Query query = session.createQuery(hql);
			query.setParameter(0, user.getStaff_name());
			query.setParameter(1, user.getStaff_idcard());
			query.setParameter(2, "user");
			List<staff> adminList = query.list();
			user = adminList.get(0);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			session.getTransaction().rollback();
			e.printStackTrace();
		}finally{
			sf.close();
		}
		
		return user;
	}
	public int Add(staff employee) {
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


	

}
