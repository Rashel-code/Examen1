package com.example.Examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Examen.dao.Operaciones;
import com.example.Examen.daoImpl.OrdenCategoriaDaoImpl;
import com.example.Examen.entity.OrdenCategoria;
@Service
public class OrdenCategoriaService implements Operaciones<OrdenCategoria>{

	
	@Autowired
	private OrdenCategoriaDaoImpl daoImpl;

	@Override
	public List<OrdenCategoria> readAll() {
		// TODO Auto-generated method stub
		return daoImpl.readAll();
	}
	
	
}
