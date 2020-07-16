package com.zcy.common.ajax;

import java.io.Serializable;

/**
 * @Author :hudong
 * @Date :Created in 13:14 2018/1/2
 */
public class ApiResult implements Serializable {

    private static final long serialVersionUID = -7941323232339457976L;

    private ApiStatus status;
    private ApiContentList content;

    private String uid;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "ApiResult{" +
                "status=" + status +
                ", content=" + content +
                '}';
    }

    public ApiStatus getStatus() {
        return status;
    }

    public void setStatus(ApiStatus status) {
        this.status = status;
    }

    public ApiContentList getContent() {
        return content;
    }

    public void setContent(ApiContentList content) {
        this.content = content;
    }

    public ApiResult(ApiStatus status, ApiContentList content, String isCity, String uid) {
        this.status = status;
        this.content = content;
        this.uid=uid;
    }

    public ApiResult() {

    }
}
