package upt.ac.maps_example.location

import android.annotation.SuppressLint
import android.content.Context
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationServices
import com.google.android.gms.location.Priority

@SuppressLint("MissingPermission")
class LocationHandler(context: Context) {

    private val client: FusedLocationProviderClient =
        LocationServices.getFusedLocationProviderClient(context)

    fun registerLocationListener(locationCallback: LocationCallback) {
        // TODO 2: Create a LocationRequest with Priority.PRIORITY_HIGH_ACCURACY,
        //  min update distance set to 5m and update interval to 100ms.

        // TODO 3: Register request and callback with the fused location service client.

    }

    fun unregisterLocationListener(locationCallback: LocationCallback) {
        client.removeLocationUpdates(locationCallback)
    }

}
