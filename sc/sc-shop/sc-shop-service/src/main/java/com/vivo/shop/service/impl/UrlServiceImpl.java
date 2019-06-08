package com.vivo.shop.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.vivo.mapper.RoomUrlMapper;
import com.vivo.pojo.RoomUrl;
import com.vivo.pojo.RoomUrlExample;
import com.vivo.pojo.RoomUrlExample.Criteria;
import com.vivo.shop.service.UrlService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class UrlServiceImpl implements UrlService {

	@Autowired
	private RoomUrlMapper urlMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<RoomUrl> findAll() {
		return urlMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<RoomUrl> page=   (Page<RoomUrl>) urlMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(RoomUrl url) {
		urlMapper.insert(url);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(RoomUrl url){
		urlMapper.updateByPrimaryKey(url);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public RoomUrl findOne(Integer id){
		return urlMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			urlMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(RoomUrl url, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		RoomUrlExample example=new RoomUrlExample();
		Criteria criteria = example.createCriteria();
		
		if(url!=null){			
						if(url.getUrl()!=null && url.getUrl().length()>0){
				criteria.andUrlLike("%"+url.getUrl()+"%");
			}
			if(url.getUrlType()!=null && url.getUrlType().length()>0){
				criteria.andUrlTypeLike("%"+url.getUrlType()+"%");
			}
			if(url.getDeFlag()!=null && url.getDeFlag().length()>0){
				criteria.andDeFlagLike("%"+url.getDeFlag()+"%");
			}
	
		}
		
		Page<RoomUrl> page= (Page<RoomUrl>)urlMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
