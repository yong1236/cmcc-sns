package net.parim.sns.modules.sys.web;

import net.parim.sns.common.config.Global;
import net.parim.sns.modules.sys.interceptor.ThemeInterceptor.UseTheme;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthenticateController {

	@RequestMapping(value={"/login", "${adminPath}/login"})
	@UseTheme(value=false)
	public String index(Model model){
		
		return Global.getThemePath()+"login";
	}
}
