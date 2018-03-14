package com.xzit.action.section;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xzit.biz.section.ISectionBiz;
import com.xzit.biz.section.impl.SectionBizImpl;
import com.xzit.vo.section.Section;

public class SectionAction extends ActionSupport {
private Section section;
	
	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}
	
	ActionContext context=ActionContext.getContext();
	Map session=context.getSession();
	ISectionBiz sectionbiz=new SectionBizImpl();
	
	private String pagenum;
	
	public String getPagenum() {
		return pagenum;
	}

	public void setPagenum(String pagenum) {
		this.pagenum = pagenum;
	}
	
	
	//显示部门信息
	public String tosectionManager(){
		/*session.put("section", sectionbiz.findAll());
		return SUCCESS;*/
		int count = sectionbiz.getSectionCount();//一共有count条数据
		int maxpage = 0;
		if(count%2==0){//一共将有maxpage个页面
			maxpage = count/2;
		}else if(count%2>=1&&count%2<=1){
			maxpage = count/2+1;
		}
		//获取页面编号
		int pageNo = 0;
		String strpageNo = pagenum;//从页面获取页面编号
		if(strpageNo==null){
					pageNo = 1;
				}else{
					pageNo = Integer.parseInt(strpageNo);
				}
				if(pageNo==0){
					pageNo = 1;
				}
					
		if(sectionbiz.getSectionCount()!=0){						
			session.put("section", sectionbiz.findAll(pageNo));
			session.put("maxpage", maxpage);
			session.put("pageNo", pageNo);
			return SUCCESS;
		}
		return ERROR;
	}


	
	//增加	
	
	public String toAdd(){
		return "toAdd";
	}
	
	public String addSection(){
		System.out.println("添加名称为"+section.getSection_name()+"的部门");
		if(section.getSection_name()!=null){
			sectionbiz.addSection(section);
			return this.tosectionManager();
		}
		return ERROR;
	}
	
	//删除
	public String deleteSection(){
		System.out.println("删除名称为"+section.getSection_name()+"的部门");
		sectionbiz.deleteSection(section);
		return this.tosectionManager();
	}
	 //修改
   /* public String toUpdateSection(){   	
    	session.put("id", section.getSection_id());
    	return "update";
    }	 */
    public String isUpdateSection(){    	
    	int id=(Integer) session.get("id");
    	section.setSection_id(id);
    	sectionbiz.updeteSection(section);
    	return this.tosectionManager();
    }
    public String findbyId1(){
    	session.put("id", section.getSection_id());
    	session.put("section", sectionbiz.findbyId(section));
		return "update1";
    }
    
  //按编号查询
    public String findbyId(){
    	session.put("section", sectionbiz.findbyId(section));
		return SUCCESS;
    }
    
    
  //按名称查询
    public String findbyName(){
    	session.put("section", sectionbiz.findbyName(section));
		return SUCCESS;
    }
	
}
