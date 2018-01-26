package elsaghier.example.com.capstonestage.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HotelResponse {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("hotels")
    @Expose
    private List<HotelModel> hotels = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<HotelModel> getHotels() {
        return hotels;
    }

    public void setHotels(List<HotelModel> hotels) {
        this.hotels = hotels;
    }
}
