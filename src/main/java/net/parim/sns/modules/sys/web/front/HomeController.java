package net.parim.sns.modules.sys.web.front;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value={"/", "/front"})
public class HomeController {
	
	@RequestMapping(value={"", "/", "index"}, method=RequestMethod.GET)
	public String index(Model model){
		
		return "index";
	}
}
