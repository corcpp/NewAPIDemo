package com.example.wang.newapidemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zhy.http.okhttp.callback.StringCallback;

import java.util.HashMap;
import java.util.LinkedHashMap;

import okhttp3.Call;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        HashMap<String, String> params = new LinkedHashMap<>();
        params.put("key1","value1");
        params.put("key2","value2");
        APIHttp.getAsyncToken("http://www.baidu.com", params, new StringCallback() {
            @Override
            public void onError(Call call, Exception e) {

            }

            @Override
            public void onResponse(String response) {
                LogUtil.debug(response);
            }
        });


    }

}
