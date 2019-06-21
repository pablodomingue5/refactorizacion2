package practica6;

/**
 * 
 * @author PABLO
 * @version v.2
 */
public class Coche {

	private static final Double DIESEL = 1.052;
	private static final Double GASOLINA = 1.052;
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
			resultado += cocheMatricula + GastoCocheGasolina(modelo, fabricante);
		} else if (combustible == "Diesel") {
			resultado +=cocheMatricula + GastoCocheDiesel(modelo, fabricante);
		} else if (combustible == "Híbrido") {
			resultado +=cocheMatricula + GastoCocheHibrido(modelo, fabricante);
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
		String gastoDeCombustible = "es un "+modelo+" "+fabricante+" y gasta "+DIESEL+""+" euros por litro.";
		return gastoDeCombustible;
		
	}

	private String GastoCocheGasolina(String modelo, String fabricante) {
		String gastoDeCombustible = "es un "+modelo+" "+fabricante+" y gasta "+GASOLINA+""+" euros por litro.";
		return gastoDeCombustible;
	}
}
