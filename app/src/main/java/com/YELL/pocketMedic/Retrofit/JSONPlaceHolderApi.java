package com.YELL.pocketMedic.Retrofit;

import com.YELL.pocketMedic.Entities.Account;
import com.YELL.pocketMedic.Entities.Medic;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface JSONPlaceHolderApi {

    @GET("/api/account-medics/{id}")
    public Call<Medic> getMedicWithID(@Path("id") long id);

    @GET("/api/account-medics")
    public Call<List<Medic>> getAllPosts();

    @POST("/api/account-medics")
    public Call<Medic> postMedic(@Body Medic medic);

    @DELETE("/api/account-medics")
    public Call<Medic> deleteMedics();

    @POST("/api/account-ms")
    public Call<Account> postAccount(@Body Account account);
}







































































































































































































































































































