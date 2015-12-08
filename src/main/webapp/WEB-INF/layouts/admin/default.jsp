<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<!DOCTYPE html>
<html style="overflow-x:auto;overflow-y:auto;">
<head>
	<title><sitemesh:title/></title>
	<sitemesh:head/>
</head>
<body>
	<%@include file="/WEB-INF/layouts/admin/header.jsp" %>
	<%@include file="/WEB-INF/layouts/admin/sidebar.jsp" %>
	<sitemesh111:body/>
	<div style="height: 600px; width: 100%;">
		<iframe src="${ctx }/admin/welcome" name="product" style="height: 100%; width: 100%;"></iframe>
	</div>
	<%@include file="/WEB-INF/layouts/admin/footer.jsp" %>
</body>
</html>