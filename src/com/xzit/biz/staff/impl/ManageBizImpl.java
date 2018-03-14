package com.xzit.biz.staff.impl;

import com.xzit.biz.staff.IManageBiz;
import com.xzit.dao.staff.IManageDao;
import com.xzit.dao.staff.impl.ManageDaoImpl;
import com.xzit.vo.entry.entry;
import com.xzit.vo.staff.staff;




public class ManageBizImpl implements IManageBiz {


	IManageDao iud=new ManageDaoImpl();


	public boolean validateLogin(staff user) {
		// TODO Auto-generated method stub
		
		if(iud.getUser(user)!=null){
			return true;
		}
		return false;
	}
public int Add(staff employee) {
		
		return iud.Add(employee);
	}


	

}
