package com.vivo.shop.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.vivo.mapper.JobBoleArticleMapper;
import com.vivo.pojo.JobBoleArticle;
import com.vivo.pojo.JobBoleArticleExample;
import com.vivo.pojo.JobBoleArticleExample.Criteria;
import com.vivo.shop.service.BoleArticleService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class BoleArticleServiceImpl implements BoleArticleService {

	@Autowired
	private JobBoleArticleMapper boleArticleMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<JobBoleArticle> findAll() {
		return boleArticleMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<JobBoleArticle> page=   (Page<JobBoleArticle>) boleArticleMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(JobBoleArticle boleArticle) {
		boleArticleMapper.insert(boleArticle);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(JobBoleArticle boleArticle){
		boleArticleMapper.updateByPrimaryKey(boleArticle);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public JobBoleArticle findOne(Integer id){
		return boleArticleMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			boleArticleMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(JobBoleArticle boleArticle, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		JobBoleArticleExample example=new JobBoleArticleExample();
		Criteria criteria = example.createCriteria();
		
		if(boleArticle!=null){			
						if(boleArticle.getTitle()!=null && boleArticle.getTitle().length()>0){
				criteria.andTitleLike("%"+boleArticle.getTitle()+"%");
			}
			if(boleArticle.getUrl()!=null && boleArticle.getUrl().length()>0){
				criteria.andUrlLike("%"+boleArticle.getUrl()+"%");
			}
			if(boleArticle.getCreateDate()!=null && boleArticle.getCreateDate().length()>0){
				criteria.andCreateDateLike("%"+boleArticle.getCreateDate()+"%");
			}
			if(boleArticle.getFavNums()!=null && boleArticle.getFavNums().length()>0){
				criteria.andFavNumsLike("%"+boleArticle.getFavNums()+"%");
			}
	
		}
		
		Page<JobBoleArticle> page= (Page<JobBoleArticle>)boleArticleMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
