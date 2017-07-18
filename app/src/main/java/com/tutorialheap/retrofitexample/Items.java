package com.tutorialheap.retrofitexample;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dell on 7/17/2017.
 */

public class Items {
    @SerializedName("rank")
    private String rank;

    @SerializedName("country")
    private String countryname;

    @SerializedName("population")
    private String population;

    @SerializedName("flag")
    private String flag;

    public String getFlag() {
        return flag;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCountryname() {
        return countryname;
        }

    public void setCountryname(String countryname) {

        this.countryname = countryname;
        }

//    public String getPopulation() {
//            return population;
//        }
//
//    public void setPopulation(String population) {
//            this.population = population;
//        }

    }


