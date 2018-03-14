package com.xzit.biz.leave;

import java.util.ArrayList;
import java.util.List;

import com.xzit.vo.entry.entry;
import com.xzit.vo.leave.leave;

public interface ILeaveBiz {
	
	
	public List<leave> getAll();
	public leave getbystid(int staff_id);
	public int addLeave(leave leave);
	public int deleteLeave(int staff_id);
	public int updateLeave(leave leave);
	
	public int getTotalPage(int rowsPerPage);  
	public int getNum();
	public List<leave> findByPage(int page, int rowsPerPage);
}
