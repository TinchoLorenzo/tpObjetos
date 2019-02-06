import java.util.ArrayList;


public class Campo {

	private Persona duenio;
	private String direccion;
	private int tamano;
	private ArrayList<Lote> lotes;
	private String nombre;
	private int id_Campo;
	
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	public int getTamano() {
		return tamano;
	}
	
	
	public void setTamano(int tamano) {
		this.tamano = tamano;
	}
	
	public int getId_Campo() {
		return id_Campo;
	}
	
	
	public void setId_Campo(int id_Campo) {
		this.id_Campo = id_Campo;
	}
	
	public void addLote(Lote l){
		
		lotes.add(l);
	}
	
	public ArrayList<Lote> getLotes(){
		
		return this.lotes;
	}
	
	
}
