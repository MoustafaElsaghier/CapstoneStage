package elsaghier.example.com.capstonestage.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import elsaghier.example.com.capstonestage.Adapters.RestaurantAdapter;
import elsaghier.example.com.capstonestage.ApiWork.ApiClient;
import elsaghier.example.com.capstonestage.ApiWork.RestaurantInterface;
import elsaghier.example.com.capstonestage.Models.RestaurantResponse;
import elsaghier.example.com.capstonestage.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A placeholder fragment containing a simple view.
 */
public class RestaurantActivityFragment extends Fragment {

    @BindView(R.id.hotels_recyc)
    RecyclerView hotelsRecycler;
    RecyclerView.LayoutManager layoutManager;
    RestaurantAdapter adapter;

    RestaurantInterface anInterface;
    retrofit2.Call<RestaurantResponse> call;


    public RestaurantActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_restaurant, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        layoutManager = new LinearLayoutManager(getContext());
        hotelsRecycler.setLayoutManager(layoutManager);
        anInterface = ApiClient.getClient().create(RestaurantInterface.class);
        call = anInterface.getRestaurants("application/json",
                "55a1d18014dd0c0dac534c02598a3368");
        call.enqueue(new Callback<RestaurantResponse>() {
            @Override
            public void onResponse(Call<RestaurantResponse> call, Response<RestaurantResponse> response) {
                adapter = new RestaurantAdapter(response.body().getRestaurants(), getContext());
                hotelsRecycler.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<RestaurantResponse> call, Throwable t) {
                System.out.println("Error : " + t.getMessage());
            }
        });

    }
}
