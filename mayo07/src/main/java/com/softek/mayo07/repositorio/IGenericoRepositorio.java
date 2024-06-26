package com.softek.mayo07.repositorio;

import com.softek.mayo07.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IGenericoRepositorio<T, ID> extends JpaRepository<T, ID> {

}
