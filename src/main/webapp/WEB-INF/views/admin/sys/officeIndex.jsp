<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="main-menu" content="2"/>
<meta name="menu" content="menu-5"/>
<title>菜单列表</title>
<%@ include file="/WEB-INF/views/include/treeview.jsp" %>
</head>
<body>
<div class="console-container">
	<div class="row">
		<div class="col-ms-2">
			<div id="ztree" class="ztree"></div>
		</div>
		<div class="col-ms-10">
		</div>
	</div>
	<script>
	var setting = {data:{simpleData:{enable:true,idKey:"id",pIdKey:"pId",rootPId:'0'}},
		callback:{onClick:function(event, treeId, treeNode){
				var id = treeNode.pId == '0' ? '' :treeNode.pId;
				$('#officeContent').attr("src","${ctxAdmin}/sys/office/list?id="+id+"&parentIds="+treeNode.pIds);
			}
		}
	};
	
	function refreshTree(){
		$.getJSON("${ctxAdmin}/sys/office/treeData",function(data){
			console.log($.fn.zTree);
			$.fn.zTree.init($("#ztree"), setting, data).expandAll(true);
		});
	}
	refreshTree();
	</script>
</div>
</body>
</html>