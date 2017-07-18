package com.tutorialheap.retrofitexample;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by dell on 7/17/2017.
 */

public class ApiClient {

    private static final String BASE_URL = "http://api.tutorialheap.com/";
public static Retrofit retrofit = null;

    public static Retrofit getApiClient(){

        if(retrofit == null)
        {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }

}
