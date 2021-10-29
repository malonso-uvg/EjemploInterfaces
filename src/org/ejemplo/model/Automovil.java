/**
 * 
 */
package org.ejemplo.model;

/**
 * @author moises.alonso
 *
 */
public class Automovil implements Comparable{
	
	private String marca;
	private int kilometraje;

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getKilometraje() {
		return kilometraje;
	}
	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}
	
	@Override
	public String toString() {
		return "Marca: " + getMarca() + " Kilometraje: " + getKilometraje();
	}
	
	@Override
	public int compareTo(Object o) {
		Automovil autoAComparar = (Automovil)o;
		int value = 0;
		
		if (getKilometraje() > autoAComparar.getKilometraje()) {
			value = 1;
		} else if (getKilometraje() < autoAComparar.getKilometraje()) {
			value = -1;
		} 
		
		return value;
	}
	
	

}
