package practica6;


public class Coche {
	String matricula; 
	String combustible;
	String modelo;
	String fabricante;

	public Coche() { 
		matricula = ""; 
		combustible = "";
		modelo = "";
		fabricante = "";
	}

	public Coche(String matricula, String combustible, String modelo, String fabricante) {
		
		this.matricula = matricula;
		this.combustible = combustible; 
		this.modelo = modelo;
		this.fabricante = fabricante;
	} 

	public String muestraCoche() {
		String resultado = "";
		String cocheMatricula = "El coche con matricula " + matricula + " ";
		if (combustible == "Gasolina") {
			resultado += cocheMatricula; 
			resultado += GastoCocheGasolina(modelo, fabricante);
		} else if (combustible == "Diesel") {
			resultado += cocheMatricula;
			resultado += GastoCocheDiesel(modelo, fabricante);
		} else if (combustible == "Híbrido") {
			resultado += cocheMatricula;
			resultado += GastoCocheHibrido(modelo, fabricante);
		} else {
			resultado += cocheMatricula;
			resultado += "no dispone de información";
		}
		return resultado;
	}

	private String GastoCocheHibrido(String modelo, String fabricante) {
		String gastoDeCombustible = "es un "+modelo+" "+fabricante+" y no necesita combustible.";
		return gastoDeCombustible;
		
		
	}

	private String GastoCocheDiesel(String modelo, String fabricante) {
		String gastoDeCombustible = "es un "+modelo+" "+fabricante+" y gasta 1,052 euros por litro.";
		return gastoDeCombustible;
		
	}

	private String GastoCocheGasolina(String modelo, String fabricante) {
		String gastoDeCombustible = "es un "+modelo+" "+fabricante+" y gasta 1,337 euros por litro.";
		return gastoDeCombustible;
	}
}
