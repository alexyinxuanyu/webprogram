package com.xzit.dao.staff;

import com.xzit.vo.staff.staff;





public interface IManageDao {
	public staff getUser(staff user);
	public int Add(staff employee);
}
