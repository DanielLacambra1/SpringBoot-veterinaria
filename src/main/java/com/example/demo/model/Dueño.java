package com.example.demo.model;

public class Dueño {

	private String nombre;
	private int dni;
	private Mascota mascota;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public Mascota getMascota() {
		return mascota;
	}
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}
	
	@Override
	public String toString() {
		return "Dueño [nombre=" + nombre + ", dni=" + dni + ", ChipMascota=" + mascota.getNumChip() + 
			", NombreMascota=" + mascota.getNombre() + ", VacunaMascota=" + mascota.isVacunacion() + "]";
	}
	
}
