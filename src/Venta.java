import java.util.ArrayList;


public class Venta {

	private Usuario vendedor;
	private Usuario comprador;
	private ArrayList<Producto> productos;
	private ArrayList<Double> precios; ///DUDOSO
	private int id_Venta;
	
	public Venta(){};
	
	public Venta(Usuario vendedor, Usuario comprador, int id_Venta){
		this.vendedor=vendedor;
		this.comprador=comprador;
		this.id_Venta=id_Venta;
		
		
	}
    public Venta(Usuario vendedor, Usuario comprador, int id_Venta, ArrayList<Producto> productos, ArrayList<Double> precios){
    	this.vendedor=vendedor;
		this.comprador=comprador;
		this.id_Venta=id_Venta;
		this.productos=productos;
		this.precios=precios;
		
	}

	
	
	public Usuario getVendedor() {
		return vendedor;
	}
	
	public void setVendedor(Usuario vendedor) {
		this.vendedor = vendedor;
	}
	
	public Usuario getComprador() {
		return comprador;
	}
	
	public void setComprador(Usuario comprador) {
		this.comprador = comprador;
	}
	
	public int getId_Venta() {
		return id_Venta;
	}
	
	public void setId_Venta(int id_Venta) {
		this.id_Venta = id_Venta;
	}
	
	
}
