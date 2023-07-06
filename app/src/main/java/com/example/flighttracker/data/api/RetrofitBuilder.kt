package com.example.flighttracker.data.api

import com.example.flighttracker.BuildConfig
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitBuilder {

    private const val baseUrl = "https://airlabs.co/api/v9/"

    fun getInstance(): Retrofit {
        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor {
                val request = it.request().newBuilder()
                val originalUrl = it.request().url()
                val url = originalUrl.newBuilder().addQueryParameter("api_key", BuildConfig.API_KEY)
                    .build()

                request.url(url)

                it.proceed(request.build())
            }
            .connectTimeout(1, TimeUnit.MINUTES)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
            .build()

        return Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
    }

}