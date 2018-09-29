package com.concretepage.rest;

public class Empleado {
	private Integer id;
	private String nombre;
	private String empresa;
	public Empleado(Integer id, String nombre, String empresa){
		this.id =id;
		this.nombre = nombre;
		this.empresa = empresa;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
}
