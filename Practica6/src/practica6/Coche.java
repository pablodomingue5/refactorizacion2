package practica6;

/**
 * 
 * @author PABLO
 * @version v.2
 */
public class Coche {
	/**
	 * Constante Double DIESEL
	 * Contiene la constante del precio del Diesel por litro
	 */
	private static final Double DIESEL = 1.052;
	/**
	 * Constante Double GASOLINA
	 * 	Contiene el precio de la Gasolina por litro.
	 */
	private static final Double GASOLINA = 1.052;
	/**
	 * String matricula
	 * Atributo del objeto coche 
	 * Contiene la matr�cula de este.
	 */
	String matricula; 
	/**
	 * String combustible
	 * Atributo del objeto coche
	 * Contiene el tipo de combustible que utiliza.
	 */
	String combustible;
	/**
	 * String modelo
	 * Atributo del objeto coche
	 * Contiene el modelo del coche.
	 */
	String modelo;
	/**
	 * String fabricante
	 * Atributo del objeto coche
	 * Contiene la empresa que fabrica el coche.
	 */
	String fabricante;

	/**
	 * Constructor por defecto Coche
	 * Cuando no se le asigna ning�n valor a los atributos que contiene.
	 * Define los atributos del objeto coche anteriormente descritos.
	 */
	public Coche() { 
		matricula = ""; 
		combustible = "";
		modelo = "";
		fabricante = "";
	}
	/**
	 * 
	 * Constructor por par�metros Coche.
	 * Sus par�metros dan valor a los atributos matricula, combustible, modelo, fabricante.
	 * 
	 * @param matricula
	 * @param combustible
	 * @param modelo
	 * @param fabricante
	 */
	public Coche(String matricula, String combustible, String modelo, String fabricante) {
		
		this.matricula = matricula;
		this.combustible = combustible; 
		this.modelo = modelo;
		this.fabricante = fabricante;
	} 
	
	/**
	 * M�todo que muestra el atributo matr�cula del objeto coche seguido del modelo, el fabricante y lo que gasta por litro.
	 * Muestra uno o otro seg�n el atributo combustible que sea
	 * @return resultado
	 */
	public String muestraCoche() {
		String resultado = "";
		String cocheMatricula = "El coche con matricula " + matricula + " ";
		if (combustible == "Gasolina") {
			resultado += cocheMatricula + GastoCocheGasolina(modelo, fabricante);
		} else if (combustible == "Diesel") {
			resultado +=cocheMatricula + GastoCocheDiesel(modelo, fabricante);
		} else if (combustible == "H�brido") {
			resultado +=cocheMatricula + GastoCocheHibrido(modelo, fabricante);
		} else {
			resultado += cocheMatricula;
			resultado += "no dispone de informaci�n";
		}
		return resultado;
	}
	
	/**
	 * M�todo que devuelve la String gasto de combustible h�brido, recibiendo los par�metros modelo y fabricante.
	 *
	 * gastoDeCombustible devuelve =  "es un "+modelo+" "+fabricante+" y no necesita combustible.";
	 * @param modelo
	 * @param fabricante
	 * @return
	 */
	private String GastoCocheHibrido(String modelo, String fabricante) {
		String gastoDeCombustible = "es un "+modelo+" "+fabricante+" y no necesita combustible.";
		return gastoDeCombustible;
		
		
	}
	/**
	 * M�todo que devuelve la String gasto de combustible diesel, recibiendo los par�metros modelo y fabricante.
	 *
	 * gastoDeCombustible devuelve =  "es un "+modelo+" "+fabricante+" y no necesita combustible.";
	 * @param modelo
	 * @param fabricante
	 * @return
	 */
	private String GastoCocheDiesel(String modelo, String fabricante) {
		String gastoDeCombustible = "es un "+modelo+" "+fabricante+" y gasta "+DIESEL+""+" euros por litro.";
		return gastoDeCombustible;
		
	}
	/**
	 * M�todo que devuelve la String gasto de combustible gasolina, recibiendo los par�metros modelo y fabricante.
	 *
	 * gastoDeCombustible devuelve =  "es un "+modelo+" "+fabricante+" y no necesita combustible.";
	 * @param modelo
	 * @param fabricante
	 * @return
	 */
	private String GastoCocheGasolina(String modelo, String fabricante) {
		String gastoDeCombustible = "es un "+modelo+" "+fabricante+" y gasta "+GASOLINA+""+" euros por litro.";
		return gastoDeCombustible;
	}
}
