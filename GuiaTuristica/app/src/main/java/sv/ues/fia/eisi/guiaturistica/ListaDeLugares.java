package sv.ues.fia.eisi.guiaturistica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class ListaDeLugares extends AppCompatActivity {
    private Spinner spinner;
    ListView lista;
    String [][] lugaresDeInteres = {
            {"Centro Historico"},
            {"Iglesia el Rosario"},
            {"Plaza Libertad"},
            {"Teatro Nacional de San Salvador"},
            {"Catedral Metropolitana de San Salvador"},
            {"Plaza Barrios"}
    };
    String [][] restaurantes = {
            {"Club la dalia"},
            {"Moris Rooftop"}
    };

    int[] imgLugInt = {R.drawable.lug_int_01,R.drawable.lug_int_02,R.drawable.lug_int_03,R.drawable.lug_int_04,R.drawable.lug_int_05,R.drawable.lug_int_06};
    int[] imgRest = {R.drawable.rest_01,R.drawable.rest_02};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_lugares);

        spinner= (Spinner) findViewById(R.id.spOpciones);
        lista = (ListView) findViewById(R.id.lvLista);

        String [] opciones ={"Selecciona","Lugares de interes","Restaurantes"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, opciones);
        spinner.setAdapter(adaptador);
        spinner.setOnItemClickListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 1:
                        lista.setAdapter(new Adaptador(this, lugaresDeInteres, imgLugInt));
                        break;
                    case 2:
                        lista.setAdapter(new Adaptador(this, restaurantes, imgRest));
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}