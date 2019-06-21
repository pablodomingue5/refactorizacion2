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
		if (combustible == "Gasolina") {
			resultado += "El coche con matricula " + matricula + " "; 
			resultado += GastoCocheGasolina(modelo, fabricante);
		} else if (combustible == "Diesel") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += GastoCocheDiesel(modelo, fabricante);
		} else if (combustible == "Híbrido") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += GastoCocheHibrido(modelo, fabricante);
		} else {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += "no dispone de información";
		}
		return resultado;
	}
}
