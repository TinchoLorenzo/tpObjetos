import java.sql.Date;
import java.util.ArrayList;


public class Contrato {

	private Usuario arrendatario;
	private int id_Contrato;
	private String tipoPago;
	private Campo campo;
	private ArrayList<Factura> facturas;
	private Date fEmision;
	private Date fFin;
	private int fPagoXMes; /// Preguntar como se debe hacer
	
	
	public Contrato() {
		// TODO Auto-generated constructor stub
		arrendador=null;
		arrendatario=null;
	}

	public Contrato(Usuario arrendador, Usuario arrendatario, int id_Contrato, String tipoPago, ArrayList<Factura> facturas){
		this.arrendador=arrendador;
		this.arrendatario=arrendatario;
		this.id_Contrato=id_Contrato;
		this.tipoPago=tipoPago;
		this.facturas=facturas;
		
	}
	
	public Usuario getArrendador() {
		return arrendador;
	}
	
	public void setArrendador(Usuario arrendador) {
		this.arrendador = arrendador;
	}
	
	public Usuario getArrendatario() {
		return arrendatario;
	}
	
	public void setArrendatario(Usuario arrendatario) {
		this.arrendatario = arrendatario;
	}
	
	public int getId_Contrato() {
		return id_Contrato;
	}
	
	public void setId_Contrato(int id_Contrato) {
		this.id_Contrato = id_Contrato;
	}
	
	public String getTipoPago() {
		return tipoPago;
	}
	
	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}
	
	
	
	
}
