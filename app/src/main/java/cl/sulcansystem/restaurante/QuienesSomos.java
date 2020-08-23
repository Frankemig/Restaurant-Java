package cl.sulcansystem.restaurante;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import cl.sulcansystem.restaurante.modelo.BaseDatosEmpleados;
import cl.sulcansystem.restaurante.modelo.Empleado;

public class QuienesSomos extends AppCompatActivity {
    RecyclerView recycleEmpleado;
    List<Empleado> empleadoList = new ArrayList<>();
    EmpleadoAdapter empleadoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quienes_somos);

        empleadoList = BaseDatosEmpleados.getListaEmpleados();
        recycleEmpleado = findViewById(R.id.recycler_quienes_somos);
        empleadoAdapter= new EmpleadoAdapter(empleadoList);
        recycleEmpleado.setAdapter(empleadoAdapter);

    }

    @Override
    public void onBackPressed() {
       /* Intent menu = new Intent(QuienesSomos.this, Menu.class);
        startActivity(menu);
        finish();*/
        super.onBackPressed();
    }
}