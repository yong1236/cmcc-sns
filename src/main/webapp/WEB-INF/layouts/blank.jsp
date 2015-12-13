<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<!DOCTYPE html>
<html style="overflow-x:auto;overflow-y:auto;">
<head>
	<title><sitemesh:title/></title><!--  - Powered By JeeSite -->
	<%@include file="/WEB-INF/views/include/head.jsp" %>
	<script src="${ctx }/static/admin/scripts/main.js"></script>
	<sitemesh:head/>
</head>
<body>
	<sitemesh:body/>
</body>
</html>