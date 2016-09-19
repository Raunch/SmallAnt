package com.raunch.smallant.net;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by songshunzhang on 16/9/19.
 */

public class FootballRetrofit {
    final MatchApi mMatchService;

    Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
            .create();

    final static Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
            .serializeNulls()
            .create();

    public FootballRetrofit() {

        Retrofit matchRestAdapter = new Retrofit.Builder()
                .baseUrl("http://op.juhe.cn/onebox/football/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        mMatchService = matchRestAdapter.create(MatchApi.class);

    }


    public MatchApi getMatchService() {
        return mMatchService;
    }


}
