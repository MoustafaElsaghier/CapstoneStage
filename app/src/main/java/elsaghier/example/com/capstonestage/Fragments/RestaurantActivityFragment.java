package elsaghier.example.com.capstonestage.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import elsaghier.example.com.capstonestage.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class RestaurantActivityFragment extends Fragment {

    public RestaurantActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_restaurant, container, false);
    }
}
