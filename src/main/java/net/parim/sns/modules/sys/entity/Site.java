package net.parim.sns.modules.sys.entity;

import java.util.List;

import net.parim.sns.common.persistence.DataEntity;
import net.parim.sns.common.persistence.TreeEntity;


public class Site extends TreeEntity<Site> {
	private String name;
	private String shortName;
	private String description;
	private String theme;
	
	public Site() {
		super();
	}
	
	public Site(Long id){
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}

	@Override
	public Site getParent() {
		return parent;
	}

	@Override
	public void setParent(Site parent) {
		this.parent = parent;
	}

	@Override
	public List<Site> getChildren() {
		return children;
	}

	@Override
	public void setChildren(List<Site> children) {
		this.children = children;
	}
}
