package net.parim.sns.modules.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.parim.sns.modules.sys.entity.Site;
import net.parim.sns.modules.sys.entity.User;
import net.parim.sns.modules.sys.repository.SiteRepository;

@Service
public class SiteService {
	
	@Autowired
	private SiteRepository siteRepository;
	
	//@CurrrentUser
	User user =  new User();
	public SiteService() {
		user.setId(1L);
	}
	
	public void save(Site site){
		if(site.getParent()==null || site.getParentId() == 0){
			Site rootSite = new Site(1L);
			site.setParent(rootSite);
		}
		
		if(site.getId()!=null && site.getId()>0){
			site.setLastUpdatedBy(user);
			siteRepository.update(site);
		}else {
			site.setCreatedBy(user);
			site.setLastUpdatedBy(user);
			siteRepository.insert(site);
		}
	}
	
	public void remove(Site site){
		siteRepository.delete(site);
	}
	
	public Site findOne(Long id){
		return siteRepository.findOne(id);
	}
	
	public List<Site> findAll(){
		return siteRepository.findAll();
	}
	
	public List<Site> findRoots(){
		return (List<Site>) siteRepository.findAllRoots(null, null);
	}
	
	public List<Site> findChildren(Site site){
		return (List<Site>) siteRepository.findAllChildren(site);
	}
}
