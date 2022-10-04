package com.example.Examen.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ordenes implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int orderID;
	private Date OrderDate;

	
	
	public Ordenes() {
		super();
	}
	public Ordenes(int orderID, Date orderDate) {
		super();
		this.orderID = orderID;
		OrderDate = orderDate;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public Date getOrderDate() {
		return OrderDate;
	}
	public void setOrderDate(Date orderDate) {
		OrderDate = orderDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
}
