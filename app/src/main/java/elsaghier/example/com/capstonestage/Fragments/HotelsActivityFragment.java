package elsaghier.example.com.capstonestage.Fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import elsaghier.example.com.capstonestage.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class HotelsActivityFragment extends Fragment {

    public HotelsActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_hotels, container, false);
    }
}