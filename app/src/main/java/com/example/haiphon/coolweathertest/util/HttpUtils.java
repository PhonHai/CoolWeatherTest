package com.example.haiphon.coolweathertest.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @author haiphon.huang on 2017/1/17.
 * @description 从服务器获取数据
 */

public class HttpUtils {

    public static void sendOkHttpRequest(String url, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        client.newCall(request).enqueue(callback);
    }
}
