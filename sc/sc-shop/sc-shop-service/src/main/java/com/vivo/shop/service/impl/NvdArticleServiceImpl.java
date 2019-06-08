package com.vivo.shop.service.impl;
import java.util.List;

import com.vivo.pojo.JobNvdArticleWithBLOBs;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.vivo.mapper.JobNvdArticleMapper;
import com.vivo.pojo.JobNvdArticle;
import com.vivo.pojo.JobNvdArticleExample;
import com.vivo.pojo.JobNvdArticleExample.Criteria;
import com.vivo.shop.service.NvdArticleService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class NvdArticleServiceImpl implements NvdArticleService {

	@Autowired
	private JobNvdArticleMapper nvdArticleMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<JobNvdArticle> findAll() {
		return nvdArticleMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<JobNvdArticle> page=   (Page<JobNvdArticle>) nvdArticleMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(JobNvdArticleWithBLOBs nvdArticle) {
		nvdArticleMapper.insert(nvdArticle);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(JobNvdArticle nvdArticle){
		nvdArticleMapper.updateByPrimaryKey(nvdArticle);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public JobNvdArticle findOne(Integer id){
		return nvdArticleMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			nvdArticleMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(JobNvdArticle nvdArticle, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		JobNvdArticleExample example=new JobNvdArticleExample();
		Criteria criteria = example.createCriteria();
		
		if(nvdArticle!=null){			
						if(nvdArticle.getLastModifiedDate()!=null && nvdArticle.getLastModifiedDate().length()>0){
				criteria.andLastModifiedDateLike("%"+nvdArticle.getLastModifiedDate()+"%");
			}
			if(nvdArticle.getSeverity()!=null && nvdArticle.getSeverity().length()>0){
				criteria.andSeverityLike("%"+nvdArticle.getSeverity()+"%");
			}
			if(nvdArticle.getCveId()!=null && nvdArticle.getCveId().length()>0){
				criteria.andCveIdLike("%"+nvdArticle.getCveId()+"%");
			}
			if(nvdArticle.getPublishedDate()!=null && nvdArticle.getPublishedDate().length()>0){
				criteria.andPublishedDateLike("%"+nvdArticle.getPublishedDate()+"%");
			}
			if(nvdArticle.getCreateDate()!=null && nvdArticle.getCreateDate().length()>0){
				criteria.andCreateDateLike("%"+nvdArticle.getCreateDate()+"%");
			}
			if(nvdArticle.getStatus()!=null && nvdArticle.getStatus().length()>0){
				criteria.andStatusLike("%"+nvdArticle.getStatus()+"%");
			}
			if(nvdArticle.getExt1()!=null && nvdArticle.getExt1().length()>0){
				criteria.andExt1Like("%"+nvdArticle.getExt1()+"%");
			}
			if(nvdArticle.getExt2()!=null && nvdArticle.getExt2().length()>0){
				criteria.andExt2Like("%"+nvdArticle.getExt2()+"%");
			}
			if(nvdArticle.getExt3()!=null && nvdArticle.getExt3().length()>0){
				criteria.andExt3Like("%"+nvdArticle.getExt3()+"%");
			}
	
		}
		
		Page<JobNvdArticle> page= (Page<JobNvdArticle>)nvdArticleMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
