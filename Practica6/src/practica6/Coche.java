package practica6;

public class Coche {
	//Estos atributos necesitan getters y setters.
	String matricula; 
	String atrib;//Cambiamos el nombre del atributo atrib, que es poco explicativo, por Combustible que seria un atributo mucho mas coherente.
	String modelo;
	String fabricante;

	public Coche() { 
		matricula = ""; //Podemos poner 
		atrib = "";
		modelo = "";
		fabricante = "";
	}

	public Coche(String m, String c, String mo, String f) {// Cambiamos los atributos del constructor coche por otros más significativos.
		//Ponemos this. antes de las variables de la clase para no dar lugar a error.
		matricula = m;
		atrib = c; 
		modelo = mo;
		fabricante = f;
	} 

	public String metodo1() {//Los metodos son poco explicativos, le cambiamos el nombre por otro que ayude a entender mejor lo que hacen.
		String resultado = "";
		if (atrib == "Gasolina") {
			resultado += "El coche con matricula " + matricula + " "; //
			resultado += metodoA(modelo, fabricante);//Cambiamos el nombre del metodoA por GastoCocheGasolina
		} else if (atrib == "Diesel") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += metodoB(modelo, fabricante);//Cambiamos el nombre del metodoB por GastoCocheDiesel
		} else if (atrib == "Híbrido") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += metodoC(modelo, fabricante);//Cambiamos el nombre del metodoC por GastoCocheHibrido
		} else {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += "no dispone de información";
		}
		return resultado;
	}
}
