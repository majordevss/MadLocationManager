package com.example.lezh1k.sensordatacollector.Interfaces;

import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;


import java.util.List;

/**
 * Created by lezh1k on 1/30/18.
 */

public interface MapInterface {
    void showRoute(List<LatLng> route, int interestedRoute);
    void moveCamera(CameraPosition position);
    void setAllGesturesEnabled(boolean enabled);
}
