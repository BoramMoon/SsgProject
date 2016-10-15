package com.seoulapp.ssg.api;

import com.seoulapp.ssg.model.Model;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Dongyoon on 2016. 10. 15..
 */

public interface UserService {
    @FormUrlEncoded
    @POST ("signup")
    Call<Model> signUp(@Field("email") String email, @Field("name") String name, @Field("profile") String profile, @Field("jointype") String joinType);

    @FormUrlEncoded
    @POST ("login")
    Call<Model> login(@Field("email") String email);

}