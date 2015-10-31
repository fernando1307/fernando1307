package sw.edu.ulima.foodtrucker;

import android.os.PersistableBundle;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.parse.ParseUser;

public class MapsActivity extends FragmentActivity {

    private GoogleMap mMap;
    final ParseUser currentUser = ParseUser.getCurrentUser();

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState);
        System.out.println("si entra on create");
        setContentView(R.layout.activity_maps);
        setUpMapIfNeeded();
    }

    @Override
    protected void onResume() {
        super.onResume();

        setUpMapIfNeeded();
    }

    private void setUpMapIfNeeded() {
        //null check para confirmar que el mapa no se ha inicializado
        if (mMap == null) {
            //obtener el mapa del SupportMapFragment
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            System.out.println("si entra setupmapifneeded");
            // ver si hubo exito
            if (mMap != null) {
                setUpMap();
            }
        }
    }

    private void setUpMap() {
        System.out.println("si entra setupmap");
        mMap.addMarker(new MarkerOptions().position(new LatLng(0,0)).title("Marker"));


            // Get longitude of the current location

            //String userId = "O6pGXcJy3C";
            //String username = "Nick";
            //ParseObject globeobject = new ParseObject("global");
            //globeobject.put("username",currentUser.getString("name"));

            //globeobject.put("userID",userId);




            //final ParseGeoPoint point = new ParseGeoPoint(latitude, longitude);
            //globeobject.put("Location", point);

        }
    }

