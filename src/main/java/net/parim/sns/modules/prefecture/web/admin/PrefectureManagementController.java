package net.parim.sns.modules.prefecture.web.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.parim.sns.modules.prefecture.entity.Prefecture;
import net.parim.sns.modules.prefecture.service.PrefectureService;

@Controller
@RequestMapping(value="${adminPath}/prefecture")
public class PrefectureManagementController {
	@Value("${adminPath}")
	private String adminPath;
	
	@Autowired
	PrefectureService prefectureService;

	@RequestMapping(value="/")
	public String index(Prefecture prefecture, 
			@PageableDefault Pageable pageable, Model model){
		
		Page<Prefecture> prefectures = prefectureService.findAll(prefecture, pageable);
		model.addAttribute("prefectures", prefectures);
		model.addAttribute("prefecture", prefecture);
		return "/admin/prefecture/prefectureList";
	}
	
	@RequestMapping(value="/published")
	public String published(Prefecture prefecture, 
			@PageableDefault Pageable pageable, Model model){
		prefecture.setId(12L);
		
		Page<Prefecture> prefectures = prefectureService.findAll(prefecture, pageable);
		model.addAttribute("prefectures", prefectures);
		model.addAttribute("prefecture", prefecture);
		model.addAttribute("tabActive", "published");
		return "/admin/prefecture/prefectureList";
	}
	
	@RequestMapping(value="/properties")
	public String properties(Model model){
		
		return "/admin/profecture/properties";
	}
	
	@RequestMapping(value="/properties/{id}")
	public String properties(@PathVariable Long id,Model model){
		Prefecture prefecture = prefectureService.findOne(id);
		model.addAttribute("prefecture", prefecture);
		return "/admin/profecture/properties";
	}
	
	@RequestMapping(value="/save")
	public String save(Prefecture prefecture,
				RedirectAttributes redirectAttributes,
				Model model){
		prefectureService.save(prefecture);
		
		return "redirect: "+ adminPath +"/prefecture/";
	}
	
}
