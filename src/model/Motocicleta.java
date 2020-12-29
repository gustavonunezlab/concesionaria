/**
 * Motocicleta.
 * 
 * @author Gustavo Marcelo Nuñez.
 */

package model;

public class Motocicleta extends Vehiculo{
	
	private int cilindrada;

	public Motocicleta(String marca, String modelo, double precio, int cilindrada) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	@Override
	public String toString() {
		return "Marca: " + getMarca() + " // Modelo: " + getModelo() + 
				" // Cilindrada: "+ cilindrada + " // Precio: ";
	}

}
