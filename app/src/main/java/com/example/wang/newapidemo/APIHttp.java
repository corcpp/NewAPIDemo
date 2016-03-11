package com.example.wang.newapidemo;

import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.io.IOException;
import java.util.HashMap;

import okhttp3.Response;

/**
 * Created by wang on 2016/3/11.
 */
public class APIHttp {


    public static Response getSyncToken(String url, HashMap<String, String> params) {

        Response response = null;
        try {
            response = OkHttpUtils
                    .get()
                    .url(url)
                    .params(params)
                    .build()
                    .execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (response.isSuccessful()) {
            return response;
        } else {
            return null;
        }
    }

    public static void getAsyncToken(String url, HashMap<String, String> params, StringCallback callback) {

        OkHttpUtils
                .get()
                .url(url)
                .params(params)
                .build()
                .execute(callback);

//        new StringCallback() {
//
//            @Override
//            public void onError(Call call, Exception e) {
//
//            }
//
//            @Override
//            public void onResponse(String response)
//            {
//                LogUtil.debug(response);
//
//            }
//        }
    }


}
