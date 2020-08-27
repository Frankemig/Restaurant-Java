package cl.sulcansystem.restaurante;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import cl.sulcansystem.restaurante.modelo.BaseDatosEmpleados;
import cl.sulcansystem.restaurante.modelo.Empleado;
import cl.sulcansystem.restaurante.modelo.Evento;
import cl.sulcansystem.restaurante.tipos_usuarios.PublicoGeneral;

public class QuienesSomos extends AppCompatActivity {

    Button nuestroEquipo, restaurant, eventos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quienes_somos);

        nuestroEquipo = findViewById(R.id.btnnuestro_equipo);
        restaurant = findViewById(R.id.btnRestaurante);
        eventos = findViewById(R.id.btnEventos);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, NuestroEquipo.newInstance("",""),"FragmentEquipo")
                .commit();


    restaurant.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, Restaurant.newInstance("",""),"FragmentRestaurant")
                    .commit();
        }
    });
    nuestroEquipo.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, NuestroEquipo.newInstance("",""),"FragmentEquipo")
                    .commit();
        }
    });

    eventos.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container,EventosVista.newInstance("",""), "FragmentEvento")
                    .commit();
        }
    });
    }

    @Override
    public void onBackPressed() {
        Intent publico = new Intent(QuienesSomos.this, PublicoGeneral.class);
        startActivity(publico);
        finish();
        super.onBackPressed();
    }
}