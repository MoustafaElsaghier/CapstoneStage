package elsaghier.example.com.capstonestage.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import elsaghier.example.com.capstonestage.Activities.RestaurantsDetailsActivity;
import elsaghier.example.com.capstonestage.Models.RestaurantModel;
import elsaghier.example.com.capstonestage.Models.RestaurantResponse;
import elsaghier.example.com.capstonestage.R;

/**
 * Created by ELSaghier on 1/25/2018.
 */


public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantHolder> {

    private List<RestaurantResponse.RestRes> mData;
    private Context mContext;

    public RestaurantAdapter(List<RestaurantResponse.RestRes> data, Context mContext) {
        this.mData = data;
        this.mContext = mContext;
    }

    @Override
    public RestaurantHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyc_item, parent, false);
        return new RestaurantHolder(view);
    }

    @Override
    public void onBindViewHolder(RestaurantHolder holder, int position) {
        final RestaurantModel restaurant = mData.get(position).getList();
        holder.setName(restaurant.getName());
        holder.setAddress(restaurant.getLocation().getAddress());
        holder.setRating(restaurant.getAverageCostForTwo() + " " + restaurant.getCurrency());
        if (restaurant.getFeaturedImage().isEmpty())
            holder.restaurantImg.setImageResource(R.mipmap.ic_launcher);
        else
            Glide.with(mContext).load(restaurant.getFeaturedImage()).into(holder.restaurantImg);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(mContext, RestaurantsDetailsActivity.class);
                i.putExtra("rest_item", restaurant);
                mContext.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (mData == null)
            return 0;
        return mData.size();
    }


    class RestaurantHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.item_img)
        ImageView restaurantImg;
        @BindView(R.id.item_name)
        TextView restaurantName;
        @BindView(R.id.iteem_address)
        TextView restaurantAddress;
        @BindView(R.id.item_price)
        TextView restaurantPriceRange;

        RestaurantHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(itemView);
        }

        void setName(String name) {
            restaurantName.setText(name);
        }

        void setAddress(String address) {
            restaurantAddress.setText(address);
        }

        void setRating(String rating) {
            restaurantPriceRange.setText(rating);
        }

    }

}

