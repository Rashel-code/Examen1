package com.example.Examen.daoImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.Examen.dao.Operaciones;
import com.example.Examen.entity.OrdenCategoria;

@Component
public class OrdenCategoriaDaoImpl implements Operaciones<OrdenCategoria>{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<OrdenCategoria> readAll() {
		String query = "SELECT p.ProductID, p.ProductName, p.QuantityPerUnit, c.CategoryName FROM products p JOIN categories c ON p.CategoryID= c.CategoryID;";
		// TODO Auto-generated method stub
		return jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(OrdenCategoria.class));
	}
}
