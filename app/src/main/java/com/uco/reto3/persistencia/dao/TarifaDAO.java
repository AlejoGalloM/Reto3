package com.uco.reto3.persistencia.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.uco.reto3.entidades.Tarifa;

import java.util.List;

@Dao
public interface TarifaDAO {

    @Insert
    void insert(Tarifa tarifa);

    @Delete
    void delete(Tarifa tarifa);

    @Query("DELETE FROM tarifa WHERE idTarifa=:idTarifa")
    void deleteByIdTarifa(Integer idTarifa);

    @Query("SELECT * FROM tarifa Where idTarifa=:idTarifa")
    Tarifa findById(Integer idTarifa);

    @Query("SELECT * FROM tarifa")
    List<Tarifa> listar();
}
