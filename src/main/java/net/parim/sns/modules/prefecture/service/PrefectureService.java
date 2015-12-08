package net.parim.sns.modules.prefecture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.parim.sns.modules.prefecture.dao.PrefectureDao;
import net.parim.sns.modules.prefecture.entity.Prefecture;

@Service
public class PrefectureService {
	@Autowired
	private PrefectureDao prefectureDao;

	/**
	 * 精品专区
	 * @param size
	 * @return
	 */
	public List<Prefecture> getChoicenessList(int size){
		return prefectureDao.getChoicenessList(size);
	}
	
	/**
	 * 部门专区
	 * @param size
	 * @return
	 */
	public List<Prefecture> getDepartmentalList(int size){
		return prefectureDao.getDepartmentalList(size);
	}
}
