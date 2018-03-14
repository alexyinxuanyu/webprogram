package com.xzit.biz.staff;

import com.xzit.vo.entry.entry;
import com.xzit.vo.staff.staff;






public interface IManageBiz {
	public boolean validateLogin(staff user);
	public int Add(staff employee);
}
