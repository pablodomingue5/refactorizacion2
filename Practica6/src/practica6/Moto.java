package practica6;

public class Moto {
	String matricula;
	int cilindrada;
	
	public Moto() {//Esto solamente inicializa las variables, pero no tiene ninguna función por lo que podemos suprimirlo.
		matricula = "";
		cilindrada = 0; 
	}
	
	 
	public Moto(String m, int c) {//Cambiamos las variables del constructor por otras mas significativas
		matricula = m;//Ponemos this. antes de las variables de la clase para que no de lugar a error.
		cilindrada = c;
	}

	public String getMatricula() {
		return matricula;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setMatricula(String m) {//Ponemos this. antes de la variable de la clase y cambiamos la string del set por una mas significativa
		matricula = m;
	}

	public void setCilindrada(int c) {//Ponemos this. antes de la variable de la clase y cambiamos el int del set por uno mas significativo
		cilindrada = c;
	}
}
