package com.example.xushengxia.testretrofit;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by xushengxia on 2019/5/22.
 */

public interface GetRequest_Interface {

    @GET("ajax.php?a=fy&f=auto&t=auto&w=hello%20world")
    Call<Bean> getCall();
}
