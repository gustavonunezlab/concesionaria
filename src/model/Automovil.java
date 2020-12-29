/**
 * Automóvil.
 * 
 * @author Gustavo Marcelo Nuñez.
 */

package model;

public class Automovil extends Vehiculo {

	private int cantidadPuertas;

	public Automovil(String marca, String modelo, double precio, int cantidadPuertas) {
		super(marca, modelo, precio);
		this.cantidadPuertas = cantidadPuertas;			
	}

	public int getCantidadPuertas() {
		return cantidadPuertas;
	}

	public void setCantidadPuertas(int cantidadPuertas) {
		this.cantidadPuertas = cantidadPuertas;
	}

	@Override
	public String toString() {
		return "Marca: " + getMarca() + " // Modelo: " + getModelo() + 
				" // Puertas: "+ cantidadPuertas + " // Precio: ";
	}
	
	
}
