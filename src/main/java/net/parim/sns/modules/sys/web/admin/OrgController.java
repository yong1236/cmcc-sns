package net.parim.sns.modules.sys.web.admin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Lists;
import com.sun.xml.internal.fastinfoset.sax.Properties;

import net.parim.sns.modules.sys.entity.UserGroup;
import net.parim.sns.modules.sys.service.UserGroupService;;

@Controller
@RequestMapping(value="${adminPath}/sys/org")
public class OrgController {
	@Autowired
	UserGroupService userGroupService;
	
	@RequestMapping(value="/")
	public String index() {
		return "admin/sys/orgIndex";
	}
	
	@RequestMapping(value="/list")
	public String list(UserGroup org, Model model){
		List<UserGroup> orgs = userGroupService.findAll(org);
		model.addAttribute("orgs", orgs);
		
		return "admin/sys/orgList";
	}
	
	@RequestMapping(value="/properties")
	public String properties(Model model){
		model.addAttribute(new UserGroup());
		
		return "admin/sys/orgProperties";
	}
	
	
	@RequestMapping(value="/treeData")
	@ResponseBody
	public List<Map<String, Object>> treeData(@RequestParam(required=false, defaultValue="0") Long extId){
		List<Map<String, Object>> mapList = Lists.newArrayList();
		List<UserGroup> orgs = userGroupService.findAll();//orgService.findChildren(extId);
		for(UserGroup org : orgs){
			Map<String, Object> map = new HashMap<>();
			map.put("id", org.getId());
			map.put("pid", org.getParent().getId());
			map.put("name", org.getName());
			//map.put("isParent", true);
			mapList.add(map);
		}
		return mapList;
		
	}
}
