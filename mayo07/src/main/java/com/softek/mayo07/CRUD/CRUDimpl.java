package com.softek.mayo07.CRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class CRUDimpl<T, ID> implements ICRUD<T, ID> {
    @Autowired
    private JpaRepository<T, ID> repositorio;

    @Override
    public List<T> consultarTodos() {
        return repositorio.findAll();
    }

    @Override
    public T consultarUno(ID id) {
        return repositorio.findById(id).orElse(null);
    }

    @Override
    public T crear(T entidad) {
        return repositorio.save(entidad);
    }

    @Override
    public T modificar(T entidad) {
        return repositorio.save(entidad);
    }

    @Override
    public void eliminar(ID id) {
        repositorio.deleteById(id);
    }


}
