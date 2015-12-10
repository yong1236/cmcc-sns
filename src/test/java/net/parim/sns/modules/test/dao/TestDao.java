package net.parim.sns.modules.test.dao;

import net.parim.sns.common.persistence.BaseRepository;
import net.parim.sns.common.persistence.annotation.MyBatisReponsitory;
import net.parim.sns.modules.test.entity.Test;

@MyBatisReponsitory
public interface TestDao extends BaseRepository {
	
	/**
	 * 根据ID获得一条数据
	 * @param id
	 * @return
	 */
	public Test get(Long id);
}
