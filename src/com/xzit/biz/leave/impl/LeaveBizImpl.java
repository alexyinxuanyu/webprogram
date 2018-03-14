package com.xzit.biz.leave.impl;

import java.util.List;

import com.xzit.biz.leave.ILeaveBiz;
import com.xzit.dao.leave.ILeaveDao;
import com.xzit.dao.leave.impl.LeaveDaoImpl;
import com.xzit.vo.leave.leave;

public class LeaveBizImpl implements ILeaveBiz {
	ILeaveDao leavedao=new LeaveDaoImpl();
	
	public List<leave> getAll() {
		return leavedao.getAll();
	}

	public leave getbystid(int staff_id) {
		return leavedao.getbystid(staff_id);
	}


	public int addLeave(leave leave) {
		return leavedao.addLeave(leave);
	}

	public int deleteLeave(int staff_id) {
		return leavedao.deleteLeave(staff_id);
	}

	public int updateLeave(leave leave) {
		return leavedao.updateLeave(leave);
	}

	public int getTotalPage(int rowsPerPage) {
		return leavedao.getTotalPage(rowsPerPage);
	}

	public int getNum() {
		return leavedao.getNum();
	}

	public List<leave> findByPage(int page, int rowsPerPage) {
		return leavedao.findByPage(page, rowsPerPage);
	}

}
