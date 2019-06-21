package practica6;

public class Moto {
	String matricula;
	int cilindrada;
	
	
	 
	public Moto(String matricula, int cilindrada) {
		this.matricula = matricula;
		this.cilindrada = cilindrada;
	}

	public String getMatricula() {
		return matricula;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
}
