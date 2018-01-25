package elsaghier.example.com.capstonestage.Fragments;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import elsaghier.example.com.capstonestage.Adapters.HotelsAdapter;
import elsaghier.example.com.capstonestage.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class HotelsActivityFragment extends Fragment {

    @BindView(R.id.hotels_recyc)
    RecyclerView hotelRecycler;
    RecyclerView.LayoutManager layoutManager;
    HotelsAdapter hotelsAdapter;

    public HotelsActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_hotels, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}
