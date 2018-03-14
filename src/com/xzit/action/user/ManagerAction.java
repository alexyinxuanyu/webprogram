package com.xzit.action.user;



import java.util.Map;






import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xzit.biz.staff.IManageBiz;
import com.xzit.biz.staff.impl.ManageBizImpl;
import com.xzit.vo.staff.staff;











public class ManagerAction extends ActionSupport {
	IManageBiz userbiz=new ManageBizImpl();
	
	
	

	private String uname;
	private String upwd;
	private String usection;
	private String uposition;
	private String uapply;
	private staff staff;
	public staff getStaff() {
		return staff;
	}
	public void setStaff(staff staff) {
		this.staff = staff;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	
	ActionContext context=ActionContext.getContext();
	Map request=(Map) context.get("request");
	

	public String toLogin(){
		staff user=new staff();
		user.setStaff_name(uname);
		user.setStaff_idcard(upwd);
		boolean islogin=userbiz.validateLogin(user);
		if(islogin){
			request.put("name", uname);
			return SUCCESS;
		}
		return ERROR;
		
	}
	public String toRegister(){
		int count=0; 
		count=userbiz.Add(staff);
		if(count>0){
			
			return "doAdd";
		}
		return ERROR;
		
	}

}