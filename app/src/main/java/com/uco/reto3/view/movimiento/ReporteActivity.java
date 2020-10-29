package com.uco.reto3.view.movimiento;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;
import com.uco.reto3.Adaptador.MyAdapter;
import com.uco.reto3.R;
import com.uco.reto3.entidades.Movimiento;
import com.uco.reto3.persistencia.room.DataBaseHelper;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;


public class ReporteActivity extends AppCompatActivity {

    @BindView(R.id.listaReporte)
    public ListView listaReporte;
    private List<Movimiento> movimientos;
    private String[] placas;
    private DataBaseHelper dataBaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte);
        ButterKnife.bind(this);
        dataBaseHelper = DataBaseHelper.getDBMainThread(this);

        movimientos = dataBaseHelper.getMovimientoDAO().listar();
        if(movimientos.isEmpty()){
            Toast.makeText(getApplication(),R.string.sin_movimientos,Toast.LENGTH_SHORT).show();
            finish();
        }else{
            placas = new String[movimientos.size()];
            for(int i = 0; i < movimientos.size(); i++){
                Movimiento movimientoTemporal = movimientos.get(i);
                String placaTemporal = movimientoTemporal.getPlaca();
                placas[i] = placaTemporal;
            }
        }

        listaReporte.setAdapter(new MyAdapter(this,placas));
    }
}