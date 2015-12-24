package net.parim.sns.modules.sys.service;

import java.util.List;

import net.parim.sns.modules.sys.entity.UserGroup;
import net.parim.sns.modules.sys.repository.UserGroupRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserGroupService {
	
	@Autowired
	UserGroupRepository userGroupRepository;
	
	public List<UserGroup> findAll(){
		
		return userGroupRepository.findAll();
	}
	
	public List<UserGroup> findAll(UserGroup userGroup){
	
		return userGroupRepository.findAll(userGroup);
	}
}
