package com.example.Examen.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.Examen.dao.Operaciones;
import com.example.Examen.entity.OrdenPais;

@Component
public class OrdenPaisDaoImpl implements Operaciones<OrdenPais>{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<OrdenPais> readAll() {
		String query = "SELECT o.OrderID, o.ShipCountry FROM orders o JOIN customers c ON o.CustomerID = c.CustomerID;";
		// TODO Auto-generated method stub
		return jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(OrdenPais.class));
	}
	
}
