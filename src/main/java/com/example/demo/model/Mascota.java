package com.example.demo.model;

public class Mascota {

	private int numChip;
	private String nombre;
	private boolean vacunacion;
	
	public int getNumChip() {
		return numChip;
	}
	public void setNumChip(int numChip) {
		this.numChip = numChip;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isVacunacion() {
		return vacunacion;
	}
	public void setVacunacion(boolean vacunacion) {
		this.vacunacion = vacunacion;
	}
	
	@Override
	public String toString() {
		return "Mascota [numChip=" + numChip + ", nombre=" + nombre + ", vacuna=" + vacunacion + "]";
	}
	
}
