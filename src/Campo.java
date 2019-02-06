import java.util.ArrayList;


public class Campo {

<<<<<<< HEAD
	private String direccion;
	private int tamano;
=======
	private Persona duenio;	
	private String descripcion;
>>>>>>> parent of ee1e6a0... Revert "Trabajo 05/02/18"
	private ArrayList<Lote> lotes;
	private int id_Campo;

	///Ver
	private Contrato contratoActual;
	
	public String getdescripcion() {
		return descripcion;
	}
	
	public void setdescripcion(String descripcion) {
		this.descripcion = descripcion;
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
