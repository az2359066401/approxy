package com.vivo.shop.service;
import java.util.List;
import com.vivo.pojo.RoomUrl;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface UrlService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<RoomUrl> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(RoomUrl url);
	
	
	/**
	 * 修改
	 */
	public void update(RoomUrl url);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public RoomUrl findOne(Integer id);
	
	
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
	public PageResult findPage(RoomUrl url, int pageNum,int pageSize);
	
}
