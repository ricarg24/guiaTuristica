package sv.ues.fia.eisi.guiaturistica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void EmpezarRuta (View view){
        Intent ruta = new Intent(this, MapsActivity.class);
        startActivity(ruta);
    }

    public void EscanearCodigo (View view){
        Intent codigo = new Intent(this, CodigoQR.class);
        startActivity(codigo);
    }

}