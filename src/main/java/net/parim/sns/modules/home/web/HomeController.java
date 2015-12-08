package net.parim.sns.modules.home.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/")
public class HomeController {

	@RequestMapping(value = {"/", "/index", "/front/", "/front/index" }, method = RequestMethod.GET)
	public String index(Model model){
		
		return "/index";
	}
}
