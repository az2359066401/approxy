package com.vivo.shop.service.impl;
import java.util.List;

import com.vivo.pojo.JobCnnvdXmlWithBLOBs;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.vivo.mapper.JobCnnvdXmlMapper;
import com.vivo.pojo.JobCnnvdXml;
import com.vivo.pojo.JobCnnvdXmlExample;
import com.vivo.pojo.JobCnnvdXmlExample.Criteria;
import com.vivo.shop.service.CnnvdXmlService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CnnvdXmlServiceImpl implements CnnvdXmlService {

	@Autowired
	private JobCnnvdXmlMapper cnnvdXmlMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<JobCnnvdXml> findAll() {
		return cnnvdXmlMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<JobCnnvdXml> page=   (Page<JobCnnvdXml>) cnnvdXmlMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(JobCnnvdXmlWithBLOBs cnnvdXml) {
		cnnvdXmlMapper.insert(cnnvdXml);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(JobCnnvdXml cnnvdXml){
		cnnvdXmlMapper.updateByPrimaryKey(cnnvdXml);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public JobCnnvdXml findOne(Integer id){
		return cnnvdXmlMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			cnnvdXmlMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(JobCnnvdXml cnnvdXml, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		JobCnnvdXmlExample example=new JobCnnvdXmlExample();
		Criteria criteria = example.createCriteria();
		
		if(cnnvdXml!=null){			
						if(cnnvdXml.getName()!=null && cnnvdXml.getName().length()>0){
				criteria.andNameLike("%"+cnnvdXml.getName()+"%");
			}
			if(cnnvdXml.getVulnId()!=null && cnnvdXml.getVulnId().length()>0){
				criteria.andVulnIdLike("%"+cnnvdXml.getVulnId()+"%");
			}
			if(cnnvdXml.getPublished()!=null && cnnvdXml.getPublished().length()>0){
				criteria.andPublishedLike("%"+cnnvdXml.getPublished()+"%");
			}
			if(cnnvdXml.getModified()!=null && cnnvdXml.getModified().length()>0){
				criteria.andModifiedLike("%"+cnnvdXml.getModified()+"%");
			}
			if(cnnvdXml.getSource()!=null && cnnvdXml.getSource().length()>0){
				criteria.andSourceLike("%"+cnnvdXml.getSource()+"%");
			}
			if(cnnvdXml.getSeverity()!=null && cnnvdXml.getSeverity().length()>0){
				criteria.andSeverityLike("%"+cnnvdXml.getSeverity()+"%");
			}
			if(cnnvdXml.getVulnType()!=null && cnnvdXml.getVulnType().length()>0){
				criteria.andVulnTypeLike("%"+cnnvdXml.getVulnType()+"%");
			}
			if(cnnvdXml.getThrtype()!=null && cnnvdXml.getThrtype().length()>0){
				criteria.andThrtypeLike("%"+cnnvdXml.getThrtype()+"%");
			}
			if(cnnvdXml.getVulnExploit()!=null && cnnvdXml.getVulnExploit().length()>0){
				criteria.andVulnExploitLike("%"+cnnvdXml.getVulnExploit()+"%");
			}
			if(cnnvdXml.getCveId()!=null && cnnvdXml.getCveId().length()>0){
				criteria.andCveIdLike("%"+cnnvdXml.getCveId()+"%");
			}
			if(cnnvdXml.getBugtraqId()!=null && cnnvdXml.getBugtraqId().length()>0){
				criteria.andBugtraqIdLike("%"+cnnvdXml.getBugtraqId()+"%");
			}
			if(cnnvdXml.getOtherId()!=null && cnnvdXml.getOtherId().length()>0){
				criteria.andOtherIdLike("%"+cnnvdXml.getOtherId()+"%");
			}
	
		}
		
		Page<JobCnnvdXml> page= (Page<JobCnnvdXml>)cnnvdXmlMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
