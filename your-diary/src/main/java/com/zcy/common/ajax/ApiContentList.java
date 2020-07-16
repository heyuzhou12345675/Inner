package com.zcy.common.ajax;

import java.io.Serializable;
import java.util.List;

/**
 * @Author :hudong
 * @Date :Created in 13:18 2018/1/2
 */
public class ApiContentList<T> implements Serializable {
    private static final long serialVersionUID = 4252172939867586970L;
    private List<T> voList;
    private String pages;
    private String isCity;
    //返回数据总条数
    private String totals;

    public String getIsCity() {
        return isCity;
    }

    public void setIsCity(String isCity) {
        this.isCity = isCity;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }
    @Override
    public String toString() {
        return "ApiContentList{" +
                "voList=" + voList +
                '}';
    }

    public List<?> getVoList() {
        return voList;
    }

    public void setVoList(List<T> voList) {
        this.voList = voList;
    }

    public ApiContentList(List<T> voList) {

        this.voList = voList;
    }

    public ApiContentList() {

    }

    public String getTotals() {
        return totals;
    }

    public void setTotals(String totals) {
        this.totals = totals;
    }
}
