package net.parim.sns.modules.test.dao;

import net.parim.sns.common.persistence.BaseDao;
import net.parim.sns.common.persistence.annotation.MyBatisDao;
import net.parim.sns.modules.test.entity.Test;

@MyBatisDao
public interface TestDao extends BaseDao {
	
	/**
	 * 根据ID获得一条数据
	 * @param id
	 * @return
	 */
	public Test get(Long id);
}
