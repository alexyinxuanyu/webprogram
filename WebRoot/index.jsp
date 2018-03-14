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
            <a href="<%=basePath%>" target="_parent">人力资源管理系统
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
            <li><a href="<%=basePath%>http://www.865171.cn">Home</a></li>
            <li><a href="<%=basePath%>http://www.865171.cn">CSS</a></li>
            <li><a href="<%=basePath%>http://www.865171.cn">Flash</a></li>
            <li><a href="<%=basePath%>http://www.865171.cn">Gallery</a></li>
            <li><a href="<%=basePath%>http://www.865171.cn">Blog</a></li>
        </ul>
    
    </div>

</div>  

<div id="templatemo_content">
<div id="main_column">               
<div class="section_w560">
           <div id="containerqweeww" style="background-image:url(image/88N58PIChwD_1024.jpg) ;background-repeat:no-repeat;text-align:center;width:500px; height:300px"  >
    <br/><br/><br/><br/><br/><br/><br/><br/><a href="<%=basePath%>login.jsp">登录</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="<%=basePath%>register.jsp">注册</a>
                     
                

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