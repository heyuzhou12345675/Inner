package com.zcy.dao;

import com.zcy.entity.YourDiaryUser;
import com.zcy.entity.YourDiaryUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YourDiaryUserMapper {
    long countByExample(YourDiaryUserExample example);

    int deleteByExample(YourDiaryUserExample example);

    int deleteByPrimaryKey(Long ydUserId);

    int insert(YourDiaryUser record);

    int insertSelective(YourDiaryUser record);

    List<YourDiaryUser> selectByExample(YourDiaryUserExample example);

    YourDiaryUser selectByPrimaryKey(Long ydUserId);

    int updateByExampleSelective(@Param("record") YourDiaryUser record, @Param("example") YourDiaryUserExample example);

    int updateByExample(@Param("record") YourDiaryUser record, @Param("example") YourDiaryUserExample example);

    int updateByPrimaryKeySelective(YourDiaryUser record);

    int updateByPrimaryKey(YourDiaryUser record);
}