package com.zcy.service;

import com.zcy.entity.YourDiary;

import java.util.List;

/**
 * @Description TODO
 * @Date 2020-06-24 15:20
 * @Created by liyang
 */
public interface YourDiaryService {

    int insertDiary(YourDiary diary);

    List<YourDiary> selectDiaryListByUserId(YourDiary yourDiary);

    int updateDiary(YourDiary yourDiary);

    int deleteDiary(YourDiary yourDiary);
}
