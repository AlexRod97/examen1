/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen1.impl;
import gt.edu.url.examen1.api.FabricaRanger;
/**
 *
 * @author Alexrod97
 */
public class Monstruo implements FabricaRanger {
	
	private String nombre; 
	private String elemento; 
	private int edad; 
	private String color; 
	
	public String getElemento() {
		return elemento;
	}	
	public void setElemento(String element) {
		this.elemento = element; 
	}
	
	public int getEdad() {
		return edad; 
	}
	
	public void setEdad(int age) {
		this.edad = age; 
	}
	
	public String getColor() {
		return color; 
	}
	
	public void setColor(String colorN) {
		this.color = colorN;
	}
	
	public void agigantarse () {
		System.out.println("Soy " + nombre + "y me estoy agigantando");
	}
	
	public void caminarLento() {
		System.out.println("Soy " + nombre + " un monstruo y estoy caminando lento");
	}
	
	public void golpear() {
		System.out.println("Soy " + nombre + " monstruo y estoy golpeando");
	}
	@Override
	public void hacerAlgo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean apilar(Monstruo monstruo) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean desapilar(Monstruo monstruo) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean encolar(Monstruo monstruo) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean desencolar(Monstruo monstruo) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Monstruo fabricar(String elemento) {
		// TODO Auto-generated method stub
		return null;
	}

    
}
