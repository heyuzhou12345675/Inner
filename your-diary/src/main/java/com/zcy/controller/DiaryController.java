package com.zcy.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zcy.common.ajax.AjaxResult;
import com.zcy.common.constants.DiaryConstants;
import com.zcy.common.constants.ReturnCanstants;
import com.zcy.entity.YourDiary;
import com.zcy.service.impl.YourDiaryServiceImpl;

import org.apache.log4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description TODO
 * @Date 2020-07-01 08:56
 * @Created by liyang
 */
@RestController
public class DiaryController {
    private static final Logger logger = Logger.getLogger(DiaryController.class);

    @Autowired
    private YourDiaryServiceImpl yourDiaryService;

    @RequestMapping(value = "/insertYourDiary",method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult inSertDiary(@RequestBody YourDiary yourDiary){
        int i=0;
        AjaxResult ajaxResult=new AjaxResult();
        try{

            i= yourDiaryService.insertDiary(yourDiary);
            ajaxResult.setCode(ReturnCanstants.ERROR_NO);
            ajaxResult.setMessage("新增日记成功");

        }catch (Exception e){
            ajaxResult.setCode(ReturnCanstants.ERROR_YES);
            e.printStackTrace();
        }
        return ajaxResult;
    }

    @RequestMapping(value = "/selectDiaryListByUserId",method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult selectDiaryListByUserId(@RequestBody YourDiary yourDiary){
        AjaxResult ajaxResult=new AjaxResult();
        yourDiary.setDiaryStatus(DiaryConstants.DIARY_STATUS_NORMAL);
        try{
            PageHelper.startPage(yourDiary.getPage(), yourDiary.getSize());
            List<YourDiary> diaries = yourDiaryService.selectDiaryListByUserId(yourDiary);
            PageInfo pageInfo=new PageInfo(diaries);
            ajaxResult.setData(diaries);
            ajaxResult.setCode(ReturnCanstants.ERROR_NO);
        }catch (Exception e){
            ajaxResult.setCode(ReturnCanstants.ERROR_YES);
            e.printStackTrace();
            logger.error(e);

        }
        return ajaxResult;
    }

    @RequestMapping(value = "/updateDiaryBykey",method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult updateDiaryByKey(@RequestBody YourDiary yourDiary){
        AjaxResult ajaxResult = new AjaxResult();
        try{
            int i = yourDiaryService.updateDiary(yourDiary);
            ajaxResult.setCode(ReturnCanstants.ERROR_NO);
            ajaxResult.setMessage("修改成功");
        }catch (Exception e){
            e.printStackTrace();
            ajaxResult.setMessage("修改失败");
            ajaxResult.setCode(ReturnCanstants.ERROR_YES);
        }
        return ajaxResult;
    }


    @RequestMapping(value = "/deleteDiaryByKey",method = RequestMethod.POST)
    public AjaxResult deleteDiaryByKey(@RequestBody YourDiary yourDiary){
        AjaxResult ajaxResult=new AjaxResult();
        try{
            int i = yourDiaryService.deleteDiary(yourDiary);
            ajaxResult.setCode(ReturnCanstants.ERROR_NO);
            ajaxResult.setMessage("删除成功");
        }catch (Exception e){
            e.printStackTrace();
            ajaxResult.setMessage("删除失败");
            ajaxResult.setCode(ReturnCanstants.ERROR_YES);
        }
        return ajaxResult;
    }
}
