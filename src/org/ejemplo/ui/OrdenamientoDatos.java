/**
 * 
 */
package org.ejemplo.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.ejemplo.model.Automovil;

/**
 * @author moises.alonso
 *
 */
public class OrdenamientoDatos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String opt = "";
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> listadoNumeros = new ArrayList<Integer>();
		ArrayList<Automovil> listadoAutos = new ArrayList<Automovil>();
		
		/*
		do {
			
			System.out.println("¿Desea ingresar un valor? Y / N");
			opt = in.nextLine();
			
			if (!opt.toUpperCase().equals("N")) {
				System.out.println("Ingrese un número entero");
				Integer value = Integer.parseInt(in.nextLine());
				listadoNumeros.add(value);
			}
			
		}while (!opt.toUpperCase().equals("N"));
		
		System.out.println("Los números ordenados son: ");
		Collections.sort(listadoNumeros);
		
		for (int i = 0; i < listadoNumeros.size(); i++) {
			System.out.println("[ " + i + " ] => " + listadoNumeros.get(i));
		}
		*/
		
		//Logica para los automoviles
		do {
			
			System.out.println("¿Desea ingresar un automovil? Y / N");
			opt = in.nextLine();
			
			if (!opt.toUpperCase().equals("N")) {
				Automovil miAuto = new Automovil();
				System.out.println("Ingrese la Marca");
				miAuto.setMarca(in.nextLine());
				
				System.out.println("Ingrese el kilometraje");
				miAuto.setKilometraje(Integer.parseInt(in.nextLine()));
				
				listadoAutos.add(miAuto);
			}
			
		}while (!opt.toUpperCase().equals("N"));
		
		System.out.println("Los automoviles ordenados son: ");
		Collections.sort(listadoAutos);
		
		for (int i = 0; i < listadoAutos.size(); i++) {
			System.out.println("[ " + i + " ] => " + listadoAutos.get(i).toString());
		}
		
	}

}
