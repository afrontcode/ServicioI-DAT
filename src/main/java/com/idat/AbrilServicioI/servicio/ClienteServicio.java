package com.idat.AbrilServicioI.servicio;

import java.util.List;

import com.idat.AbrilServicioI.dto.ClienteDTORequest;
import com.idat.AbrilServicioI.dto.ClienteDTOResponse;

public interface ClienteServicio {
	
	public void guardarCliente (ClienteDTORequest cliente);
	public void editarCliente (ClienteDTORequest cliente);
	
	public void eliminarCliente(Integer id);
	
	public List<ClienteDTOResponse> listarClientes();
	public ClienteDTOResponse obtenerClienteId(Integer id);

}