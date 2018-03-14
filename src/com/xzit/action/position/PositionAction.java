package com.xzit.action.position;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xzit.biz.position.IPositionBiz;
import com.xzit.biz.position.impl.PositionBizImpl;
import com.xzit.vo.position.position;

public class PositionAction extends ActionSupport {
	private position position;
private String pagenum;
	
	public String getPagenum() {
		return pagenum;
	}

	public void setPagenum(String pagenum) {
		this.pagenum = pagenum;
	}

	public position getPosition() {
		return position;
	}

	public void setPosition(position position) {
		this.position = position;
	}
	ActionContext context=ActionContext.getContext();
	Map session=context.getSession();
	IPositionBiz positionbiz = new PositionBizImpl();
	//List<position> positionList = null;
	
	public String doGetAllByPage(){
		int count = positionbiz.getPositionCount();//һ����count������
		int maxPage = 0;
		if(count%2==0){//һ������maxpage��ҳ��
			maxPage = count/2;
		}else if(count%2>=1&&count%2<=1){
			maxPage = count/2+1;
		}
		//��ȡҳ����
		int pageNo = 0;
		String strpageNo = pagenum;//��ҳ���ȡҳ����
		if(strpageNo==null){
					pageNo = 1;
				}else{
					pageNo = Integer.parseInt(strpageNo);
				}
				if(pageNo==0){
					pageNo = 1;
				}
				if(positionbiz.getPositionCount()!=0){						
					session.put("position", positionbiz.getAllByPage(pageNo));
					session.put("maxPage", maxPage);
					session.put("pageNo", pageNo);
					return SUCCESS;
				}
				return ERROR;
	}
	
	public String topositionManager(){
		session.put("position", positionbiz.findAll());
		return SUCCESS;
	}
	
	//����	
	public String toAdd(){
		return "toAdd";
	}
	public String addPosition(){
		System.out.println("�������Ϊ"+position.getPosition_name()+"�Ĳ���");
		if(position.getPosition_name()!=null){
			positionbiz.addPosition(position);
			int pageNo=1;
			List<position> posList=positionbiz.getAllByPage(pageNo);
			session.put("position", posList);			
			return SUCCESS;
		}
		return ERROR;
	}
	
	//ɾ��
	public String deletePosition(){
		System.out.println("ɾ������Ϊ"+position.getPosition_name()+"�Ĳ���");
		positionbiz.deletePosition(position);
		return this.topositionManager();
	}
	 //�޸�
   
    public String isUpdatePosition(){    	
    	int id=(Integer) session.get("id");
    	position.setPosition_id(id);
    	positionbiz.updetePosition(position);
    	int pageNo=1;
		List<position> posList=positionbiz.getAllByPage(pageNo);
		session.put("position", posList);
    	return SUCCESS;
    }
    public String findbyId1(){
    	session.put("id", position.getPosition_id());
    	session.put("position", positionbiz.findbyId(position));
		return "update1";
    }
    
  //����Ų�ѯ
    public String findbyId(){
    	session.put("position", positionbiz.findbyId(position));
		return SUCCESS;
    }
    
    
  //�����Ʋ�ѯ
    public String findbyName(){
    	session.put("position", positionbiz.findbyName(position));
		return SUCCESS;
    }
    
    public String findbyType(){
    	session.put("position", positionbiz.findbyType(position));
    	return SUCCESS;
    }

}
