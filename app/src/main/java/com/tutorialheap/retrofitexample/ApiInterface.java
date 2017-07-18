package com.tutorialheap.retrofitexample;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by dell on 7/17/2017.
 */

public interface ApiInterface {

@GET("worldpopulation/population")
Call<Country> getCountries();
}
