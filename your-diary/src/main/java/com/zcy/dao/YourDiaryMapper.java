package com.zcy.dao;

import com.zcy.entity.YourDiary;
import com.zcy.entity.YourDiaryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface YourDiaryMapper{
    long countByExample(YourDiaryExample example);

    int deleteByExample(YourDiaryExample example);

    int deleteByPrimaryKey(Long diaryId);

    int insert(YourDiary record);

    int insertSelective(YourDiary record);

    List<YourDiary> selectByExampleWithBLOBs(YourDiaryExample example);

    List<YourDiary> selectByExample(YourDiaryExample example);

    YourDiary selectByPrimaryKey(Long diaryId);

    int updateByExampleSelective(@Param("record") YourDiary record, @Param("example") YourDiaryExample example);

    int updateByExampleWithBLOBs(@Param("record") YourDiary record, @Param("example") YourDiaryExample example);

    int updateByExample(@Param("record") YourDiary record, @Param("example") YourDiaryExample example);

    int updateByPrimaryKeySelective(YourDiary record);

    int updateByPrimaryKeyWithBLOBs(YourDiary record);

    int updateByPrimaryKey(YourDiary record);
}