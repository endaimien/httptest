package com.example.administrator.httptest.model.model.model;

import com.example.administrator.httptest.model.model.util.Httputil;
import com.example.administrator.httptest.model.model.util.LoginReginsterApi;

import okhttp3.HttpUrl;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2018/10/22 0022.
 */

public class LoginResigster {
    public void login(String username, String password, Callback callback){
        Retrofit nRetrofit = new Retrofit.Builder().baseUrl(Httputil.LOGIN)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create()).build();
        LoginReginsterApi nLoginReginsterApi = nRetrofit.create(LoginReginsterApi.class);
        nLoginReginsterApi.login(username,password);
    }
}
