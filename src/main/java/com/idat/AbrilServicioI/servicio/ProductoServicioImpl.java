package com.idat.AbrilServicioI.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.AbrilServicioI.dto.ProductoDTORequest;
import com.idat.AbrilServicioI.dto.ProductoDTOResponse;
import com.idat.AbrilServicioI.model.Productos;
import com.idat.AbrilServicioI.repositorio.ProductoRepositorio;

@Service
public class ProductoServicioImpl implements ProductoServicio {
	
	@Autowired
	public ProductoRepositorio repositorio;

	@Override
	public void guardarProducto(ProductoDTORequest producto) {
		// TODO Auto-generated method stub
		Productos p = new Productos();
		p.setDescripcion(producto.getDescripcionDTO());
		p.setIdProducto(producto.getIdProductoDTO());
		p.setNombreProducto(producto.getNombreProductoDTO());
		p.setPrecio(producto.getPrecioDTO());
		p.setStock(producto.getStockDTO());
		repositorio.save(p);
	}

	@Override
	public void editarProducto(ProductoDTORequest producto) {
		// TODO Auto-generated method stub
		Productos p = new Productos();
		p.setDescripcion(producto.getDescripcionDTO());
		p.setIdProducto(producto.getIdProductoDTO());
		p.setNombreProducto(producto.getNombreProductoDTO());
		p.setPrecio(producto.getPrecioDTO());
		p.setStock(producto.getStockDTO());
		repositorio.saveAndFlush(p);
	}

	@Override
	public void eliminarProducto(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public List<ProductoDTOResponse> listarProductos() {
		// TODO Auto-generated method stub
		List <ProductoDTOResponse> lista = new ArrayList<ProductoDTOResponse>();
		ProductoDTOResponse p = null;
		
		for (Productos productos : repositorio.findAll()) {
			p.setDescripcion(producto.getDescripcionDTO());
			p.setIdProducto(producto.getIdProductoDTO());
			p.setNombreProducto(producto.getNombreProductoDTO());
			p.setPrecio(producto.getPrecioDTO());
			p.setStock(producto.getStockDTO());
			
			lista.add(p);
		}
		return lista;
	}

	@Override
	public Productos obtenerProductoId(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

}
