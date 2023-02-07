package com.example.demo.model;

public class Dueno {

	private String nombre;
	private int dni;
	private Mascota mascota;

	public String mascotaDescompuesta;

	
	
	public Dueno(String nombre, int dni, Mascota mascota) {
		this.nombre = nombre;
		this.dni = dni;
		this.mascota = mascota;
	}

	public Dueno(String nombre, int dni, String mascotaDescompuesta) {
		this.nombre = nombre;
		this.dni = dni;
		this.mascotaDescompuesta = mascotaDescompuesta;
	}

	public Dueno(){
		
	}
	
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

	public String getMascotaDescompuesta() {
		return mascotaDescompuesta;
	}

	public void setMascotaDescompuesta(String mascotaDescompuesta) {
		this.mascotaDescompuesta = mascotaDescompuesta;
	}

	
	@Override
	public String toString() {
		return "Dueno [nombre=" + nombre + ", dni=" + dni + ", ChipMascota=" + mascota.getNumChip() + 
			", NombreMascota=" + mascota.getNombre() + ", VacunaMascota=" + mascota.isVacunacion() + "]";
	}
	
}
