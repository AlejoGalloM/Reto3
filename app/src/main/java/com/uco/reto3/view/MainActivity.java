package com.uco.reto3.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.uco.reto3.R;
import com.uco.reto3.utilities.ActionBarUtil;
import com.uco.reto3.view.movimiento.MovimientoActivity;
import com.uco.reto3.view.movimiento.ReporteActivity;


public class MainActivity extends AppCompatActivity {

    private ActionBarUtil actionBarUtil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
    }

    private void initComponents() {
        actionBarUtil = new ActionBarUtil(this);
        actionBarUtil.setToolBar(getString(R.string.menu_principal));
    }


    public void goToTarifaActivity(View view) {
        Intent intent = new Intent(this,TarifaActivity.class);
        startActivity(intent);
    }


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }


    public void gotToIngresoSalida(View view) {
        Intent intent = new Intent(this, MovimientoActivity.class);
        startActivity(intent);
    }

    public void gotToGenerarReporte(View view) {
        Intent intent = new Intent(this, ReporteActivity.class);
        startActivity(intent);
    }

}
