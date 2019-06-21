package practica6;

public class Moto {
	String matricula;
	int cilindrada;
	
	
	 
	public Moto(String matricula, int cilindrada) {//Cambiamos las variables del constructor por otras mas significativas
		this.matricula = matricula;//Ponemos this. antes de las variables de la clase para que no de lugar a error.
		this.cilindrada = cilindrada;
	}

	public String getMatricula() {
		return matricula;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setMatricula(String matricula) {//Ponemos this. antes de la variable de la clase y cambiamos la string del set por una mas significativa
		this.matricula = matricula;
	}

	public void setCilindrada(int cilindrada) {//Ponemos this. antes de la variable de la clase y cambiamos el int del set por uno mas significativo
		this.cilindrada = cilindrada;
	}
}
