package com.vivo.shop.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.vivo.mapper.RoomInfoMapper;
import com.vivo.pojo.RoomInfo;
import com.vivo.pojo.RoomInfoExample;
import com.vivo.pojo.RoomInfoExample.Criteria;
import com.vivo.shop.service.InfoService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class InfoServiceImpl implements InfoService {

	@Autowired
	private RoomInfoMapper infoMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<RoomInfo> findAll() {
		return infoMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<RoomInfo> page=   (Page<RoomInfo>) infoMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(RoomInfo info) {
		infoMapper.insert(info);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(RoomInfo info){
		infoMapper.updateByPrimaryKey(info);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public RoomInfo findOne(Integer id){
		return infoMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			infoMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(RoomInfo info, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		RoomInfoExample example=new RoomInfoExample();
		Criteria criteria = example.createCriteria();
		
		if(info!=null){			
						if(info.getRoomId()!=null && info.getRoomId().length()>0){
				criteria.andRoomIdLike("%"+info.getRoomId()+"%");
			}
			if(info.getRentType()!=null && info.getRentType().length()>0){
				criteria.andRentTypeLike("%"+info.getRentType()+"%");
			}
			if(info.getRoomType()!=null && info.getRoomType().length()>0){
				criteria.andRoomTypeLike("%"+info.getRoomType()+"%");
			}
			if(info.getFloorSpace()!=null && info.getFloorSpace().length()>0){
				criteria.andFloorSpaceLike("%"+info.getFloorSpace()+"%");
			}
			if(info.getRoomDirect()!=null && info.getRoomDirect().length()>0){
				criteria.andRoomDirectLike("%"+info.getRoomDirect()+"%");
			}
			if(info.getFloorLevel()!=null && info.getFloorLevel().length()>0){
				criteria.andFloorLevelLike("%"+info.getFloorLevel()+"%");
			}
			if(info.getRoomDecoration()!=null && info.getRoomDecoration().length()>0){
				criteria.andRoomDecorationLike("%"+info.getRoomDecoration()+"%");
			}
			if(info.getHouseEstate()!=null && info.getHouseEstate().length()>0){
				criteria.andHouseEstateLike("%"+info.getHouseEstate()+"%");
			}
			if(info.getRoomAddress()!=null && info.getRoomAddress().length()>0){
				criteria.andRoomAddressLike("%"+info.getRoomAddress()+"%");
			}
			if(info.getRefreshDate()!=null && info.getRefreshDate().length()>0){
				criteria.andRefreshDateLike("%"+info.getRefreshDate()+"%");
			}
			if(info.getCheckinDate()!=null && info.getCheckinDate().length()>0){
				criteria.andCheckinDateLike("%"+info.getCheckinDate()+"%");
			}
			if(info.getContactWay()!=null && info.getContactWay().length()>0){
				criteria.andContactWayLike("%"+info.getContactWay()+"%");
			}
			if(info.getRoomDes()!=null && info.getRoomDes().length()>0){
				criteria.andRoomDesLike("%"+info.getRoomDes()+"%");
			}
			if(info.getRoomSupport()!=null && info.getRoomSupport().length()>0){
				criteria.andRoomSupportLike("%"+info.getRoomSupport()+"%");
			}
			if(info.getRoomPic()!=null && info.getRoomPic().length()>0){
				criteria.andRoomPicLike("%"+info.getRoomPic()+"%");
			}
	
		}
		
		Page<RoomInfo> page= (Page<RoomInfo>)infoMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
