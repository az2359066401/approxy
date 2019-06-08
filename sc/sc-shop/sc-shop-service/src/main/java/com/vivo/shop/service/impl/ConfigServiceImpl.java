package com.vivo.shop.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.vivo.mapper.TbConfigMapper;
import com.vivo.pojo.TbConfig;
import com.vivo.pojo.TbConfigExample;
import com.vivo.pojo.TbConfigExample.Criteria;
import com.vivo.shop.service.ConfigService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ConfigServiceImpl implements ConfigService {

	@Autowired
	private TbConfigMapper configMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbConfig> findAll() {
		return configMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbConfig> page=   (Page<TbConfig>) configMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbConfig config) {
		configMapper.insert(config);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbConfig config){
		configMapper.updateByPrimaryKey(config);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbConfig findOne(String id){
		return configMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(String[] ids) {
		for(String id:ids){
			configMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbConfig config, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbConfigExample example=new TbConfigExample();
		Criteria criteria = example.createCriteria();
		
		if(config!=null){			
						if(config.getCfgCode()!=null && config.getCfgCode().length()>0){
				criteria.andCfgCodeLike("%"+config.getCfgCode()+"%");
			}
			if(config.getCfgName()!=null && config.getCfgName().length()>0){
				criteria.andCfgNameLike("%"+config.getCfgName()+"%");
			}
			if(config.getCfgValue()!=null && config.getCfgValue().length()>0){
				criteria.andCfgValueLike("%"+config.getCfgValue()+"%");
			}
//			if(config.getPCfgCode()!=null && config.getPCfgCode().length()>0){
//				criteria.andPCfgCodeLike("%"+config.getPCfgCode()+"%");
//			}
			if(config.getDescription()!=null && config.getDescription().length()>0){
				criteria.andDescriptionLike("%"+config.getDescription()+"%");
			}
			if(config.getRemark()!=null && config.getRemark().length()>0){
				criteria.andRemarkLike("%"+config.getRemark()+"%");
			}
			if(config.getExt1()!=null && config.getExt1().length()>0){
				criteria.andExt1Like("%"+config.getExt1()+"%");
			}
			if(config.getExt2()!=null && config.getExt2().length()>0){
				criteria.andExt2Like("%"+config.getExt2()+"%");
			}
			if(config.getExt3()!=null && config.getExt3().length()>0){
				criteria.andExt3Like("%"+config.getExt3()+"%");
			}
			if(config.getExt4()!=null && config.getExt4().length()>0){
				criteria.andExt4Like("%"+config.getExt4()+"%");
			}
			if(config.getExt5()!=null && config.getExt5().length()>0){
				criteria.andExt5Like("%"+config.getExt5()+"%");
			}
//			if(config.getRCfgCode()!=null && config.getRCfgCode().length()>0){
//				criteria.andRCfgCodeLike("%"+config.getRCfgCode()+"%");
//			}
			if(config.getCrtUserid()!=null && config.getCrtUserid().length()>0){
				criteria.andCrtUseridLike("%"+config.getCrtUserid()+"%");
			}
			if(config.getCreatedBy()!=null && config.getCreatedBy().length()>0){
				criteria.andCreatedByLike("%"+config.getCreatedBy()+"%");
			}
			if(config.getUpdatedBy()!=null && config.getUpdatedBy().length()>0){
				criteria.andUpdatedByLike("%"+config.getUpdatedBy()+"%");
			}
	
		}
		
		Page<TbConfig> page= (Page<TbConfig>)configMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
