package sv.ues.fia.eisi.guiaturistica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class ListaDeLugares extends AppCompatActivity {
    ListView lista;
    String [][] lugares = {
            {"Centro Historico"},
            {"Iglesia el Rosario"},
            {"Plaza Libertad"},
            {"Teatro Nacional de San Salvador"},
            {"Catedral Metropolitana de San Salvador"},
            {"Plaza Barrios"},
            {"Club la dalia"},
            {"Moris Rooftop"}
    };

    int[] imgLugares = {R.drawable.lug_int_01,R.drawable.lug_int_02,R.drawable.lug_int_03,R.drawable.lug_int_04,R.drawable.lug_int_05,R.drawable.lug_int_06,R.drawable.rest_01,R.drawable.rest_02};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_lugares);

        lista = (ListView) findViewById(R.id.lvLista);

        lista.setAdapter(new Adaptador(this, lugares, imgLugares));

    }
}