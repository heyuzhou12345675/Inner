package com.zcy.feign.hystric;

import com.zcy.common.ajax.AjaxResult;
import com.zcy.common.constants.ReturnConstants;
import com.zcy.entity.YourDiary;
import com.zcy.feign.DiaryService;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Date 2020-07-07 10:30
 * @Created by liyang
 */
@Component
public class DiaryServiceHystric implements DiaryService {
    @Override
    public AjaxResult insertOne(YourDiary yourDiary) {
        return returnError();
    }

    @Override
    public AjaxResult selectList(YourDiary yourDiary) {
        return returnError();
    }

    @Override
    public AjaxResult updateDiary(YourDiary yourDiary) {
        return returnError();
    }

    @Override
    public AjaxResult delelteDiary(YourDiary yourDiary) {
        return returnError();
    }


    public AjaxResult returnError(){
        AjaxResult ajaxResult=new AjaxResult();
        ajaxResult.setCode(ReturnConstants.RETURN_STATUS_ERROR);
        ajaxResult.setMessage("sorry,服务出现错误。");
        return ajaxResult;
    }
}
