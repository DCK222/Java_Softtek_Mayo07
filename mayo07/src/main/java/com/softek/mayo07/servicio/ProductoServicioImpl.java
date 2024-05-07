package com.softek.mayo07.servicio;

import com.softek.mayo07.CRUD.CRUDimpl;
import com.softek.mayo07.modelo.Producto;
import com.softek.mayo07.repositorio.IGenericoRepositorio;
import com.softek.mayo07.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServicioImpl extends CRUDimpl<Producto, Integer> implements IProductoServicio {
@Autowired
    private ProductoRepositorio repo;
@Override
public IGenericoRepositorio<Producto,Integer> getRepo(){
    return repo;
}

}