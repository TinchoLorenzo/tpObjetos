import java.sql.Date;


public 	class Producto {

	private Date fingreso; ///fecha cosecha
	private String tipo; /// 
	private int cantidad;
	private String descripcion;
	
	private int id_Producto;
	
	public Producto(){};
		
	public Producto(int id_Producto, String descripcion, int cantidad, String tipo, Date fingreso){
		this.tipo = tipo;
		this.descripcion=descripcion;
		this.id_Producto=id_Producto;
		this.cantidad=cantidad;
		this.fingreso = fingreso;
	}
	
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public String getdescripcion() {
		return descripcion;
	}
	
	public void setdescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	public int getId_Producto() {
		return id_Producto;
	}
	
	public void setId_Producto(int id_Producto) {
		
		this.id_Producto = id_Producto;
	}
	
}
