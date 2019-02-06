import java.sql.Date;


public 	class Producto {

	private Date fingreso; ///fecha cosecha
	private String tipo; /// 
	private int cantidad;
<<<<<<< HEAD
	private String direccion;
=======
	private String descripcion;
	
>>>>>>> parent of ee1e6a0... Revert "Trabajo 05/02/18"
	private int id_Producto;
	
	public Producto(){};
		
	public Producto(int id_Producto, String direccion, int cantidad, String tipo, Date fingreso){
		this.tipo = tipo;
		this.direccion=direccion;
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
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	public int getId_Producto() {
		return id_Producto;
	}
	
	public void setId_Producto(int id_Producto) {
		
		this.id_Producto = id_Producto;
	}
	
}
