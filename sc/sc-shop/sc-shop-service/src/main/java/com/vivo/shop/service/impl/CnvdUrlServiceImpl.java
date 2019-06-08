package com.vivo.shop.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.vivo.mapper.JobCnvdUrlMapper;
import com.vivo.pojo.JobCnvdUrl;
import com.vivo.pojo.JobCnvdUrlExample;
import com.vivo.pojo.JobCnvdUrlExample.Criteria;
import com.vivo.shop.service.CnvdUrlService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CnvdUrlServiceImpl implements CnvdUrlService {

	@Autowired
	private JobCnvdUrlMapper cnvdUrlMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<JobCnvdUrl> findAll() {
		return cnvdUrlMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<JobCnvdUrl> page=   (Page<JobCnvdUrl>) cnvdUrlMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(JobCnvdUrl cnvdUrl) {
		cnvdUrlMapper.insert(cnvdUrl);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(JobCnvdUrl cnvdUrl){
		cnvdUrlMapper.updateByPrimaryKey(cnvdUrl);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public JobCnvdUrl findOne(Integer id){
		return cnvdUrlMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			cnvdUrlMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(JobCnvdUrl cnvdUrl, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		JobCnvdUrlExample example=new JobCnvdUrlExample();
		Criteria criteria = example.createCriteria();
		
		if(cnvdUrl!=null){			
						if(cnvdUrl.getCnvdUrl()!=null && cnvdUrl.getCnvdUrl().length()>0){
				criteria.andCnvdUrlLike("%"+cnvdUrl.getCnvdUrl()+"%");
			}
			if(cnvdUrl.getUrlType()!=null && cnvdUrl.getUrlType().length()>0){
				criteria.andUrlTypeLike("%"+cnvdUrl.getUrlType()+"%");
			}
			if(cnvdUrl.getDeFlag()!=null && cnvdUrl.getDeFlag().length()>0){
				criteria.andDeFlagLike("%"+cnvdUrl.getDeFlag()+"%");
			}
			if(cnvdUrl.getFocusNum()!=null && cnvdUrl.getFocusNum().length()>0){
				criteria.andFocusNumLike("%"+cnvdUrl.getFocusNum()+"%");
			}
			if(cnvdUrl.getCommontNum()!=null && cnvdUrl.getCommontNum().length()>0){
				criteria.andCommontNumLike("%"+cnvdUrl.getCommontNum()+"%");
			}
			if(cnvdUrl.getUrlHits()!=null && cnvdUrl.getUrlHits().length()>0){
				criteria.andUrlHitsLike("%"+cnvdUrl.getUrlHits()+"%");
			}
			if(cnvdUrl.getBugLevel()!=null && cnvdUrl.getBugLevel().length()>0){
				criteria.andBugLevelLike("%"+cnvdUrl.getBugLevel()+"%");
			}
			if(cnvdUrl.getTitle()!=null && cnvdUrl.getTitle().length()>0){
				criteria.andTitleLike("%"+cnvdUrl.getTitle()+"%");
			}
			if(cnvdUrl.getPublishDate()!=null && cnvdUrl.getPublishDate().length()>0){
				criteria.andPublishDateLike("%"+cnvdUrl.getPublishDate()+"%");
			}
			if(cnvdUrl.getCreateDate()!=null && cnvdUrl.getCreateDate().length()>0){
				criteria.andCreateDateLike("%"+cnvdUrl.getCreateDate()+"%");
			}
			if(cnvdUrl.getUpdateDate()!=null && cnvdUrl.getUpdateDate().length()>0){
				criteria.andUpdateDateLike("%"+cnvdUrl.getUpdateDate()+"%");
			}
	
		}
		
		Page<JobCnvdUrl> page= (Page<JobCnvdUrl>)cnvdUrlMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
