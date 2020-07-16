package com.zcy.feign;

/**
 * @Description TODO
 * @Date 2020-07-01 09:18
 * @Created by liyang
 */


import com.zcy.common.ajax.AjaxResult;
import com.zcy.entity.YourDiary;
import com.zcy.feign.hystric.DiaryServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @FeignClient（“服务名”），来指定调用哪个服务。
 * */
@FeignClient(value ="your-diary",fallback = DiaryServiceHystric.class)
public interface DiaryService {
    /**
     * requestMapping标识要调用的方法,consumes表示数据传输格式
     * */
    @RequestMapping(value = "/insertYourDiary",method = RequestMethod.POST,consumes = "application/json")
    AjaxResult insertOne(YourDiary yourDiary);

    @RequestMapping(value = "/selectDiaryListByUserId",method = RequestMethod.POST,consumes = "application/json")
    AjaxResult selectList(YourDiary yourDiary);

    @RequestMapping(value = "/updateDiaryBykey",method = RequestMethod.POST,consumes = "application/json")
    AjaxResult updateDiary(YourDiary yourDiary);

    @RequestMapping(value="/deleteDiaryByKey", method = RequestMethod.POST,consumes = "application/json")
    AjaxResult delelteDiary(YourDiary yourDiary);
}
