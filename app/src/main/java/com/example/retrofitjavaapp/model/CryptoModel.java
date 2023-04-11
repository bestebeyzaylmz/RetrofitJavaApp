package com.example.retrofitjavaapp.model;

import com.google.gson.annotations.SerializedName;

public class CryptoModel {

    //apideki ismi ile eşleştirmek için kullanılır
    @SerializedName("currency")
    public String currency;

    @SerializedName("price")
    public String price;
}
