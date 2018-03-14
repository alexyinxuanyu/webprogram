package com.xzit.action.entry;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;







import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xzit.biz.entry.IEmployeeBiz;
import com.xzit.biz.entry.impl.EmployeeBizImpl;
import com.xzit.vo.entry.entry;

public class EmployeeAction extends ActionSupport {

	private entry employee;
	private int rowsPerPage = 2;// 每页显示几条  
	private int page = 1; // 默认当前页  
	private int totalPage;// 总共多少页  
	private int Num;// 总过多少条

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

	public void setNum(int Num) {
		this.Num = Num;
	}
	
	public entry getEmployee() {
		return employee;
	}

	public void setEmployee(entry employee) {
		this.employee = employee;
	}
	ActionContext context = ActionContext.getContext();
	HttpServletRequest request = ServletActionContext.getRequest();
	Map session = context.getSession();
	IEmployeeBiz employBiz =new EmployeeBizImpl();

	public String show(){
		List<entry> emp_list = employBiz.findByPage(page, rowsPerPage);  
		totalPage = employBiz.getTotalPage(rowsPerPage);  
		Num = employBiz.getNum();  
//		List<Employee> emp_list=employBiz.getAll();
//		System.out.println(emp_list.size());
//		if(emp_list.size()>0){								
			session.put("emp_list", emp_list);				
			return SUCCESS;
//		}
		
//		return ERROR;
	}
	public String byemid(){
		entry emp = employBiz.getbyemid(employee.getStaff_id());
		if(emp!=null){
			session.put("emp_list", emp);
			return "byemid";
		}
		return ERROR;
	}
	public String byidcard(){
		List<entry> emp = employBiz.getbyidcard(employee.getStaff_salary());
		if(emp!=null){
			session.put("emp_list", emp);
			return "byemid";
		}
		return ERROR;
	}
	
	public String toAdd(){
		
		return "toAdd";
	}
	public String doAdd(){
		int count=0; 
		count=employBiz.Add(employee);
		if(count>0){
			show();
			return "doAdd";
		}
		return ERROR;
	}
	public String todel(){
		int count=0;	  
		count=employBiz.delete(employee.getStaff_id());
		System.out.println(employee.getStaff_id());
		if(count>0){
			show();
			return "doAdd";
		}
		return ERROR;
	}
	public String toUpdate(){
		entry emp=new entry();
		emp=employBiz.getbyemid(employee.getStaff_id());
		System.out.println(employee.getStaff_id());
		session.put("employee", emp);
		return "toUpdate";
	}
	public String doUpdate(){
		System.out.println(employee.getStaff_id());
		int count = employBiz.Update(employee);
		if(count>0){
			show();
			return "doAdd";
		}
		return ERROR;
	}
}
