<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="decorator" content="admin-blank"/>
<title>菜单属性</title>
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
              <h4>${not empty office.id?'修改':'添加'}</h4>
            </div>
            <div class="pull-right">
              <a class="btn btn-default" href="${ctxAdmin }/sys/office/list?id=">
                <i class="glyphicon glyphicon-refresh"></i>
                返回组织机构列表
              </a>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="row">
    	<div class="col-sm-12">
    		<form:form id="inputForm" modelAttribute="office" action="${ctxAdmin }/sys/office/save" method="post" class="form-horizontal">
    			<form:hidden path="id"/>
    			<div class="form-group">
    				<label class="control-label col-sm-3">上级组织</label>
    				<div class="col-sm-9 row">
    					<form:input path="parent.name" class="col-lg-5 col-sm-5"/>
    					<span class="help-inline col-lg-7 col-sm-7">选择上级组织</span>
    				</div>
    			</div>
    			<div class="form-group">
    				<label class="control-label col-sm-3"><span class="red">*</span> 机构名称</label>
    				<div class="col-sm-9 row">
    					<form:input path="name" class="col-lg-5 col-sm-5"/>
    					<span class="help-inline col-lg-7 col-sm-7"></span>
    				</div>
    			</div>
    			<div class="form-group">
    				<label class="control-label col-sm-3">机构编码</label>
    				<div class="col-sm-9 row">
    					<form:input path="code" class="col-lg-5 col-sm-5"/>
    					<span class="help-inline col-lg-7 col-sm-7"></span>
    				</div>
    			</div>
    			<div class="form-group">
    				<label class="control-label col-sm-3">备注</label>
    				<div class="col-sm-9 row">
    					<form:textarea path="remarks" class="col-sm-7"/>
    					<span class="help-inline col-sm-10"></span>
    				</div>
    			</div>
    			<div class="form-group">
    				<button type="submit" class="btn btn-primary col-sm-offset-3">保存</button>
    			</div>
    		</form:form>
    	</div>
    </div>
</div>
</body>
</html>	