package com.softek.mayo07.servicio;

import com.softek.mayo07.CRUD.ICRUD;
import com.softek.mayo07.modelo.Producto;
import com.softek.mayo07.repositorio.IGenericoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface IProductoServicio extends ICRUD<Producto, Integer> {

}
