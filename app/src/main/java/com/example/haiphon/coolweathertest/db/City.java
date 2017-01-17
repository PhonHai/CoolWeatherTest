package com.example.haiphon.coolweathertest.db;

import org.litepal.crud.DataSupport;

/**
 * @author haiphon.huang on 2017/1/17.
 * @description 城市
 */

public class City extends DataSupport {

    private int id;

    private String cityName;

    // 记录市的代号
    private int cityCode;

    // 记录当前市所属省的id值
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
