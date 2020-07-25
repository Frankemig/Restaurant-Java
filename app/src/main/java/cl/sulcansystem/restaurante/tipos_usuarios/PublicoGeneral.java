package cl.sulcansystem.restaurante.tipos_usuarios;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import cl.sulcansystem.restaurante.Ingresar;
import cl.sulcansystem.restaurante.R;

public class PublicoGeneral extends AppCompatActivity {

    ImageView reservas, delivery, quienes_somos, contactanos, logoSulcan;
    TextView txtBienvenido, txtNombreUsuario, txtReserva, txtDelivery, txtQuienesSomos, txtContactanos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.publico_general);

        reservas = (ImageView) findViewById(R.id.reservas);
        delivery = (ImageView) findViewById(R.id.delivery);
        quienes_somos = (ImageView) findViewById(R.id.quienes_somos);
        contactanos = (ImageView) findViewById(R.id.contactanos);
        logoSulcan = (ImageView) findViewById(R.id.icon_logo_sulcan);
        txtBienvenido = (TextView) findViewById(R.id.txtBienvenido);
        txtNombreUsuario.setText(Ingresar.Nombre);
        txtReserva = (TextView) findViewById(R.id.txtreservar);
        txtDelivery = (TextView) findViewById(R.id.txtdelivery);
        txtQuienesSomos = (TextView) findViewById(R.id.txtquienes_somos);
        txtContactanos = (TextView) findViewById(R.id.txtcontactanos);

        Typeface face = Typeface.createFromAsset(getAssets(),"fuentes/SCRIPTBL.TTF");
        Typeface face2 = Typeface.createFromAsset(getAssets(),"Birds of Paradise © PERSONAL USE ONLY.ttf");
        txtContactanos.setTypeface(face2);
        txtQuienesSomos.setTypeface(face2);
        txtDelivery.setTypeface(face2);
        txtReserva.setTypeface(face2);
        txtBienvenido.setTypeface(face);

        reservas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        contactanos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        delivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        quienes_somos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}