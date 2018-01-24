package elsaghier.example.com.capstonestage.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import butterknife.ButterKnife;
import butterknife.OnClick;
import elsaghier.example.com.capstonestage.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.restaurant_layout)
    void openRestaurants() {
        Intent intent = new Intent(HomeActivity.this, RestaurantActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.hotels_layout)
    void openHotels() {
        Intent intent = new Intent(HomeActivity.this, HotelsActivity.class);
        startActivity(intent);
    }

}
