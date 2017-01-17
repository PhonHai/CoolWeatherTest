package com.example.haiphon.coolweathertest.ui;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ListView;

import com.example.haiphon.coolweathertest.R;
import com.example.haiphon.coolweathertest.db.City;
import com.example.haiphon.coolweathertest.db.County;
import com.example.haiphon.coolweathertest.db.Province;

import java.util.ArrayList;
import java.util.List;

public class ChooseAreaFragment extends Fragment implements View.OnClickListener {

    private TextView titleText;
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private List<String> dataList = new ArrayList<>();


    public static final int LEVEL_PROVINCE = 0;

    public static final int LEVEL_CITY = 1;

    public static final int LEVEL_COUNTY = 2;

    /**
    * 省列表
    */
    private List<Province> provinceList;

    /**
    * 市列表
    */
    private List<City> cityList;

    /**
    * 县列表
    */
    private List<County> countyList;

    /**
    * 选中的省份
    */
    private Province selectedProvince;

    /**
    * 选中的城市
    */
    private City selectedCity;

    /*
    * 当前选中的级别
    */
    private int currentLevel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.choose_area, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        titleText = (TextView) view.findViewById(R.id.title_text);
        view.findViewById(R.id.back_button).setOnClickListener(this);
        listView = (ListView) view.findViewById(R.id.list_view);

        adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, dataList);
        listView.setAdapter(adapter);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(currentLevel == LEVEL_PROVINCE){
                    selectedProvince = provinceList.get(i);
                }
            }
        });
        queryProvinces();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back_button:
                if(currentLevel == LEVEL_COUNTY){
                    queryCitityes();
                }else if(currentLevel == LEVEL_CITY){
                    queryProvinces();
                }
                break;
        }
    }

    /**
    * 查询全国所有的省,优先从数据库查询，如果没有再到服务器查询。
    */
    private void queryProvinces() {

    }

    /**
    * 查询全国所有的市,优先从数据库查询，如果没有再到服务器查询。
    */
    private void queryCitityes() {

    }

    /**
    * 查询选中的是包含的县,优先从数据库查询，如果没有再到服务器查询。
    */
    private void queryCounties() {

    }




}
