package com.busrayasar.itunessearchapp.api

package com.example.android.codelabs.paging.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.logging.HttpLoggingInterceptor.Level
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

const val IN_QUALIFIER = "in:name,description"

/**
 * iTunes API communication setup via Retrofit.
 */

interface ITunesService {
}