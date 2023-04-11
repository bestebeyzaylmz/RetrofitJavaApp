package com.example.retrofitjavaapp.service;

import com.example.retrofitjavaapp.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    //GET, POST, UPDATE, DELETE
    //https://rest.coinapi.io/v1/exchangerate/BTC?apikey=BC170A5E-9A99-45BE-AAE5-03B0796C692F

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    //Call<List<CryptoModel>> getData();
    Observable<List<CryptoModel>> getData();

}
