package net.parim.sns.modules.sys.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/admin")
public class WelcomeController {

	@RequestMapping(value={"", "/", "/index"})
	public String index(Model model){
		
		return "/admin/index";
	}
	
	@RequestMapping(value={"/welcome"})
	public String welcome(Model model){
		
		return "/admin/welcome";
	}
}
