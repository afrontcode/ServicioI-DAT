package com.idat.AbrilServicioI.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.idat.AbrilServicioI.dto.UsurioRequestDTO;
import com.idat.AbrilServicioI.dto.UsurioResponseDTO;
import com.idat.AbrilServicioI.seguridad.JwtUtil;
import com.idat.AbrilServicioI.seguridad.UserDetailService;

@RestController
public class UsuarioControlador {

	@Autowired
	private JwtUtil util;
	
	@Autowired
	private UserDetailService service;

	@RequestMapping(path="/crearToken", method = RequestMethod.POST)
	public ResponseEntity<?> crearToken(@RequestBody UsurioRequestDTO dto){
		UserDetails detail = service.loadUserByUsername(dto.getUsuario());
		return ResponseEntity.ok(new UsurioResponseDTO(util.generateToken(detail.getUsername())));
	}
}
