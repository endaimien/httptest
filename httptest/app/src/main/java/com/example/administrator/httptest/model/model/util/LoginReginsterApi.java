package com.example.administrator.httptest.model.model.util;

import retrofit2.http.Field;
import retrofit2.http.POST;

/**
 * Created by Administrator on 2018/10/22 0022.
 */

public interface LoginReginsterApi {
    @POST
    public void login(@Field("username")String username,@Field("password")String password);
}
