package net.parim.sns.modules.sys.utils;

import java.util.List;

import net.parim.sns.common.utils.SpringContextHolder;
import net.parim.sns.modules.sys.entity.Menu;
import net.parim.sns.modules.sys.repository.MenuRepository;
import net.parim.sns.modules.sys.repository.UserRepository;

public class UserUtils {
	
	private static UserRepository userRepository = SpringContextHolder.getBean(UserRepository.class);
	private static MenuRepository menuRepository = SpringContextHolder.getBean(MenuRepository.class);
	
	public static List<Menu> getMenuList(){
		return menuRepository.findAll();
	}

}
