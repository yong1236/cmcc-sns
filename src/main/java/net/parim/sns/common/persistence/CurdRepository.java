package net.parim.sns.common.persistence;

import java.util.List;

public interface CurdRepository<T extends BaseEntity> extends BaseRepository<T> {

	public void insert(T entity);
	
	public void update(T entity);
	
	public void delete(Long id);
	
	public T findOne(Long id);
	
	public List<T> findAll();
}
