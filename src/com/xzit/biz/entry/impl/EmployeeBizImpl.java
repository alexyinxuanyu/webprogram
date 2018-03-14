package com.xzit.biz.entry.impl;

import java.util.List;
import java.util.Set;

import com.xzit.biz.entry.IEmployeeBiz;
import com.xzit.dao.entry.IEmployeeDao;
import com.xzit.dao.entry.impl.EmployeeDaoImpl;
import com.xzit.vo.entry.entry;



public class EmployeeBizImpl implements IEmployeeBiz {

	IEmployeeDao employDao = new EmployeeDaoImpl();
	public List<entry> getAll() {
		
		return employDao.getAll();
	}


	

	public int Add(entry employee) {
		
		return employDao.Add(employee);
	}

	public int delete(int employee_Id) {
		
		return employDao.delete(employee_Id);
	}

	public int Update(entry employee) {
		
		return employDao.Update(employee);
	}


	public entry getbyemid(int employee_Id) {
		
		return employDao.getbyemid(employee_Id);
	}


	public int getTotalPage(int rowsPerPage) {
		
		return employDao.getTotalPage(rowsPerPage);
	}


	public int getNum() {
		
		return employDao.getNum();
	}


	public List<entry> findByPage(int page, int rowsPerPage) {
		
		return employDao.findByPage(page, rowsPerPage);
	}




	public List<entry> getbyidcard(String emplpyee_Id) {
		// TODO Auto-generated method stub
		return employDao.getbyidcard(emplpyee_Id);
	}

}
