package com.softek.mayo07.servicio;

import com.softek.mayo07.CRUD.CRUDimpl;
import com.softek.mayo07.modelo.Producto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicioImpl extends CRUDimpl<Producto, Integer> implements IProductoServicio {

    @Override
    public Producto obtenerProducto(int id) {
        return null;
    }

    @Override
    public List<Producto> listarTodos() {
        return List.of();
    }

    @Override
    public Producto crearProducto(Producto producto) {
        return null;
    }

    @Override
    public Producto actualizarProducto(Producto producto) {
        return null;
    }

    @Override
    public void eliminarProducto(int id) {

    }
}