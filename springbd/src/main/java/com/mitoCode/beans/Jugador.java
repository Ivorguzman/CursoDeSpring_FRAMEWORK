package com.mitoCode.beans;

public class Jugador {
	private int id;
	private String nombre;
	private Equipo equipo;
	private Camiseta camiseta;



	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Equipo getEquipo() {
		return this.equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public Camiseta getCamiseta() {
		return this.camiseta;
	}

	public void setCamiseta(Camiseta camiseta) {
		this.camiseta = camiseta;
	}






}
