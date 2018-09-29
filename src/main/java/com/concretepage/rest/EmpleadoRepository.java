package com.concretepage.rest;

import java.util.HashMap;
import java.util.Map;

public class EmpleadoRepository {
	private static Map<String,Empleado> map = new HashMap<String,Empleado>();
	public EmpleadoRepository(){
		map.put("111", new Empleado(111, "Ram", "ABC"));
		map.put("222", new Empleado(222, "Shyam", "EFG"));
		map.put("333", new Empleado(333, "Mohan", "XYZ"));
	}
	public Empleado getEmpleadoById(String id){
		return map.get(id);
	}
	public  Map<String,Empleado> findAllEmpleado(){
		return map;
	}
}
