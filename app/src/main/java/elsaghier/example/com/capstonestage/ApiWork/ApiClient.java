package elsaghier.example.com.capstonestage.ApiWork;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ELSaghier on 1/25/2018.
 */

public class ApiClient {

    private static final String BASE_URL = "https://developers.zomato.com/api/v2.1/search?lat=-33.92127&lon=18.4180213&count=10/";
    private static Retrofit retrofit = null;


    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
