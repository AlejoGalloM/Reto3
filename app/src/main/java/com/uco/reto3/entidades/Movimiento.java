package com.uco.reto3.entidades;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.uco.reto3.persistencia.Tabla;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(tableName = Tabla.MOVIMIENTO)
@NoArgsConstructor
public class Movimiento {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "idMovimiento")
    private Integer idMovimiento;

    @ColumnInfo(name = "idTarifa")
    private Integer idTarifa;

    @ColumnInfo(name = "placa")
    private String placa;

    @ColumnInfo(name = "fechaEntrada")
    private String fechaEntrada;

    @ColumnInfo(name = "fechaSalida")
    private String fechaSalida;

    @ColumnInfo(name = "finalizaMovimiento")
    private boolean finalizaMovimiento;

    @NonNull
    public Integer getIdMovimiento() {
        return idMovimiento;
    }

    public Integer getIdTarifa() {
        return idTarifa;
    }

    public String getPlaca() {
        return placa;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public boolean isFinalizaMovimiento() {
        return finalizaMovimiento;
    }

    public void setIdMovimiento(@NonNull Integer idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public void setIdTarifa(Integer idTarifa) {
        this.idTarifa = idTarifa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setFinalizaMovimiento(boolean finalizaMovimiento) {
        this.finalizaMovimiento = finalizaMovimiento;
    }
}
