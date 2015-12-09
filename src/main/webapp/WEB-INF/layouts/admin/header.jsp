<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<div class="console-topbar">
  <div class="topbar-wrap topbar-clearfix">
    <div class="topbar-head topbar-left">
      <a href="${ctx }/admin/" class="topbar-logo"><i class="icon icon-logo"></i></a>
      <a href="${ctx }/admin/" class="topbar-home-link topbar-btn">管理控制台</a>
    </div>

    <div class="topbar-nav topbar-left">
      <a href="#" class="dropdown-toggle topbar-btn topbar-nav-btn" data-toggle="dropdown">
        <span class="ng-binding">产品与服务</span> <span class="icon-arrow-down caret"></span>
      </a>
      <div class="dropdown-menu topbar-nav-list topbar-clearfix">
        <ul class="dropdown-menu1 col-1">
          <li><a href="#">Action</a></li>
          <li><a href="#">Another action</a></li>
          <li><a href="#">Something else here</a></li>
          <li role="separator" class="divider"></li>
          <li><a href="#">Separated link</a></li>
          <li role="separator" class="divider"></li>
          <li><a href="#">One more separated link</a></li>
        </ul>
      </div>
    </div>

    <div class="topbar-info topbar-right"><!-- navbar-right 解决最后一个dropdown定位超出屏幕外的问题 -->
      <div class="dropdown user-info topbar-info-item">
        <a href="#" class="topbar-btn">消息 <span class="badge">37</span></a>
      </div>
      <div class="dropdown user-info topbar-info-item">
        <a href="#" class="dropdown-toggle topbar-btn" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">帮助 <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Action</a></li>
          <li><a href="#">Another action</a></li>
          <li><a href="#">Something else here</a></li>
          <li role="separator" class="divider"></li>
          <li><a href="#">Separated link</a></li>
        </ul>
      </div>
      <div class="dropdown user-info topbar-info-item">
        <a href="#" class="dropdown-toggle topbar-btn" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">tonyeen@foxmail.com <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Action</a></li>
          <li><a href="#">Another action</a></li>
          <li><a href="#">Something else here</a></li>
          <li role="separator" class="divider"></li>
          <li><a href="#">Separated link</a></li>
        </ul>
      </div>
    </div>

    <!--<ul class="nav navbar-nav">
      <li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>
      <li><a href="#">Link</a></li>
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Action</a></li>
          <li><a href="#">Another action</a></li>
          <li><a href="#">Something else here</a></li>
          <li role="separator" class="divider"></li>
          <li><a href="#">Separated link</a></li>
          <li role="separator" class="divider"></li>
          <li><a href="#">One more separated link</a></li>
        </ul>
      </li>
    </ul>
    <form class="navbar-form navbar-left" role="search">
      <div class="form-group">
        <input type="text" class="form-control" placeholder="Search">
      </div>
      <button type="submit" class="btn btn-default">Submit</button>
    </form>

    <ul class="nav navbar-nav navbar-right">
      <li><a href="#">Link</a></li>
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Action</a></li>
          <li><a href="#">Another action</a></li>
          <li><a href="#">Something else here</a></li>
          <li role="separator" class="divider"></li>
          <li><a href="#">Separated link</a></li>
        </ul>
      </li>
    </ul>-->
  </div>
</div>