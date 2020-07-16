package com.zcy.service.impl;

import com.zcy.common.constants.DiaryConstants;
import com.zcy.dao.YourDiaryMapper;
import com.zcy.dao.YourDiaryUserMapper;
import com.zcy.entity.YourDiary;
import com.zcy.entity.YourDiaryExample;
import com.zcy.service.YourDiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Date 2020-06-24 15:21
 * @Created by liyang
 */
@Service
public class YourDiaryServiceImpl implements YourDiaryService {

    @Autowired
    private YourDiaryMapper yourDiaryMapper;
    @Autowired
    private YourDiaryUserMapper yourDiaryUserMapper;

    @Override
    public int insertDiary(YourDiary diary) {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
//        String nowDateTime =LocalDateTime.now().format(formatter);
        diary.setDiaryCreateTime(LocalDateTime.now());
        diary.setDiaryStatus(DiaryConstants.DIARY_STATUS_NORMAL);
        int insert = yourDiaryMapper.insert(diary);
        return insert;
    }

    @Override
    public List<YourDiary> selectDiaryListByUserId(YourDiary yourDiary) {
        Long diaryUserId = yourDiary.getDiaryUserId();
        List<YourDiary> diaries=new ArrayList<>();
        if(diaryUserId!=null){
            YourDiaryExample yourDiaryExample=new YourDiaryExample();
            YourDiaryExample.Criteria criteria=yourDiaryExample.createCriteria();
            criteria.andDiaryUserIdEqualTo(yourDiary.getDiaryUserId());
            criteria.andDiaryStatusEqualTo(yourDiary.getDiaryStatus());
            diaries= yourDiaryMapper.selectByExampleWithBLOBs(yourDiaryExample);
            for(YourDiary diary:diaries){

            }
            return diaries;
        }
        return diaries;
    }

    @Override
    public int updateDiary(YourDiary yourDiary) {
        yourDiary.setDiaryCreateTime(LocalDateTime.now());
        yourDiary.setDiaryStatus(DiaryConstants.DIARY_STATUS_NORMAL);
        YourDiaryExample yourDiaryExample=new YourDiaryExample();
        YourDiaryExample.Criteria criteria=yourDiaryExample.createCriteria();
        int i = yourDiaryMapper.updateByPrimaryKeySelective(yourDiary);
        return i;
    }

    @Override
    public int deleteDiary(YourDiary yourDiary) {
        yourDiary.setDiaryStatus(DiaryConstants.DIARY_STATUS_DELETE);
        int i = yourDiaryMapper.updateByPrimaryKeySelective(yourDiary);
        return i;
    }
}
