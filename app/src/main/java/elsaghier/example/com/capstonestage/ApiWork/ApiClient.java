package elsaghier.example.com.capstonestage.ApiWork;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ELSaghier on 1/25/2018.
 */

public class ApiClient {
//55a1d18014dd0c0dac534c02598a3368
    private static final String BASE_URL = "https://developers.zomato.com/api/v2.1/";
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
