package com.example.medview.network;

import android.util.Log;

import com.example.medview.models.LoginRequestModel;
import com.example.medview.models.ResponseModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiService {
//    @POST("patient/create")
//    Call<PatientUser> createUser();

//    @GET("patient/patients")
//    Call<ResponseModel> getPatientsList();

    @POST("patient/login")
    Call<ResponseModel> loginuser(@Body LoginRequestModel requestModel);

}
