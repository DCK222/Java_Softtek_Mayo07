package com.softek.mayo07.servicio;

import com.softek.mayo07.CRUD.CRUDimpl;
import com.softek.mayo07.modelo.Lugar;
import com.softek.mayo07.repositorio.IGenericoRepositorio;
import com.softek.mayo07.repositorio.ILugarRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LugarServicioImpl extends CRUDimpl<Lugar,Integer> implements ILugarServicio {
    @Autowired
    private  ILugarRepositorio repo;

    protected IGenericoRepositorio<Lugar, Integer> getRepo() {
        return repo;
    }
}
