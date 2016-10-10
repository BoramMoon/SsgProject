package com.seoulapp.ssg.api;

import com.seoulapp.ssg.model.Model;
import com.seoulapp.ssg.model.Users;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Boram Moon on 2016-10-05.
 */
public interface VolunteerApiService {
    @GET("/volunteer_list")
    Call<Model> getVolunteer_info();

    @POST("/volunteer_join")
    Call<Users> joinVolunteer(@Body Users user);

}