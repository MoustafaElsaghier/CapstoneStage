package elsaghier.example.com.capstonestage.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import elsaghier.example.com.capstonestage.R;

public class HomeActivity extends AppCompatActivity {

    TextView restaurant_TV, hotels_TV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    void init() {
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        restaurant_TV = findViewById(R.id.restaurant_layout);
        hotels_TV = findViewById(R.id.hotels_layout);
        restaurant_TV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, RestaurantActivity.class);
                startActivity(intent);
            }
        });
        hotels_TV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, HotelsActivity.class);
                startActivity(intent);
            }
        });
    }

}
