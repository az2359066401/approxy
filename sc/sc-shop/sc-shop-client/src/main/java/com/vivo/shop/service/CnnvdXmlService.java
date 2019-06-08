package com.vivo.shop.service;
import java.util.List;
import com.vivo.pojo.JobCnnvdXml;

import com.vivo.pojo.JobCnnvdXmlWithBLOBs;
import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface CnnvdXmlService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<JobCnnvdXml> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(JobCnnvdXmlWithBLOBs cnnvdXml);
	
	
	/**
	 * 修改
	 */
	public void update(JobCnnvdXml cnnvdXml);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public JobCnnvdXml findOne(Integer id);
	
	
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
	public PageResult findPage(JobCnnvdXml cnnvdXml, int pageNum,int pageSize);
	
}
