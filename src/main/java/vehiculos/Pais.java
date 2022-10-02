package vehiculos;

import java.util.Collections;

public class Pais {
	private String nombre;
	
	public Pais(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static Pais paisMasVendedor() {
		int max = Collections.max(Vehiculo.cantPaises);
		return Vehiculo.paises.get(Vehiculo.cantPaises.indexOf(max));
	}
}
