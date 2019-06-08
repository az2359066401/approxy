package com.vivo.shop.service;
import java.util.List;
import com.vivo.pojo.JobNvdArticle;

import com.vivo.pojo.JobNvdArticleWithBLOBs;
import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface NvdArticleService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<JobNvdArticle> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(JobNvdArticleWithBLOBs nvdArticle);
	
	
	/**
	 * 修改
	 */
	public void update(JobNvdArticle nvdArticle);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public JobNvdArticle findOne(Integer id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Integer [] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(JobNvdArticle nvdArticle, int pageNum,int pageSize);
	
}
