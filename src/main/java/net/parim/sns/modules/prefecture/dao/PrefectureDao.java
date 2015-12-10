package net.parim.sns.modules.prefecture.dao;

import java.util.List;

import net.parim.sns.common.persistence.BaseRepository;
import net.parim.sns.common.persistence.annotation.MyBatisReponsitory;
import net.parim.sns.modules.prefecture.entity.Prefecture;

@MyBatisReponsitory
public interface PrefectureDao extends BaseRepository {
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
