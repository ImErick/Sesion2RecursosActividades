package mx.iteso.erickgarcia.sesion2recursosactividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityMain extends AppCompatActivity {
    Button button;
    EditText editNombre, editTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        editNombre = (EditText) findViewById(R.id.editTextNombre);
        editTelefono = (EditText) findViewById(R.id.editTextTelefono);
        //editNombre.getText().toString(); // para obtener el valor de los campos
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ActivityMain.this, R.string.btnPresionado, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void guardar(View view){

    }
}
