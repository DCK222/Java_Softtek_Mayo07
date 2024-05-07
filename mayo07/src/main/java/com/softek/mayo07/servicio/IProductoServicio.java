package com.softek.mayo07.servicio;

import com.softek.mayo07.CRUD.ICRUD;
import com.softek.mayo07.modelo.Producto;

import java.util.List;

public interface IProductoServicio extends ICRUD<Producto, Integer> {
    


    Producto obtenerProducto(int id);

    List<Producto> listarTodos();

    Producto crearProducto(Producto producto);

    Producto actualizarProducto(Producto producto);

    void eliminarProducto(int id);
}
