package com.xzit.dao.entry;

import java.util.List;
import java.util.Map;
import java.util.Set;


import com.xzit.vo.entry.entry;

public interface IEmployeeDao {

	/*public List<Employee> getAll();
	public Employee getbyemid(String employee_Id);
	public Set getbydeid(String Department_id);
	public Set getbypoid(String Position_id);
	public int Add(Employee employee);
	public int delete(String employee_Id);
	public int Update(Employee employee);
	
	public int getTotalPage(int rowsPerPage); //后加
	public int getNum();						//后加
	public List<Employee> findByPage(int page, int rowsPerPage);//后加  */
	public List<entry> getAll();
	public entry getbyemid(int employee_Id);
	public List<entry> getbyidcard(String employee_Id);
	public int Add(entry employee);
	public int delete(int employee_Id);
	public int Update(entry employee);
	
	public int getTotalPage(int rowsPerPage); //后加
	public int getNum();						//后加
	public List<entry> findByPage(int page, int rowsPerPage);//后加 
}
