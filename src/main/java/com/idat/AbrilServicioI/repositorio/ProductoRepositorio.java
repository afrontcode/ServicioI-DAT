package com.idat.AbrilServicioI.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.AbrilServicioI.model.Productos;


@Repository
public interface ProductoRepositorio extends JpaRepository<Productos, Integer> {
	
	

}
