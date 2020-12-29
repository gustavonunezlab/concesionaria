package test;

import java.util.ArrayList;
import java.util.List;

import controller.ImpresorDatosPorConsola;
import model.Automovil;
import model.Motocicleta;
import model.Vehiculo;

public class Test {

	public static void main(String[] args) {
		
		List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
 
		Vehiculo peugeot206 = new Automovil("Peugeot", "206", 200000, 4);
		Vehiculo hondaTitan = new Motocicleta("Honda", "Titan", 60000, 125);
		Vehiculo peugeot208 = new Automovil("Peugeot", "208", 250000, 5);
		Vehiculo yamahaYbr = new Motocicleta("Yamaha", "YBR", 80500.5, 160);
		
		vehiculos.add(peugeot206);
		vehiculos.add(hondaTitan);
		vehiculos.add(peugeot208);
		vehiculos.add(yamahaYbr);
		
		ImpresorDatosPorConsola impresorDatosPorConsola = new ImpresorDatosPorConsola(vehiculos);
		
		for (Vehiculo vehiculo : vehiculos) {
			System.out.printf(vehiculo.toString() + "$%.2f%n", vehiculo.getPrecio());
		}
		
		System.out.println("=============================");
		
		impresorDatosPorConsola.imprimirVehiculoMasCaro();
		impresorDatosPorConsola.imprimirVehiculoMasBarato();
		impresorDatosPorConsola.imprimirVehiculoQueContenga("Y");
		
		System.out.println("=============================");
		
		impresorDatosPorConsola.imprimirVehiculosPorPrecioDescendente();

	}

}