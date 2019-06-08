package com.vivo.shop.service;
import java.util.List;
import com.vivo.pojo.JobCnvdXml;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface CnvdXmlService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<JobCnvdXml> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(JobCnvdXml cnvdXml);
	
	
	/**
	 * 修改
	 */
	public void update(JobCnvdXml cnvdXml);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public JobCnvdXml findOne(Integer id);
	
	
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
	public PageResult findPage(JobCnvdXml cnvdXml, int pageNum,int pageSize);
	
}
