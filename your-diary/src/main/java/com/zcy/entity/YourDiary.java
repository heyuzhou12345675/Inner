package com.zcy.entity;


import com.zcy.vo.PageVo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;


public class YourDiary extends PageVo implements Serializable {
    private Long diaryId;

    private Long diaryUserId;

    private LocalDateTime diaryCreateTime;

    private String diaryStatus;

    private String diaryContent;

    public Long getDiaryId() {
        return diaryId;
    }

    public void setDiaryId(Long diaryId) {
        this.diaryId = diaryId;
    }

    public Long getDiaryUserId() {
        return diaryUserId;
    }

    public void setDiaryUserId(Long diaryUserId) {
        this.diaryUserId = diaryUserId;
    }

    public LocalDateTime getDiaryCreateTime() {
        return diaryCreateTime;
    }

    public void setDiaryCreateTime(LocalDateTime diaryCreateTime) {
        this.diaryCreateTime = diaryCreateTime;
    }

    public String getDiaryStatus() {
        return diaryStatus;
    }

    public void setDiaryStatus(String diaryStatus) {
        this.diaryStatus = diaryStatus == null ? null : diaryStatus.trim();
    }

    public String getDiaryContent() {
        return diaryContent;
    }

    public void setDiaryContent(String diaryContent) {
        this.diaryContent = diaryContent == null ? null : diaryContent.trim();
    }
}