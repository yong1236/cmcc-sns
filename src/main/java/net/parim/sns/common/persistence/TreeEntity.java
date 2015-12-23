package net.parim.sns.common.persistence;

import java.util.List;

import net.parim.sns.common.utils.Reflections;

public class TreeEntity<E> extends DataEntity<E> {
	private static final long serialVersionUID = 8924003950923240082L;
	
	protected E parent;
	protected List<E> children;
	protected String name;
	protected Integer sort;
	
	public E getParent() {
		return parent;
	}
	public void setParent(E parent) {
		this.parent = parent;
	}
	public List<E> getChildren() {
		return children;
	}
	public void setChildren(List<E> children) {
		this.children = children;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Long getParentId(){
		Long id = null;
		if (parent != null){
			id = (Long)Reflections.getFieldValue(parent, "id");
		}
		return null!=id ? id : 0;
	}
}
