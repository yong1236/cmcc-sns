package net.parim.sns.modules.sys.web.admin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Lists;

import net.parim.sns.modules.sys.entity.Office;
import net.parim.sns.modules.sys.service.OfficeService;

@Controller
@RequestMapping(value="${adminPath}/sys/office")
public class OfficeManagerController {
	@Autowired
	OfficeService officeService;
	
	@RequestMapping(value="/")
	public String index() {
		return "admin/sys/officeIndex";
	}
	
	@RequestMapping(value="/list")
	public String list(){
		return "admin/sys/officeList";
	}
	
	@RequestMapping(value="/treeData")
	@ResponseBody
	public List<Map<String, Object>> treeData(@RequestParam(required=false, defaultValue="0") Long extId){
		List<Map<String, Object>> mapList = Lists.newArrayList();
		List<Office> offices = officeService.findChildren(extId);
		for(Office office : offices){
			Map<String, Object> map = new HashMap<>();
			map.put("id", office.getId());
			map.put("pid", extId);
			map.put("name", office.getName());
			mapList.add(map);
		}
		return mapList;
		
	}
}
