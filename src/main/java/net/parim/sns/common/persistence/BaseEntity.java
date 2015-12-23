package net.parim.sns.common.persistence;

import java.io.Serializable;

public class BaseEntity<E> implements Serializable {
	private static final long serialVersionUID = -3030974573794962986L;
	
	protected Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
