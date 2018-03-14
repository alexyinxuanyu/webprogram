package com.xzit.action.leave;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xzit.biz.leave.ILeaveBiz;
import com.xzit.biz.leave.impl.LeaveBizImpl;
import com.xzit.vo.leave.leave;


public class LeaveAction extends ActionSupport {
	ActionContext context = ActionContext.getContext();
	HttpServletRequest request = ServletActionContext.getRequest();
	Map session = context.getSession();
	ILeaveBiz leavebiz = new LeaveBizImpl();
	private leave leave;
	private int rowsPerPage = 2;// 每页显示几条  
	private int page = 1; // 默认当前页  
	private int totalPage;// 总共多少页  
	private int Num;// 总过多少条
	public LeaveAction(com.xzit.vo.leave.leave leave, int rowsPerPage,
			int page, int totalPage, int num) {
		super();
		this.leave = leave;
		this.rowsPerPage = rowsPerPage;
		this.page = page;
		this.totalPage = totalPage;
		Num = num;
	}
	public LeaveAction() {
		super();
	}
	public leave getLeave() {
		return leave;
	}
	public void setLeave(leave leave) {
		this.leave = leave;
	}
	public int getRowsPerPage() {
		return rowsPerPage;
	}
	public void setRowsPerPage(int rowsPerPage) {
		this.rowsPerPage = rowsPerPage;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getNum() {
		return Num;
	}
	public void setNum(int num) {
		Num = num;
	}
	
	//////1111111111111111111111111111111111111
	public String show(){
		List<leave> st_list = leavebiz.findByPage(page, rowsPerPage);  
		totalPage = leavebiz.getTotalPage(rowsPerPage);  
		Num = leavebiz.getNum();  
								
			session.put("st_list", st_list);				
			return SUCCESS;

	}
	public String bystid(){
		leave st = leavebiz.getbystid(leave.getStaff_id());
		if(st!=null){
			session.put("st_list", st);
			return "bystid";
		}
		return ERROR;
	}

	public String toAdd(){
		
		return "toAdd";
	}
	public String doAdd(){
		int count=0; 
		count=leavebiz.addLeave(leave);
		if(count>0){
			show();
			return "doAdd";
		}
		return ERROR;
	}
	public String todel(){
		int count=0;	  
		count=leavebiz.deleteLeave(leave.getStaff_id());
		System.out.println(leave.getStaff_id());
		if(count>0){
			show();
			return "doAdd";
		}
		return ERROR;
	}
	public String toUpdate(){
		leave st=new leave();
		st=leavebiz.getbystid(leave.getStaff_id());
		System.out.println(leave.getStaff_id());
		session.put("leave", st);
		return "toUpdate";
	}
	public String doUpdate(){
		System.out.println(leave.getStaff_id());
		int count = leavebiz.updateLeave(leave);
		if(count>0){
			show();
			return "doAdd";
		}
		return ERROR;
	}
	
	
}
