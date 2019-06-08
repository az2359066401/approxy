package com.vivo.mapper;

import com.vivo.pojo.RoomUrl;
import com.vivo.pojo.RoomUrlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomUrlMapper {
    long countByExample(RoomUrlExample example);

    int deleteByExample(RoomUrlExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoomUrl record);

    int insertSelective(RoomUrl record);

    List<RoomUrl> selectByExample(RoomUrlExample example);

    RoomUrl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoomUrl record, @Param("example") RoomUrlExample example);

    int updateByExample(@Param("record") RoomUrl record, @Param("example") RoomUrlExample example);

    int updateByPrimaryKeySelective(RoomUrl record);

    int updateByPrimaryKey(RoomUrl record);
}