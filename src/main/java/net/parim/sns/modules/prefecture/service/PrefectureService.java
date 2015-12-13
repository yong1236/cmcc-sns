package net.parim.sns.modules.prefecture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.parim.sns.modules.prefecture.entity.Prefecture;
import net.parim.sns.modules.prefecture.repository.PrefectureRepository;

@Service
public class PrefectureService {
	@Autowired
	private PrefectureRepository prefectureRepository;
	
	public List<Prefecture> findAll(Prefecture prefecture){
		return prefectureRepository.findAll();
	}
	
	public Page<Prefecture> findAll(Prefecture prefecture, Pageable pageable){
		return (Page<Prefecture>)prefectureRepository.findAll(prefecture, pageable);
	}

	/**
	 * 精品专区
	 * @param size
	 * @return
	 */
	public List<Prefecture> getChoicenessList(int size){
		return prefectureRepository.getChoicenessList(size);
	}
	
	/**
	 * 部门专区
	 * @param size
	 * @return
	 */
	public List<Prefecture> getDepartmentalList(int size){
		return prefectureRepository.getDepartmentalList(size);
	}
}
