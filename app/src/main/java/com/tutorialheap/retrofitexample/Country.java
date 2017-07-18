package com.tutorialheap.retrofitexample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 7/17/2017.
 */

public class Country {
    @SerializedName("worldpopulation")
    @Expose
    private List<Items> items;

    public List<Items> getItems() {
        return items;
    }

    public void setItems (List<Items> items) {
        this.items = items;
    }



}

