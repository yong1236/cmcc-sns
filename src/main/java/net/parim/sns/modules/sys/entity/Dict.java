package net.parim.sns.modules.sys.entity;

import net.parim.sns.common.persistence.BaseEntity;

public class Dict extends BaseEntity {
	private String value;
	private String label;
	private String type;
	private String description;
	private String sort;
	private Dict parent;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public Dict getParent() {
		return parent;
	}
	public void setParent(Dict parent) {
		this.parent = parent;
	}
}
