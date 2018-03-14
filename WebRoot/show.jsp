<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

 <base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Company Template, CSS Template, Free Web Template</title>
<meta name="keywords" content="company template, free website templates, green color bar, CSS, HTML" />
<meta name="description" content="Company Template (Green) is a free website template provided by www.865171.cn" />
<link href="<%=basePath%>css/templatemo_style.css" rel="stylesheet" type="text/css" />
<link href="<%=basePath%>css/s3slider.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/s3Slider.js"></script>
<script type="text/javascript">
    $(document).ready(function() {
        $('http://www.865171.cnslider').s3Slider({
            timeOut: 3000
        });
    });
</script>

<script language="javascript" type="text/javascript">
function clearText(field)
{
    if (field.defaultValue == field.value) field.value = '';
    else if (field.value == '') field.value = field.defaultValue;
}
</script>
</head>
<body>

 <div id="templatemo_site_title_bar_wrapper">




    <div id="templatemo_site_title_bar">
        <div id="site_title">
            <h1>
            <a href="<%=basePath%>homepage.jsp" target="_parent">人力资源管理系统
            <span>Human	Resource</span></a>
            </h1>
        </div>
        
        <ul id="top_menu">
            <li class="first"><a href="<%=basePath%>http://www.865171.cn">尹轩宇</a></li>
            <li><a href="<%=basePath%>http://www.865171.cn">陈万生</a></li>
            <li><a href="<%=basePath%>http://www.865171.cn">徐德立</a></li>
            <li><a href="<%=basePath%>http://www.865171.cn">李倩倩</a></li>
        </ul>
    
    </div>
</div> 

<div id="templatemo_banner_wrapper">

	<div id="templatemo_banner">
    
          <div id="slider">
                    <ul id="sliderContent">
                        <li class="sliderImage">
                            <a href="<%=basePath%>http://www.865171.cn" target="_blank"><img src="gallery/01.jpg" alt="1" /></a>
                            <span class="bottom"><strong>Project 1</strong><br />Suspendisse turpis arcu, dignissim ac laoreet a, condimentum in massa.</span>
                        </li>
                        <li class="sliderImage">
                            <a href="<%=basePath%>http://www.865171.cn" target="_blank"><img src="gallery/02.jpg" alt="2" /></a>
                            <span class="bottom"><strong>Project 2</strong><br />uisque eget elit quis augue pharetra feugiat.</span>
                        </li>
                        <li class="sliderImage">
                            <a href="<%=basePath%>http://www.865171.cn" target="_blank"><img src="gallery/03.jpg" alt="3" /></a>
                            <span class="bottom"><strong>Project 3</strong><br />Sed et quam vitae ipsum vulputate varius vitae semper nunc.</span>
                        </li>
                        <li class="sliderImage">
                            <a href="<%=basePath%>http://www.865171.cn" target="_blank"><img src="gallery/04.jpg" alt="4" /></a>
                            <span class="bottom"><strong>Project 4</strong><br />Lorem ipsum dolor sit amet, consectetur adipiscing elit.</span>
                        </li>
                    </ul>
                    <div class="clear sliderImage"></div>
                </div>
   
    	
        <div id="banner_content">
            <h2>人的資源管理システムを歓迎する</h2>
            <p>人力資源は6つのモジュールに分ける。一、人力資源計画の二、人員採用と配置の三、研修開発と実施、5、報酬の福祉。機能は4元、部門は管理して、職位は管理

して、従業員は職務管理、従業員の離職管理。</p>
            <a href="<%=basePath%>http://www.865171.cn" target="_parent">Read more</a>
        </div>

	</div>

</div>

<div id="templatemo_menu_wrapper">

	<div id="templatemo_menu">
    
   		<ul>
            <li><a href="<%=basePath%>employee/Employee_wel!show" class="current fast">入职管理</a></li>
            <li><a href="<%=basePath%>position/positionManager!doGetAllByPage?pageIndex=1" target="_parent">岗位管理</a></li>
            <li><a href="<%=basePath%>section/sectionManager!tosectionManager" target="_parent">部门管理</a></li>
            <li><a href="<%=basePath%>leave/Leave_wel!show">离职管理</a></li>
            
        </ul>
    
    </div>

</div>  

<div id="templatemo_content">
<div id="main_column">               
<div class="section_w560">
            
  	
  	
  	                <center>    
                  <h2>员工入职管理</h2>
  	
  	
  	<form action="<%=basePath%>employee/Employee_show!byemid" method="post">
  		<p>员工编号：&nbsp;
  		&nbsp;<input type="text" name="employee.staff_id"/>
  		&nbsp;&nbsp;<input type="submit" value="查询"/></p>
  		
  	</form>
  	<form action="<%=basePath%>employee/Employee_show!byidcard" method="post">
  		<p>身份证号：&nbsp;
  		&nbsp;<input type="text" name="employee.staff_salary"/>
  		&nbsp;&nbsp;<input type="submit" value="查询"/></p>
  		
  	</form>
  	<!-- <form action="employee/Employee_show!bydeid" method="post">
  		<p>部门编号：&nbsp;
  		&nbsp;<input type="text" name="employee.department.department_Id"/>
  		&nbsp;&nbsp;<input type="submit" value="查询"/></p>
  	</form>
  	<form action="employee/Employee_show!bypoid" method="post">
  		<p>岗位编号：&nbsp;
  		&nbsp;<input type="text" name="employee.position.position_Id"/>
  		&nbsp;&nbsp;<input type="submit" value="查询"/></p>
  	</form> -->
    <table>
    	<tr>
    		<td>员工编号</td>
    		<td>员工姓名</td>
    		<td>员工岗位</td>
    		<td>员工职位</td>
    		<td>入职时间</td>
    		<td>入职情况</td>
    		<td>完成时间</td>
    		<td>身份证号</td>
    	</tr>
    	<s:iterator value="#session.emp_list" id="emp">
    	  <tr>
    		<td><s:property value="#emp.staff_id"/></td>
    		<td><s:property value="#emp.staff_name"/></td>
    		<td><s:property value="#emp.section.section_id"/></td>
    		<td><s:property value="#emp.position.position_id"/></td>
    		<td><s:property value="#emp.staff_entryapplytime"/></td>
    		<td><s:property value="#emp.staff_entrycondition"/></td>
    		<td><s:property value="#emp.staff_entrycomplytime"/></td>
    		<td><s:property value="#emp.staff_salary"/></td>
    		<td><a href="<%=basePath%>employee/Employee_wel!toUpdate?employee.staff_id=<s:property value="#emp.staff_id"/>">修改</a>&nbsp;<a href="<%=basePath%>employee/Employee_wel!todel?employee.staff_id=<s:property value="#emp.staff_id"/>">删除</a></td>
    	  </tr>
    	</s:iterator>
    	<tr>
    		<td><a href="<%=basePath%>employee/Employee_wel!toAdd">添加</a></td>
    	</tr>
    </table>
    <table>  
    <tr>  
        <td>　  
           <b>当前第<s:property value="page"/> 页,
           	      共<s:property value="Num"/>条记录,
           	      共分<s:property value="totalPage"/>页
           </b> 
        </td>  
    </tr>    
        <tr>  
            <td>  
             <p>  
           <a href="<%=basePath%>employee/Employee_wel!show?page=1">首 页</a>  
            <s:if test="page<=1">
            		上一页
            </s:if>  
            <s:else>  
                <a href="<%=basePath%>employee/Employee_wel!show?page=<s:property value="page-1" />">上一页  </a>  
            </s:else>  
            <s:if test="page>=totalPage">  
            	下一页  
            </s:if>  
        <s:else>  
        <a href="<%=basePath%>employee/Employee_wel!show?page=<s:property value="page+1" />">下一页</a>  
        </s:else>  
           <a href="<%=basePath%>employee/Employee_wel!show?page=<s:property value="totalPage"/>">尾页</a>  
                </p>  
            </td>  
        </tr>  
	</table>  
    </center>
                     
                

</div> <!-- end of main column -->
</div> <!-- end of side column -->
	
	<div class="cleaner"></div>   
</div> 

<div id="templatemo_footer_wrapper">

	<div id="templatemo_footer">
    
        <ul class="footer_menu">
            <li><a href="<%=basePath%>http://www.865171.cn">Home</a></li>
            <li><a href="<%=basePath%>http://www.865171.cn">CSS</a></li>
            <li><a href="<%=basePath%>http://www.865171.cn">Flash</a></li>
            <li><a href="<%=basePath%>http://www.865171.cn">Gallery</a></li>
            <li><a href="<%=basePath%>http://www.865171.cn">Blog</a></li>
            <li class="last_menu"><a href="<%=basePath%>http://www.865171.cn">Contact</a></li>
        </ul>

        Copyright © 2010 <a href="<%=basePath%>http://www.865171.cn">Your Company Name</a> | 
        Designed by <a href="<%=basePath%>http://www.865171.cn" target="_parent">www.865171.cn</a> | 
        Validate <a href="<%=basePath%>http://validator.w3.org/check?uri=referer">XHTML</a> &amp; <a href="<%=basePath%>http://jigsaw.w3.org/css-

validator/check/referer">CSS</a>
    </div> 
    
</div> 

</body>
</html>