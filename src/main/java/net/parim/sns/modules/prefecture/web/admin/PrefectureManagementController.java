package net.parim.sns.modules.prefecture.web.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.parim.sns.modules.prefecture.entity.Prefecture;
import net.parim.sns.modules.prefecture.service.PrefectureService;

@Controller
@RequestMapping(value="${adminPath}/prefecture")
public class PrefectureManagementController {
	
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
	
}
