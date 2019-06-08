package com.vivo.shop.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.vivo.mapper.JobCnvdXmlMapper;
import com.vivo.pojo.JobCnvdXml;
import com.vivo.pojo.JobCnvdXmlExample;
import com.vivo.pojo.JobCnvdXmlExample.Criteria;
import com.vivo.shop.service.CnvdXmlService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CnvdXmlServiceImpl implements CnvdXmlService {

	@Autowired
	private JobCnvdXmlMapper cnvdXmlMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<JobCnvdXml> findAll() {
		return cnvdXmlMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<JobCnvdXml> page=   (Page<JobCnvdXml>) cnvdXmlMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(JobCnvdXml cnvdXml) {
		cnvdXmlMapper.insert(cnvdXml);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(JobCnvdXml cnvdXml){
		cnvdXmlMapper.updateByPrimaryKey(cnvdXml);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public JobCnvdXml findOne(Integer id){
		return cnvdXmlMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			cnvdXmlMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(JobCnvdXml cnvdXml, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		JobCnvdXmlExample example=new JobCnvdXmlExample();
		Criteria criteria = example.createCriteria();
		
		if(cnvdXml!=null){			
//						if(cnvdXml.getDiscovererName()!=null && cnvdXml.getDiscovererName().length()>0){
//				criteria.andDiscovererNameLike("%"+cnvdXml.getDiscovererName()+"%");
//			}
			if(cnvdXml.getDescription()!=null && cnvdXml.getDescription().length()>0){
				criteria.andDescriptionLike("%"+cnvdXml.getDescription()+"%");
			}
			if(cnvdXml.getTitle()!=null && cnvdXml.getTitle().length()>0){
				criteria.andTitleLike("%"+cnvdXml.getTitle()+"%");
			}
//			if(cnvdXml.getReferenceLink()!=null && cnvdXml.getReferenceLink().length()>0){
//				criteria.andReferenceLinkLike("%"+cnvdXml.getReferenceLink()+"%");
//			}
			if(cnvdXml.getCves()!=null && cnvdXml.getCves().length()>0){
				criteria.andCvesLike("%"+cnvdXml.getCves()+"%");
			}
			if(cnvdXml.getProducts()!=null && cnvdXml.getProducts().length()>0){
				criteria.andProductsLike("%"+cnvdXml.getProducts()+"%");
			}
			if(cnvdXml.getServerity()!=null && cnvdXml.getServerity().length()>0){
				criteria.andServerityLike("%"+cnvdXml.getServerity()+"%");
			}
			if(cnvdXml.getPatchName()!=null && cnvdXml.getPatchName().length()>0){
				criteria.andPatchNameLike("%"+cnvdXml.getPatchName()+"%");
			}
			if(cnvdXml.getNumber()!=null && cnvdXml.getNumber().length()>0){
				criteria.andNumberLike("%"+cnvdXml.getNumber()+"%");
			}
			if(cnvdXml.getSubmitTime()!=null && cnvdXml.getSubmitTime().length()>0){
				criteria.andSubmitTimeLike("%"+cnvdXml.getSubmitTime()+"%");
			}
			if(cnvdXml.getFormalWay()!=null && cnvdXml.getFormalWay().length()>0){
				criteria.andFormalWayLike("%"+cnvdXml.getFormalWay()+"%");
			}
			if(cnvdXml.getBids()!=null && cnvdXml.getBids().length()>0){
				criteria.andBidsLike("%"+cnvdXml.getBids()+"%");
			}
			if(cnvdXml.getOpenTime()!=null && cnvdXml.getOpenTime().length()>0){
				criteria.andOpenTimeLike("%"+cnvdXml.getOpenTime()+"%");
			}
			if(cnvdXml.getPatchDescription()!=null && cnvdXml.getPatchDescription().length()>0){
				criteria.andPatchDescriptionLike("%"+cnvdXml.getPatchDescription()+"%");
			}
			if(cnvdXml.getIsEvent()!=null && cnvdXml.getIsEvent().length()>0){
				criteria.andIsEventLike("%"+cnvdXml.getIsEvent()+"%");
			}
	
		}
		
		Page<JobCnvdXml> page= (Page<JobCnvdXml>)cnvdXmlMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
