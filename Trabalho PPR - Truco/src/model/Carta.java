package model;

public class Carta {
	
	private String naipe; 
	private String numero; 
	private int hierarquia; 
	
	public Carta(String naipe, String numero, int hierarquia) {
		this.naipe = naipe; 
		this.numero = numero; 
		this.hierarquia = hierarquia; 
	}

	public String getNaipe() {
		return naipe;
	}

	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getHierarquia() {
		return hierarquia;
	}

	public void setHierarquia(int hierarquia) {
		this.hierarquia = hierarquia;
	}
	
	

}
