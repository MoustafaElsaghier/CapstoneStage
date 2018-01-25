package elsaghier.example.com.capstonestage.ApiWork;

import elsaghier.example.com.capstonestage.Models.RestaurantResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

/**
 * Created by ELSaghier on 1/25/2018.
 */

public interface RestaurantInterface {

    @GET("search")
    Call<RestaurantResponse> getRestaurants(@Header("application-type") String s,@Header("user-key") String stringKey);
}
