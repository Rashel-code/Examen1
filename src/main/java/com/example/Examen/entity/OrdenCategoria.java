package com.example.Examen.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdenCategoria implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int ProductID;
	private int CategoryID;
	private String QuentityPerUnit;
	
	public OrdenCategoria() {
		super();
	}
	public OrdenCategoria(int productID, int categoryID, String quentityPerUnit) {
		super();
		ProductID = productID;
		CategoryID = categoryID;
		QuentityPerUnit = quentityPerUnit;
	}
	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int productID) {
		ProductID = productID;
	}
	public int getCategoryID() {
		return CategoryID;
	}
	public void setCategoryID(int categoryID) {
		CategoryID = categoryID;
	}
	public String getQuentityPerUnit() {
		return QuentityPerUnit;
	}
	public void setQuentityPerUnit(String quentityPerUnit) {
		QuentityPerUnit = quentityPerUnit;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
