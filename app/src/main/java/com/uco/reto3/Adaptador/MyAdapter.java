package com.uco.reto3.Adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.uco.reto3.R;


public class MyAdapter extends BaseAdapter {

    Context context;
    String[] placas;
    private static LayoutInflater inflater = null;

    public MyAdapter(Context context, String[] placas){
        this.context = context;
        this.placas = placas;
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return placas.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final View VISTA = inflater.inflate(R.layout.elementos_lista, null);
        TextView placa = (TextView) VISTA.findViewById(R.id.placaLista);
        placa.setText(placas[position]);
        return VISTA;
    }
}
