import java.sql.Date;


public class Maquina {

	private int id_Maquina;
	private String nombre;
	private String tipo;
	private Date fcompra;
	private int cantidad;
	
	public Maquina(){};
	
	public Maquina(int id_Maquina, String nombre, String tipo, Date fcompra, int cantidad){
		
		this.id_Maquina=id_Maquina;
		this.nombre=nombre;
		this.tipo=tipo;
		this.fcompra=fcompra;
		this.cantidad=cantidad;
		
	}
	
	public int getId_Maquina() {
		return id_Maquina;
	}
	
	public void setId_Maquina(int id_Maquina) {
		this.id_Maquina = id_Maquina;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Date getFcompra() {
		return fcompra;
	}
	
	public void setFcompra(Date fcompra) {
		this.fcompra = fcompra;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
