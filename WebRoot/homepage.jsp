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
            <p>人力資源は6つのモジュールに分ける。一、人力資源計画の二、人員採用と配置の三、研修開発と実施、5、報酬の福祉。機能は4元、部門は管理して、職位は管理

して、従業員は職務管理、従業員の離職管理。</p>
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

 <div id="main_column">
            
                <div class="section_w560">
                    <h2>员工入职管理</h2>
                    
                     <img class="image_wrapper fl_image" src="images/templatemo_image_04.jpg" alt="image" />
                   
                    <p>This <a href="http://www.865171.cn" target="_parent">website template</a> is provided by <a href="http://www.865171.cn" 

target="_parent">www.865171.cn</a> for free of charge. You may download, edit and apply this template for your websites. Credit goes to <a 

href="http://www.865171.cn" target="_blank">www.865171.cn</a> for photos.</p>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed et quam vitae ipsum vulputate varius vitae semper nunc. Quisque eget elit 

quis augue pharetra feugiat. Suspendisse turpis arcu, dignissim ac laoreet.</p>
                    <br/><div class="button bottom_02"><a href="<%=basePath%>employee/Employee_wel!show">View All</a></div>
                <div class="cleaner"></div>
                </div>
                
                <div class="cleaner_h50"></div>
                
<div class="section_w560">
                
                  <h2>员工离职管理</h2>
					
                     <img class="image_wrapper fr_image" src="images/templatemo_image_01.jpg" alt="image" />              
                   
                    <p>Suspendisse feugiat, augue ac tincidunt vestibulum, ligula orci tincidunt arcu, quis scelerisque ante magna quis urna. Ut quis est congue 

dui porttitor porta. Suspendisse eu erat at nunc luctus rhoncus ut ut purus. Duis mollis dignissim fringilla. </p>
                    <p>In hac habitasse platea dictumst. Nullam orci ante, tempor ac blandit eget, tristique non neque. Pellentesque eu leo tortor. Mauris et 

lectus eget elit sodales mattis ac id ligula. Quisque fermentum malesuada felis at suscipit. </p>
      <div class="cleaner_h20"></div>
                    <ul class="list_01">
                      <li>Cum sociis natoque penatibus et magnis dis parturient montes, nascetur.</li>
                        <li>Nulla facilisi. Phasellus posuere justo id nunc bibendum convallis.</li>
                        <li>Aliquam sed nisi nulla, sit amet commodo arcu.</li>
                        <li>Sed sagittis, mauris vel fringilla varius, lacus diam faucibus nisl.</li>
                  </ul>
                  
                    
					<div class="button bottom_01"><a href="<%=basePath%>leave/Leave_wel!show">View All</a></div>    
                </div>
                
                <div class="cleaner"></div>
            </div> <!-- end of main column -->
            
            <div id="side_column">
            
                <div class="side_column_box">
                    <h2>部门管理</h2>
                    
                    <div class="news_section">
                    	<img class="image_wrapper" src="images/templatemo_image_02.jpg" alt="image" />
                        <h3>Etiam tempus tellus eget </h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas et ipsum sem, ut lobortis dui. <a href="http://www.865171.cn">Read 

more...</a></p>
                    </div>
                    <div class="button bottom_02"><a href="<%=basePath%>position/positionManager!doGetAllByPage?pageIndex=1">View All</a></div>
                    <div class="news_section">
                    	<img class="image_wrapper" src="images/templatemo_image_03.jpg" alt="image" />
                        <h3>Nam quis aliquet quam</h3>
                        <p>Sed pharetra neque vel mauris auctor ornare. Maecenas urna lorem, consectetur eget consectetur id. <a 

href="http://www.865171.cn">Read more...</a></p>
                    </div>
                    
                    <div class="button bottom_02"><a href="<%=basePath%>section/sectionManager!tosectionManager">View All</a></div>   
                </div>
                
                <div class="cleaner_h20"></div>
                
                <div class="side_column_box">
                
                    <h2>岗位管理</h2>
                    <form action="http://www.865171.cn" method="get">
                        <input type="text" value="Enter your email address..." name="q" size="10" class="inputfield" title="searchfield" onfocus="clearText

(this)" onblur="clearText(this)" />
                        
                        <input type="submit" name="Subscribe" value="Subscribe" alt="Subscribe" class="submitbutton" title="Search" />
                    </form>
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
</body>
</html>