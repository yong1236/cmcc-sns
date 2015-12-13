package net.parim.sns.common.persistence;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CurdRepository<T extends BaseEntity> extends BaseRepository<T> {

	public void insert(T entity);
	
	public void update(T entity);
	
	public void delete(Long id);
	
	public T findOne(Long id);
	
	public List<T> findAll();
	
	public List<T> findAll(T entity, Pageable pageable);
}
