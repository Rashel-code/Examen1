package com.example.Examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Examen.entity.OrdenPais;
import com.example.Examen.service.OrdenPaisService;



@RestController
@RequestMapping("/api/OrdenPais")
@CrossOrigin
public class OrdenPaisController {

	
	@Autowired
	private OrdenPaisService ordenPaisService;
	
	@GetMapping("/all")
	public List<OrdenPais> listarPais() {
		return ordenPaisService.readAll();
	};
}
 