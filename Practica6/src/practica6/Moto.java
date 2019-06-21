package practica6;
/**
 * 
 * @author PABLO
 * @version v2
 */
public class Moto {
	
	/**
	 * String matricula
	 * Contiene la matrícula del objeto moto.
	 */
	String matricula;
	/**
	 * int cilindrada
	 * Contiene el cubicaje del objeto moto.
	 */
	int cilindrada;
	
	/**
	 * Constructor por defecto Moto.
	 * Cuando no se le asigna ningún valor a los atributos que contiene.
	 * Define los atributos del objeto moto anteriormente descritos.
	 */
	public Moto() { 
		matricula = "";
		cilindrada = 0;
	}
	 
	/**
	 * Constructor por parámetros Moto.
	 * Sus parámetros dan valor a los atributos matricula, cilindrada.
	 * @param matricula
	 * @param cilindrada
	 */
	public Moto(String matricula, int cilindrada) {
		this.matricula = matricula;
		this.cilindrada = cilindrada;
	}
	/**
	 * Método getMatricula.
	 * Obtiene el valor del atributo matrícula
	 * @return
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * Método getCilindrada.
	 * Obtiene el valor del atributo cilindrada
	 * @return
	 */
	public int getCilindrada() {
		return cilindrada;
	}
	
	/**
	 * Método setMatricula.
	 * Cambia el valor del atriculo matricula.
	 * @param matricula
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/**
	 * Método setCilindrada
	 * Cambia el valor del atributo cilindrada.
	 * @param cilindrada
	 */
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
}
