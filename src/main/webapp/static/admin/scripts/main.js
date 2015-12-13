//console.log("'Allo 'Allo!");

//获取URL地址参数
function getQueryString(name, url) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
    if (!url || url == ""){
	    url = window.location.search;
    }else{	
    	url = url.substring(url.indexOf("?"));
    }
    r = url.substr(1).match(reg)
    if (r != null) return unescape(r[2]); return null;
}

/**
 * Created by Tony on 2015/10/19.
 */
!function(w, $){

  $(".sidebar-fold").click(function(){
    $(".viewFramework-body").toggleClass("viewFramework-sidebar-full").toggleClass("viewFramework-sidebar-mini");
  });

  $(".sidebar-nav .sidebar-title").click(function(){
    $(this).parent().toggleClass("sidebar-nav-fold");
    $(this).siblings(".sidebar-trans").slideToggle(240);
  });

  //TODO: 解决方法（API）导出的问题
  /*w.setActiveMenu = function(x, y){
    $(".sidebar-nav")[x-1].find(".sidebar-trans .nav-item")[y-1].addClass("active");
  }*/
}(window, jQuery);

function setActiveMenu(x, y){
  $($($(".sidebar-nav")[x-1]).find(".sidebar-trans .nav-item")[y-1]).addClass("active");
}

function setActiveMenu(menuId){
	var menu = $("#"+menuId).addClass("active");
	$("#"+menu.parents(".sidebar-nav").data("parent")).addClass("active");
	
}