package com.zcy.controller;

import com.zcy.common.ajax.AjaxResult;
import com.zcy.entity.YourDiary;
import com.zcy.feign.DiaryService;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Date 2020-07-01 09:43
 * @Created by liyang
 */

@RestController
public class TestController {
    @Autowired
    private DiaryService diaryService;
    @RequestMapping(value = "/testInsert",method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult insertOne(YourDiary yourDiary){
        AjaxResult ajaxResult = diaryService.insertOne(yourDiary);
        return ajaxResult;
    }

    @RequestMapping(value = "/testSelect",method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult selectList(YourDiary yourDiary){
        AjaxResult ajaxResult = diaryService.selectList(yourDiary);
        return ajaxResult;
    }

    @RequestMapping(value = "/testUpdate",method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult updateDiary(YourDiary yourDiary){
        AjaxResult ajaxResult=diaryService.updateDiary(yourDiary);
        return ajaxResult;
    }

    @RequestMapping(value = "/testDelete",method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult deleteDiary(YourDiary yourDiary){
        AjaxResult ajaxResult=diaryService.delelteDiary(yourDiary);
        return ajaxResult;
    }

}
