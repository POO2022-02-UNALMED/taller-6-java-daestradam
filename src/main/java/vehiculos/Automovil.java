package vehiculos;

public class Automovil extends Vehiculo {
	private int puestos;
	private static int cantidadAutomoviles=0;
	
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante){
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		cantidadAutomoviles++;
	}
	
	public int getPuestos() {
		return puestos;
	}
	
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

	public static int getCantidadAutomoviles() {
		return cantidadAutomoviles;
	}

	public static void setCantidadAutomoviles(int cantidadAutomoviles) {
		Automovil.cantidadAutomoviles = cantidadAutomoviles;
	}
}
