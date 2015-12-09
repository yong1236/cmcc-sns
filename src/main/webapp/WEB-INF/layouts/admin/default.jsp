<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<!DOCTYPE html>
<html style="overflow-x:auto;overflow-y:auto;">
<head>
	<title>管理控制台：<sitemesh:title/></title>
	<meta name="description" content="管理控制台">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <link rel="stylesheet" href="${ctx }/static/admin/styles/main.css">
    <link rel="stylesheet" href="${ctx }/static/admin/styles/console.css">
    <script src="${ctx }/static/admin/scripts/vendor/modernizr.js"></script>
    
	<sitemesh:head/>
</head>
<body>
	<!--[if lt IE 10]>
      <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
    <![endif]-->
    
    <div class="viewFramework-topbar">
	  <%@include file="/WEB-INF/layouts/admin/header.jsp" %>
	</div>
	<div class="viewFramework-body viewFramework-sidebar-full">
	  <div class="viewFramework-sidebar">
	    <%@include file="/WEB-INF/layouts/admin/sidebar.jsp" %>
	  </div>
	  <div class="viewFramework-product">
	    <div class="viewFramework-product-body">
	      <sitemesh:body/>
	    </div>
	  </div>
	</div>
	<%@include file="/WEB-INF/layouts/admin/footer.jsp" %>
	
	<script src="${ctx }/static/admin/scripts/vendor.js"></script>
    <script src="${ctx }/static/admin/scripts/plugins.js"></script>
    <script src="${ctx }/static/admin/scripts/main.js"></script>
</body>
</html>