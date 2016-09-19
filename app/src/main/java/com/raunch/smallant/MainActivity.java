package com.raunch.smallant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.raunch.smallant.net.FootballRetrofit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Call<String> test = new FootballRetrofit().getMatchService().getMatch("json", "英超", "d2503902b091b29054c752e432a33274");
        test.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Log.d("fuck", "response is OK");
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.d("fuck", "err happend");

            }
        });
    }
}
