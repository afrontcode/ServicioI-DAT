package com.idat.AbrilServicioI.servicio;

import java.util.List;

import com.idat.AbrilServicioI.dto.ProductoDTORequest;
import com.idat.AbrilServicioI.dto.ProductoDTOResponse;
import com.idat.AbrilServicioI.model.Productos;

public interface ProductoServicio {
	public void guardarProducto(ProductoDTORequest producto);
	public void editarProducto(ProductoDTORequest producto);
	public void eliminarProducto(Integer id);
	public List<ProductoDTOResponse> listarProductos();
	public Productos obtenerProductoId(Integer id);
}
