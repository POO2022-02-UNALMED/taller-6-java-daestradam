package vehiculos;

import java.util.ArrayList;

public class Vehiculo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static int cantidadVehiculos=0;
	public static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	public static ArrayList<Integer> cantFabricantes = new ArrayList<Integer>();
	public static ArrayList<Pais> paises = new ArrayList<Pais>();
	public static ArrayList<Integer> cantPaises = new ArrayList<Integer>();
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa=placa;
		this.puertas=puertas;
		this.velocidadMaxima=velocidadMaxima;
		this.nombre=nombre;
		this.precio=precio;
		this.peso=peso;
		this.traccion=traccion;
		this.fabricante=fabricante;
		cantidadVehiculos++;
		
		if(fabricantes.contains(fabricante)) {
			cantFabricantes.set(fabricantes.indexOf(fabricante), cantFabricantes.get(fabricantes.indexOf(fabricante))+1);
		}else {
			fabricantes.add(fabricante);
			cantFabricantes.add(1);
		}
		
		if(paises.contains(fabricante.getPais())) {
			cantPaises.set(paises.indexOf(fabricante.getPais()), cantPaises.get(paises.indexOf(fabricante.getPais()))+1);
		}else {
			paises.add(fabricante.getPais());
			cantPaises.add(1);
		}
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getTraccion() {
		return traccion;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}

	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.cantidadVehiculos = cantidadVehiculos;
	}
	
	public static String vehiculosPorTipo() {
		return "Automoviles: " + Automovil.getCantidadAutomoviles()
				+ "\nCamionetas: " + Camioneta.getCantidadCamionetas()
				+ "\nCamiones: " + Camion.getCantidadCamiones();
	}
}
