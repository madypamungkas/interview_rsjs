package id.technow.test_menu.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Client {

    private static final String BASE_URL = "https://mocki.io/v1/";
    private static Client mInstance;
    private Retrofit retrofit;

    Gson gson = new GsonBuilder()
            .setLenient()
            .create();

    private Client(){
        final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(, TimeUnit.SECONDS)
                .readTimeout(, TimeUnit.SECONDS)
                .writeTimeout(, TimeUnit.SECONDS)
                .build();

        retrofit = new Retrofit.Builder()
                .baseUrl("")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient)
                .build();
    }


    public static synchronized Client getInstance() {
        if (mInstance == null) {
            mInstance = new Client();
        }
        return mInstance;
    }
    public ApiService getApi(){
        return retrofit.create(ApiService.class);
    }
}



