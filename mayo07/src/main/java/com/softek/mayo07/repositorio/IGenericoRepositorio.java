package com.softek.mayo07.repositorio;

import com.softek.mayo07.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGenericoRepositorio extends JpaRepository<Producto, Integer> {

}
