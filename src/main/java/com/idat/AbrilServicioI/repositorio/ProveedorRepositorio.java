package com.idat.AbrilServicioI.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.AbrilServicioI.model.Proveedor;

@Repository
public interface ProveedorRepositorio extends JpaRepository<Proveedor, Integer> {

}
