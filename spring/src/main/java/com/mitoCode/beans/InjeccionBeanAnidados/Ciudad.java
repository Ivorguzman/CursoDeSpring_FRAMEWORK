package com.mitoCode.beans.InjeccionBeanAnidados;

public class Ciudad {

	String miCiudad;

	public String getMiCiudad() {
		return this.miCiudad;
	}

	public void setMiCiudad(String miCiudad) {
		System.out.println("String miCiudad: (Injección de la dependencia) ==> " + miCiudad);

		this.miCiudad = miCiudad;
	}


}
