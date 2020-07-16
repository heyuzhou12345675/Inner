package com.zcy.common.ajax;

import java.io.Serializable;

/**
 * @Author :hudong
 * @Date :Created in 13:15 2018/1/2
 */
public class ApiStatus implements Serializable {

    private static final long serialVersionUID = -4825047064236774575L;
    private String msg;
    private String ret;

    @Override
    public String toString() {
        return "ApiStatus{" +
                "msg='" + msg + '\'' +
                ", ret='" + ret + '\'' +
                '}';
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public ApiStatus() {

    }

    public ApiStatus(String msg, String ret) {

        this.msg = msg;
        this.ret = ret;
    }
}
