package com.example.Examen.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OrdenPais implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int OrderID;
	private int CustomerID;
	private String Country;
	private String ShipCountry;
	public OrdenPais() {
		super();
	}
	public OrdenPais(int orderID, int customerID, String country, String shipCountry) {
		super();
		OrderID = orderID;
		CustomerID = customerID;
		Country = country;
		ShipCountry = shipCountry;
	}
	public int getOrderID() {
		return OrderID;
	}
	public void setOrderID(int orderID) {
		OrderID = orderID;
	}
	public int getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getShipCountry() {
		return ShipCountry;
	}
	public void setShipCountry(String shipCountry) {
		ShipCountry = shipCountry;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
}
