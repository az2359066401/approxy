package com.vivo.shop.service.impl;
import java.util.List;

import com.vivo.pojo.JobCnvdArticleWithBLOBs;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.vivo.mapper.JobCnvdArticleMapper;
import com.vivo.pojo.JobCnvdArticle;
import com.vivo.pojo.JobCnvdArticleExample;
import com.vivo.pojo.JobCnvdArticleExample.Criteria;
import com.vivo.shop.service.CnvdArticleService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CnvdArticleServiceImpl implements CnvdArticleService {

	@Autowired
	private JobCnvdArticleMapper cnvdArticleMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<JobCnvdArticle> findAll() {
		return cnvdArticleMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<JobCnvdArticle> page=   (Page<JobCnvdArticle>) cnvdArticleMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(JobCnvdArticleWithBLOBs cnvdArticle) {
		cnvdArticleMapper.insert(cnvdArticle);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(JobCnvdArticle cnvdArticle){
		cnvdArticleMapper.updateByPrimaryKey(cnvdArticle);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public JobCnvdArticle findOne(Integer id){
		return cnvdArticleMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			cnvdArticleMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(JobCnvdArticle cnvdArticle, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		JobCnvdArticleExample example=new JobCnvdArticleExample();
		Criteria criteria = example.createCriteria();
		
		if(cnvdArticle!=null){			
						if(cnvdArticle.getBugTitle()!=null && cnvdArticle.getBugTitle().length()>0){
				criteria.andBugTitleLike("%"+cnvdArticle.getBugTitle()+"%");
			}
			if(cnvdArticle.getCnvdId()!=null && cnvdArticle.getCnvdId().length()>0){
				criteria.andCnvdIdLike("%"+cnvdArticle.getCnvdId()+"%");
			}
			if(cnvdArticle.getBugtraqId()!=null && cnvdArticle.getBugtraqId().length()>0){
				criteria.andBugtraqIdLike("%"+cnvdArticle.getBugtraqId()+"%");
			}
			if(cnvdArticle.getPublishDate()!=null && cnvdArticle.getPublishDate().length()>0){
				criteria.andPublishDateLike("%"+cnvdArticle.getPublishDate()+"%");
			}
			if(cnvdArticle.getBugLevel()!=null && cnvdArticle.getBugLevel().length()>0){
				criteria.andBugLevelLike("%"+cnvdArticle.getBugLevel()+"%");
			}
			if(cnvdArticle.getBugFrom()!=null && cnvdArticle.getBugFrom().length()>0){
				criteria.andBugFromLike("%"+cnvdArticle.getBugFrom()+"%");
			}
			if(cnvdArticle.getBugType()!=null && cnvdArticle.getBugType().length()>0){
				criteria.andBugTypeLike("%"+cnvdArticle.getBugType()+"%");
			}
			if(cnvdArticle.getCveId()!=null && cnvdArticle.getCveId().length()>0){
				criteria.andCveIdLike("%"+cnvdArticle.getCveId()+"%");
			}
			if(cnvdArticle.getCveIdLink()!=null && cnvdArticle.getCveIdLink().length()>0){
				criteria.andCveIdLinkLike("%"+cnvdArticle.getCveIdLink()+"%");
			}
			if(cnvdArticle.getBugPatchLink()!=null && cnvdArticle.getBugPatchLink().length()>0){
				criteria.andBugPatchLinkLike("%"+cnvdArticle.getBugPatchLink()+"%");
			}
			if(cnvdArticle.getVerifyFalg()!=null && cnvdArticle.getVerifyFalg().length()>0){
				criteria.andVerifyFalgLike("%"+cnvdArticle.getVerifyFalg()+"%");
			}
			if(cnvdArticle.getSubmitDate()!=null && cnvdArticle.getSubmitDate().length()>0){
				criteria.andSubmitDateLike("%"+cnvdArticle.getSubmitDate()+"%");
			}
			if(cnvdArticle.getRecordDate()!=null && cnvdArticle.getRecordDate().length()>0){
				criteria.andRecordDateLike("%"+cnvdArticle.getRecordDate()+"%");
			}
			if(cnvdArticle.getUpdateDate()!=null && cnvdArticle.getUpdateDate().length()>0){
				criteria.andUpdateDateLike("%"+cnvdArticle.getUpdateDate()+"%");
			}
			if(cnvdArticle.getBugAttachment()!=null && cnvdArticle.getBugAttachment().length()>0){
				criteria.andBugAttachmentLike("%"+cnvdArticle.getBugAttachment()+"%");
			}
			if(cnvdArticle.getHits()!=null && cnvdArticle.getHits().length()>0){
				criteria.andHitsLike("%"+cnvdArticle.getHits()+"%");
			}
			if(cnvdArticle.getCreateDate()!=null && cnvdArticle.getCreateDate().length()>0){
				criteria.andCreateDateLike("%"+cnvdArticle.getCreateDate()+"%");
			}
			if(cnvdArticle.getKeyWords()!=null && cnvdArticle.getKeyWords().length()>0){
				criteria.andKeyWordsLike("%"+cnvdArticle.getKeyWords()+"%");
			}
			if(cnvdArticle.getManufacturer()!=null && cnvdArticle.getManufacturer().length()>0){
				criteria.andManufacturerLike("%"+cnvdArticle.getManufacturer()+"%");
			}
			if(cnvdArticle.getBugVersion()!=null && cnvdArticle.getBugVersion().length()>0){
				criteria.andBugVersionLike("%"+cnvdArticle.getBugVersion()+"%");
			}
			if(cnvdArticle.getBugReason()!=null && cnvdArticle.getBugReason().length()>0){
				criteria.andBugReasonLike("%"+cnvdArticle.getBugReason()+"%");
			}
			if(cnvdArticle.getBugThreat()!=null && cnvdArticle.getBugThreat().length()>0){
				criteria.andBugThreatLike("%"+cnvdArticle.getBugThreat()+"%");
			}
			if(cnvdArticle.getBugAttackPosition()!=null && cnvdArticle.getBugAttackPosition().length()>0){
				criteria.andBugAttackPositionLike("%"+cnvdArticle.getBugAttackPosition()+"%");
			}
			if(cnvdArticle.getCveScore()!=null && cnvdArticle.getCveScore().length()>0){
				criteria.andCveScoreLike("%"+cnvdArticle.getCveScore()+"%");
			}
			if(cnvdArticle.getStatus()!=null && cnvdArticle.getStatus().length()>0){
				criteria.andStatusLike("%"+cnvdArticle.getStatus()+"%");
			}
			if(cnvdArticle.getExt1()!=null && cnvdArticle.getExt1().length()>0){
				criteria.andExt1Like("%"+cnvdArticle.getExt1()+"%");
			}
			if(cnvdArticle.getExt2()!=null && cnvdArticle.getExt2().length()>0){
				criteria.andExt2Like("%"+cnvdArticle.getExt2()+"%");
			}
			if(cnvdArticle.getExt3()!=null && cnvdArticle.getExt3().length()>0){
				criteria.andExt3Like("%"+cnvdArticle.getExt3()+"%");
			}
			if(cnvdArticle.getExt4()!=null && cnvdArticle.getExt4().length()>0){
				criteria.andExt4Like("%"+cnvdArticle.getExt4()+"%");
			}
			if(cnvdArticle.getExt5()!=null && cnvdArticle.getExt5().length()>0){
				criteria.andExt5Like("%"+cnvdArticle.getExt5()+"%");
			}
	
		}
		
		Page<JobCnvdArticle> page= (Page<JobCnvdArticle>)cnvdArticleMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
