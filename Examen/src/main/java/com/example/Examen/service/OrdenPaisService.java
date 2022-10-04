package com.example.Examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Examen.dao.Operaciones;
import com.example.Examen.daoImpl.OrdenPaisDaoImpl;
import com.example.Examen.entity.OrdenPais;


@Service
public class OrdenPaisService  implements Operaciones<OrdenPais>{

	@Autowired
	private OrdenPaisDaoImpl daoImpl;

	@Override
	public List<OrdenPais> readAll() {
		// TODO Auto-generated method stub
		return daoImpl.readAll();
	}
	
}
