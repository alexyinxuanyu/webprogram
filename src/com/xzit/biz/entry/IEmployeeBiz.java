package com.xzit.biz.entry;

import java.util.List;
import java.util.Set;


import com.xzit.vo.entry.entry;

public interface IEmployeeBiz {

	public List<entry> getAll();
	public entry getbyemid(int employee_Id);
	public List<entry> getbyidcard(String emplpyee_Id);
	public int Add(entry employee);
	public int delete(int employee_Id);
	public int Update(entry employee);
	
	public int getTotalPage(int rowsPerPage);  
	public int getNum();
	public List<entry> findByPage(int page, int rowsPerPage);
}
