package com.vmb.ads_in_app.Interface;

import com.vmb.ads_in_app.LibrayData;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface IAPIFeedback {

    @POST(LibrayData.Url.URL_API_FEEDBACK)
    Call<ResponseBody> pushFeedback(@Body RequestBody body);
}
