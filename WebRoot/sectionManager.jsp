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
<title>部门管理</title>
<meta name="keywords" content="company template, free website templates, green color bar, CSS, HTML" />
<meta name="description" content="Company Template (Green) is a free website template provided by www.865171.cn" />
<link href="<%=basePath%>css/templatemo_style.css" rel="stylesheet" type="text/css" />
<link href="<%=basePath%>css/s3slider.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/s3Slider.js"></script>
	<style type="text/css">
	*{
	margin:0px auto;
	text-decoration:none;
	}
	
	.table1{
	width:520px;
	height:80px;
	margin-top:30px;	
	margin-left:35px;
	text-align:center;
	}
.table2{
	width:532px;
	height:197px;
	border-top:2px solid #C9C;
	border-bottom:2px solid #C9C;
	margin-top:30px;	
	
	text-align:center;
}
	/*第一行开始*/
.one{
	font-weight:bold;
	font-size:18px;
	color:#804000;
	background-color:#E6E1E4;
	height:28px;
 }
	.table2.tr{
	height:30px;
	}
	.table2.tr.td{
	border:1px solid #C9C;
	width:80px;
	border-left:none;
	border-bottom:none;
	}
	</style>
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
<body><br><div align="center""><div id="templatemo_site_title_bar_wrapper">

    <div id="templatemo_site_title_bar">
        <div id="site_title">
            <h1>
            <a href="<%=basePath%>homepage.jsp" target="_parent">人力资源管理系统
            <span>Human	Resource</span></a>
            </h1>
        </div>
        
        <ul id="top_menu">
            <li class="first"><a href="http://www.865171.cn">尹轩宇</a></li>
            <li><a href="http://www.865171.cn">陈万生</a></li>
            <li><a href="http://www.865171.cn">徐德立</a></li>
            <li><a href="section/sectionManager!tosectionManager">李倩倩</a></li>
        </ul>
    
    </div> <!-- end of site title bar -->
</div> <!-- end of site title bar wrapper -->

<div id="templatemo_banner_wrapper">

	<div id="templatemo_banner">
    
          <div id="slider">
                    <ul id="sliderContent">
                        <li class="sliderImage">
                            <a href="http://www.865171.cn" target="_blank"><img src="gallery/01.jpg" alt="1" /></a>
                            <span class="bottom"><strong>Project 1</strong><br />Suspendisse turpis arcu, dignissim ac laoreet a, condimentum in massa.</span>
                        </li>
                        <li class="sliderImage">
                            <a href="http://www.865171.cn" target="_blank"><img src="gallery/02.jpg" alt="2" /></a>
                            <span class="bottom"><strong>Project 2</strong><br />uisque eget elit quis augue pharetra feugiat.</span>
                        </li>
                        <li class="sliderImage">
                            <a href="http://www.865171.cn" target="_blank"><img src="gallery/03.jpg" alt="3" /></a>
                            <span class="bottom"><strong>Project 3</strong><br />Sed et quam vitae ipsum vulputate varius vitae semper nunc.</span>
                        </li>
                        <li class="sliderImage">
                            <a href="http://www.865171.cn" target="_blank"><img src="gallery/04.jpg" alt="4" /></a>
                            <span class="bottom"><strong>Project 4</strong><br />Lorem ipsum dolor sit amet, consectetur adipiscing elit.</span>
                        </li>
                    </ul>
                    <div class="clear sliderImage"></div>
                </div>
   
    	
        <div id="banner_content">
            <h2>人的資源管理システムを歓迎する</h2>
            <p>人力資源は6つのモジュールに分ける。一、人力資源計画の二、人員採用と配置の三、研修開発と実施、5、報酬の福祉。機能は4元、部門は管理して、職位は管理して、従業員は職務管理、従業員の離職管理。</p>
            <a href="http://www.865171.cn" target="_parent">Read more</a>
        </div>

	</div> <!-- end of banner-->

</div> <!-- end of banner wrapper -->

<div id="templatemo_menu_wrapper">

	<div id="templatemo_menu">
    
   		<ul>
            <li><a href="employee/Employee_wel!show" class="current fast">入职管理</a></li>
            <li><a href="position/positionManager!doGetAllByPage?pageIndex=1" target="_parent">岗位管理</a></li>
            <li><a href="section/sectionManager!tosectionManager" target="_parent">部门管理</a></li>
            <li><a href="leave/Leave_wel!show">离职管理</a></li>
            
        </ul>
    
    </div> <!-- end of menu -->

</div> <!-- end of menu wrapper -->

<div id="templatemo_content">

 <div id="main_column">
            
                <div class="section_w560">
                  <h2>部门管理</h2>
                  <table class="table1">
				<tr>
					<td><h4>根据部门编号查询：</h4></td>
					<td><form action="<%=basePath%>section/sectionfindbyId!findbyId" method="post">
					  <input type="text" name="section.section_id" />
					  &nbsp;<input type="submit" value="查询" />（请输入部门编号）
					
			</form></td>
				</tr>
                
				<tr>
					<td><h4>根据部门名称查询：</h4></td>
					<td><form action="<%=basePath%>section/sectionfindbyName!findbyName" method="post">
				    <input type="text" name="section.section_name" />
                	&nbsp;<input type="submit" value="查询" />（请输入部门名称）
				
			</form></td>
				</tr>
			</table>
<br/><div class="button bottom_02"></div>
                <div class="cleaner"></div>
    </div>
                
                <div class="cleaner_h50"></div>
                
<div class="section_w560">
  <table class="table2" border="1" cellpadding="0" cellspacing="0">
  <tr class="one">
					<td width="80">
						部门id号
					</td>
					<td width="80">
						部门名称
		  </td>
					<td width="80">
						部门所属地
					</td>
					<td width="80">
						电话
					</td>
					<td width="80">
						传真
					</td>
					<td width="80">
						成立日期
					</td>
					<td width="80">
						操作
					</td>
		</tr>
				<s:iterator value="#session.section" id="section" status="stat">
					<tr height="40">
						<td>
							<s:property value="#section.section_id" />
						</td>
						<td>
							<s:property value="#section.section_name" />
						</td>
						<td>
							<s:property value="#section.section_organ" />
						</td>
						<td>
							<s:property value="#section.section_phone" />
						</td>
						<td>
							<s:property value="#section.section_fax" />
						</td>
						<td>
							<s:property value="#section.section_date" />
						</td>
						<td>
							<a
								href="<%=basePath%>section/Section_Update!findbyId1?section.section_id=<s:property value="#section.section_id"/>">修改</a>&nbsp;
							<a
								href="<%=basePath%>section/Section_deleteSection!deleteSection?section.section_id=<s:property value="#section.section_id"/>">删除</a>
						</td>
					</tr>
				</s:iterator>
				<tr>
					<td colspan="12" align="center">
						共
						<s:property value="#session.maxpage" />
						页&nbsp;&nbsp; 当前第
						<s:property value="#session.pageNo" />
						页&nbsp;&nbsp;<a href="<%=basePath%>section/sectionManager!tosectionManager?pagenum=1">首页</a>
						<a
							href="<%=basePath%>section/sectionManager!tosectionManager?pagenum=<s:property value="#session.pageNo-1"/>">
							<s:if test="#session.pageNo-1>0">上一页</s:if> </a>&nbsp;&nbsp;
						<a
							href="<%=basePath%>section/sectionManager!tosectionManager?pagenum=<s:property value="#session.pageNo+1"/>">
							<s:if test="#session.pageNo<#session.maxpage">下一页</s:if> </a>
					</td>
				</tr>
	  </table><br/>
<div class="cleaner_h20"></div>
<div class="button bottom_01"></div>    
    </div>
                
                <div class="cleaner"></div>
  </div> <!-- end of main column -->
            
            <div id="side_column">
              <div class="cleaner_h20"></div>
                
                <div class="side_column_box">
                
                  <h2><a href="<%=basePath%>section/Section_addSection!toAdd">添加部门</a>                  </h2>
</div>

  </div> <!-- end of side column -->

	<div class="cleaner"></div>
    
</div> <!-- end of content -->

<div id="templatemo_footer_wrapper">

	<div id="templatemo_footer">
    
        <ul class="footer_menu">
            <li><a href="http://www.865171.cn">Home</a></li>
            <li><a href="http://www.865171.cn">CSS</a></li>
            <li><a href="http://www.865171.cn">Flash</a></li>
            <li><a href="http://www.865171.cn">Gallery</a></li>
            <li><a href="http://www.865171.cn">Blog</a></li>
            <li class="last_menu"><a href="http://www.865171.cn">Contact</a></li>
        </ul>

        Copyright © 2010 <a href="http://www.865171.cn">Your Company Name</a> | 
        Designed by <a href="http://www.865171.cn" target="_parent">www.865171.cn</a> | 
        Validate <a href="http://validator.w3.org/check?uri=referer">XHTML</a> &amp; <a href="http://jigsaw.w3.org/css-validator/check/referer">CSS</a>
    </div> <!-- end of footer -->
    
</div> <!-- end of footer wrapper -->
</div>
</body>
</html>