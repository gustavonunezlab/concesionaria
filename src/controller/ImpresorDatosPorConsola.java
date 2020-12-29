/*
 * Clase encargada de los métodos de impresión de datos por consola.
 * 
 * @author Gustavo Marcelo Nuñez.
 */

package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Vehiculo;

public class ImpresorDatosPorConsola {
	
	private List<Vehiculo> listaVehiculos;

	public ImpresorDatosPorConsola(List<Vehiculo> vehiculos) {
		this.listaVehiculos = vehiculos;
	}

	public List<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}

	public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}

	/*
	 * Imprime el vehículo más caro de la lista.
	 */
	public void imprimirVehiculoMasCaro() {
		
			int indice = 0;
			double precio = this.listaVehiculos.get(0).getPrecio();
			
			for (int i = 0; i < this.listaVehiculos.size(); i++) {
				if(this.listaVehiculos.get(i).getPrecio() > precio) {
					precio = this.listaVehiculos.get(i).getPrecio();
					indice = i;
				}			
			}	
			System.out.println("Vehículo más caro: " + this.listaVehiculos.get(indice).getMarca() + " " + this.listaVehiculos.get(indice).getModelo());
		}
	
	/*
	 * Imprime el vehículo más barato de la lista.
	 */
	public void imprimirVehiculoMasBarato() {
		int indice = 0;
		double precio = this.listaVehiculos.get(0).getPrecio();
		
		for (int i = 0; i < this.listaVehiculos.size(); i++) {
			if(this.listaVehiculos.get(i).getPrecio() < precio) {
				precio = this.listaVehiculos.get(i).getPrecio();
				indice = i;
			}			
		}	
		System.out.println("Vehículo más barato: " + this.listaVehiculos.get(indice).getMarca() + " " + this.listaVehiculos.get(indice).getModelo());
	}
	
	/*
	 * Imprime aquellos vehículos que contengan en su atributo "modelo" el caracter especificado.
	 * 
	 * @param caracter Caracter por el cual se realiza la comparación y se genera la nueva lista.
	 */
	public void imprimirVehiculoQueContenga(String caracter) {
		List<Vehiculo> vehiculosContains = new ArrayList<Vehiculo>();
		
		for (int i = 0; i < this.listaVehiculos.size(); i++) {
			if(this.listaVehiculos.get(i).getModelo().contains(caracter)) {			
				vehiculosContains.add(this.listaVehiculos.get(i));
			}			
		}
		
		for (Vehiculo vehiculo : vehiculosContains) {
			
			System.out.printf("Vehículo que contiene en el modelo la letra ‘" + caracter + "’: "+ vehiculo.getMarca() 
			+ " " + vehiculo.getModelo() + " $%.2f%n", vehiculo.getPrecio());
			
		}
		
	}

	/*
	 * Imprime una lista de vehículos ordenada por precio de mayor a menor.
	 */

	public void imprimirVehiculosPorPrecioDescendente() {
	
		Collections.sort(listaVehiculos, new Comparator<Vehiculo>() {

			public int compare(Vehiculo v1, Vehiculo v2) {
				return new Double(v2.getPrecio()).compareTo(new Double(v1.getPrecio()));
			}

		});
		
		for (Vehiculo vehiculo : listaVehiculos) {
			System.out.printf(vehiculo.getMarca() + " " + vehiculo.getModelo() + "\n");
		}
		
	}
}

	

