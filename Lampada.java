package projLampada;

public class Lampada {
	
	private int estado;
	
	public void acende(){
		estado = 1;
	}

	public void apaga(){
		estado = 0;
	}
	
	public void mostraEstado(){
		if(estado == 1)
			System.out.println("Acesa");
		else
			System.out.println("Apagada");
	}
	
}
