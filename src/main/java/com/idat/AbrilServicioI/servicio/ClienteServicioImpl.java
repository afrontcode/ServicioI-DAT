package com.idat.AbrilServicioI.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.AbrilServicioI.dto.ClienteDTORequest;
import com.idat.AbrilServicioI.dto.ClienteDTOResponse;
import com.idat.AbrilServicioI.repositorio.ClienteRepositorio;


@Service
public class ClienteServicioImpl implements ClienteServicio{

	@Autowired
	public ClienteRepositorio repositorio;
	
	@Override
	public void guardarCliente(ClienteDTORequest cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editarCliente(ClienteDTORequest cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarCliente(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ClienteDTOResponse> listarClientes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClienteDTOResponse obtenerClienteId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
