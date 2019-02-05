import java.sql.Date;


public class Trabajo {

	private Factura factura;
	private Empresa empleado; ///En el modelo deberia ser una empresa o un usuario.
	private Usuario empleador;
	private Date fecha;
	private String direccion; /// Direccion o campo?????
	private double total;
	//private ArrayList<Pago> pagos;
	private int id_Trabajo;
	
	public Trabajo(){};
	
    public Trabajo(Factura factura, Empresa empleado, Usuario empleador, double total, double pagado, int id_Trabajo, Date fecha, String direccion) {
		this.factura=factura;
		this.empleado=empleado;
		this.empleador=empleador;
		this.total=total;
		this.pagado=pagado;
		this.id_Trabajo=id_Trabajo;
		this.fecha=fecha;
    	this.direccion=direccion;
		// TODO Auto-generated constructor stub
	}
	
	public Factura getFactura() {
		return factura;
	}
	
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	
	public Usuario getEmpleado() {
		return empleado;
	}
	
	public void setEmpleado(Empresa empleado) {
		this.empleado = empleado;
	}
	
	public Usuario getEmpleador() {
		return empleador;
	}
	
	public void setEmpleador(Usuario empleador) {
		this.empleador = empleador;
	}
	
	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	
	public int getId_Trabajo() {
		return id_Trabajo;
	}
	
	public void setId_Trabajo(int id_Trabajo) {
		this.id_Trabajo = id_Trabajo;
	}
	
	
	/*public double getCobrado() {
		
		
	}*/
	
}
