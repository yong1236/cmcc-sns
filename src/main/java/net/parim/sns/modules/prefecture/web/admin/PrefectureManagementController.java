package net.parim.sns.modules.prefecture.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/admin/prefecture")
public class PrefectureManagementController {

	@RequestMapping(value={"", "/", "/index"})
	public String index(Model model){
		
		return "/admin/prefecture/index";
	}
	
}
