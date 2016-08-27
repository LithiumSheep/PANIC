package com.example.jessexx.panic.Api;

import com.example.jessexx.panic.BuildConfig;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Nnaji-MacPro1 on 8/27/16.
 */
public class ApiClient {

    private HouseService houseService;
    private interface HouseService{
        @GET("GetDeepSearchResults.htm")
        Call<Void> getDeepSearchResults(@Query("zws-id") String zId, @Query("address") String zAddress, @Query("cityStateZip") String zCityStateZip);
    }


    public ApiClient()
    {
        Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
                .baseUrl("http://www.zillow.com/webservice/")
                .addConverterFactory(SimpleXmlConverterFactory.create());

        //Shows logs in console output
        if(BuildConfig.DEBUG)
        {
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel((HttpLoggingInterceptor.Level.BODY));
            //Add to Http client'
            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(interceptor)
                    .build();
            retrofitBuilder.client(client);
        }
        houseService= retrofitBuilder.build().create(HouseService.class);
    }

    public void getHouseValue(String address, String cityStateZip, final ApiCallBack<Void>callback)
    {
     Call<Void> call = houseService.getDeepSearchResults("X1-ZWz19lkyar4xe3_6r0dc",address, cityStateZip);
        //put request in queue (async request)
        call.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                //if successful, response status code ==200

                if(response.isSuccessful())
                {
                    callback.onSuccess(response.body());
                }
                else
                    callback.onFailure();
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {

                callback.onFailure();
            }
        });
    }

    public interface  ApiCallBack<T>
    {
        void onSuccess(T response);
        void onFailure();
    }

}
