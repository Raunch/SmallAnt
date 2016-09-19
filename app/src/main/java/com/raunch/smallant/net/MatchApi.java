package com.raunch.smallant.net;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by shun on 2016/9/18.
 */


public interface MatchApi {
    /**
     * 获取联赛信息,目前聚合数据只能获取到当前两轮比赛数据
     * 积分榜显示前十位
     */
    @GET("league")
    Call<String> getMatch(@Query("dtype") String type, @Query("league") String league, @Query("key") String key);

}
