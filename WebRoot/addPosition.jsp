<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>岗位增加</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="css/templatemo_style.css" rel="stylesheet" type="text/css" />
	<link href="css/s3slider.css" rel="stylesheet" type="text/css" />
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
            <li class="first"><a href="http://www.865171.cn">尹轩宇</a></li>
            <li><a href="http://www.865171.cn">陈万生</a></li>
            <li><a href="http://www.865171.cn">徐德立</a></li>
            <li><a href="http://www.865171.cn">李倩倩</a></li>
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
            <li><a href="<%=basePath%>employee/Employee_wel!show" class="current fast">入职管理</a></li>
            <li><a href="<%=basePath%>position/positionManager!doGetAllByPage?pageIndex=1" target="_parent">岗位管理</a></li>
            <li><a href="<%=basePath%>section/sectionManager!tosectionManager" target="_parent">部门管理</a></li>
            <li><a href="<%=basePath%>leave/Leave_wel!show">离职管理</a></li>
        </ul>
    
    </div> <!-- end of menu -->

</div> <!-- end of menu wrapper -->

<div id="templatemo_content">
<div align="center">
     <h2>岗位增加界面</h2> 
    <form action="<%=basePath%>position/Position_addPosition!addPosition" method="post">
    <table>
         <tr>
        <td>岗位名称</td><td><input type="text" name="position.position_name"/></td>
        </tr>
        <tr>
        <td>岗位类别</td><td><select name="position.position_type">
   			<option value="管理者" >管理者</option>
   			<option value="员工" >员工</option>
   			</select></td>
        </tr>
        <tr>
        <td>电话</td><td><input type="text" name="position.position_number"/></td>
        </tr>
        <tr>
        <td>岗位职责</td><td><input type="text" name="position.position_vacation"/></td>
        </tr>      
        <tr>       
        <td><input type="submit" value="提交"/>&nbsp;&nbsp;<input type="reset" value="重置"/></td>
        </tr>
        </table>
        
  </form>
  </div>
 
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
  </body>
</html>
