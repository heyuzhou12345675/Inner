package com.zcy.vo;

import java.io.Serializable;

/**
 * @Description TODO
 * @Date 2020-07-03 09:30
 * @Created by liyang
 */
public class PageVo implements Serializable {
    /**
     * 页数
     */
    //private Integer page = 1;
    private Integer page;

    /**
     * 每页条数
     */
    //private Integer size = 10;
    private Integer size;

    private String type;


    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
