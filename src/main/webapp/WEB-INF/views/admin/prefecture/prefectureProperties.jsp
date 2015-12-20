<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="main-menu" content="2"/>
<meta name="menu" content="menu-8"/>
<title>专区属性</title>
</head>
<body>
<div class="console-container">
	<div class="row">
      <div class="col-sm-12">
        <div class="console-global-notice">
          <div class="console-global-notice-list">
            <!-- TODO: 由通知模块实时填充 -->
            <!-- 单个通知的样式模板暂时还没有采集到，留后补充 -->
          </div>
          <div class="console-title console-title-border clearfix">
            <div class="pull-left">
              <h4>${not empty prefecture.id?'修改':'添加'}</h4>
            </div>
            <div class="pull-right">
              <a class="btn btn-default" href="${ctxAdmin }/sys/menu/">
                <i class="glyphicon glyphicon-refresh"></i>
                返回专区列表
              </a>
            </div>
          </div>
        </div>
      </div>
    </div>
    
    <div class="row">
    	<div class="col-sm-12">
    		<form:form id="inputForm" modelAttribute="prefecture" action="${ctxAdmin }/sys/prefecture/save" method="post" class="form-horizontal">
				<form:hidden path="id"/>
    			<div class="form-group">
					<label class="col-sm-4 control-label"><font color="red">*</font> 名称:</label>
					<div class="col-sm-4 controls">
						<form:input path="name" htmlEscape="false" maxlength="50" class="form-control required input-xlarge"/>
						<span class="help-inline"></span>
					</div>
				</div>
    		</form:form>
    	</div>
    </div>	
</div>
</body>
</html>