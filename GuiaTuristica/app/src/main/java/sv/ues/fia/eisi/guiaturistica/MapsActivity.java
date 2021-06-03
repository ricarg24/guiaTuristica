package sv.ues.fia.eisi.guiaturistica;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.app.Activity;
import android.app.Dialog;
import android.content.pm.PackageManager;
import android.os.Bundle;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        int status = GooglePlayServicesUtil.isGooglePlayServicesAvailable(getApplicationContext());
        if (status == ConnectionResult.SUCCESS) {

            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);


        } else {
            Dialog dialog = GooglePlayServicesUtil.getErrorDialog(status, (Activity) getApplicationContext(), 10);
            dialog.show();
        }

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        UiSettings uiSettings = mMap.getUiSettings();
        System.out.println("mapa validacion1");


        // Add a marker in Sydney and move the camera

        LatLng teatro = new LatLng(13.698626773314187, -89.19039109507757);
        LatLng catedral = new LatLng(13.698682053069913, -89.1913545719834);
        LatLng dalia = new LatLng(13.698014753001953, -89.18971708885076);
        LatLng libertad = new LatLng(13.697683162087033, -89.18962139779566);
        LatLng museoA = new LatLng(13.700155940581125, -89.20018575723107);
        LatLng bolivar = new LatLng(13.69844731442469, -89.19843745445193);
        LatLng oso = new LatLng(13.701296059566825, -89.19669800568794);
        LatLng forma = new LatLng(13.70065933654978, -89.22565986160832);
        LatLng rosario = new LatLng(13.697966474287467, -89.1884537);
        LatLng arte = new LatLng(13.693741624013656, -89.24174693863426);
        LatLng cuscatlan = new LatLng(13.698773741880787, -89.20674993068288);
        LatLng morazan = new LatLng(13.699344405726658, -89.19044997100934);
        LatLng barrios = new LatLng(13.697775658179069, -89.19121294058081);
        LatLng hula = new LatLng(13.698643415668437, -89.19311654879198);       
        LatLng bonanza = new LatLng(13.699406514904304, -89.19556673760462);



        mMap.addMarker(new MarkerOptions().position(teatro).title("Teatro Nacional"));
        mMap.addMarker(new MarkerOptions().position(catedral).title("Catedral Metropolitana"));
        mMap.addMarker(new MarkerOptions().position(dalia).title("Club La Dalia"));
        mMap.addMarker(new MarkerOptions().position(libertad).title("Parque Libertad"));
        mMap.addMarker(new MarkerOptions().position(museoA).title("Museo Universitario de Antropología"));
        mMap.addMarker(new MarkerOptions().position(bolivar).title("Parque Simon Bolivar"));
        mMap.addMarker(new MarkerOptions().position(oso).title(" HOTEL EL OSO"));
        mMap.addMarker(new MarkerOptions().position(forma).title("Museo Forma"));
        mMap.addMarker(new MarkerOptions().position(rosario).title("Iglesia El Rosario"));
        mMap.addMarker(new MarkerOptions().position(arte).title("Museo de Arte de El Salvador"));
        mMap.addMarker(new MarkerOptions().position(cuscatlan).title("Parque Cuscatlan"));
        mMap.addMarker(new MarkerOptions().position(morazan).title("Plaza Morazán"));
        mMap.addMarker(new MarkerOptions().position(barrios).title("Plaza Cívica Capitán General Gerardo Barrios"));
        mMap.addMarker(new MarkerOptions().position(hula).title("Mercado Hula Hula"));
        mMap.addMarker(new MarkerOptions().position(bonanza).title("Pollo Bonanza"));



        mMap.moveCamera(CameraUpdateFactory.newLatLng(teatro));

        float zoomlevel =16;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(teatro,zoomlevel));

    }
}