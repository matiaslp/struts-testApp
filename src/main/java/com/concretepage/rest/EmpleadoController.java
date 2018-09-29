package com.concretepage.rest;
import java.util.Map;

import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;

import com.opensymphony.xwork2.ModelDriven;

public class EmpleadoController implements ModelDriven<Object>{
	private static final long serialVersionUID = 1L;
	private String id;
	private Object model;
	private EmpleadoRepository empladoRepository = new EmpleadoRepository();
	private static Map<String,Empleado> map;
	{
		map = empladoRepository.findAllEmpleado();
	}
	public HttpHeaders index() {
		model = map;
		return new DefaultHttpHeaders("index").disableCaching();
	}
	public String add(){
		Integer empId = Integer.parseInt(id);
		Empleado emp = new Empleado(empId,"Ramesh", "PQR");
		model = emp;
		return "SUCCESS";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		model = empladoRepository.getEmpleadoById(id);
		this.id = id;
	}
	@Override
	public Object getModel() {
		return model;
	}
}
