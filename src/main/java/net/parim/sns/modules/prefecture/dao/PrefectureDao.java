package net.parim.sns.modules.prefecture.dao;

import java.util.List;

import net.parim.sns.common.persistence.BaseDao;
import net.parim.sns.common.persistence.annotation.MyBatisDao;
import net.parim.sns.modules.prefecture.entity.Prefecture;

@MyBatisDao
public interface PrefectureDao extends BaseDao {
	/**
	 * 精选专题
	 * @param size
	 * @return
	 */
	public List<Prefecture> getChoicenessList(int size);
	
	/**
	 * 部门专题
	 * @param size
	 * @return
	 */
	public List<Prefecture> getDepartmentalList(int size);
	
	/**
	 * 我的学习专题
	 * @return
	 */
	public List<Prefecture> getPrefecturesByUser();
}
