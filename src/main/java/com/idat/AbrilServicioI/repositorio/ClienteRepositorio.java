package com.idat.AbrilServicioI.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.AbrilServicioI.model.Cliente;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {

}
