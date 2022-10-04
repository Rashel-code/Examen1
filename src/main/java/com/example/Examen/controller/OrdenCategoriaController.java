package com.example.Examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Examen.entity.OrdenCategoria;
import com.example.Examen.entity.OrdenPais;
import com.example.Examen.service.OrdenCategoriaService;

@RestController
@RequestMapping("/api/OrdenCat")
@CrossOrigin
public class OrdenCategoriaController {

	@Autowired
	private OrdenCategoriaService ordenCategoriaService;
	
	@GetMapping("/all")
	public List<OrdenCategoria> listarPais() {
		return ordenCategoriaService.readAll();
	};
	
}
