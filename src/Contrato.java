import java.sql.Date;
import java.util.ArrayList;


public class Contrato {

	ContratoCompra
	
	
	private Persona duenio;
	private Persona arrendatario;
	
	private int id_Contrato;
	private ArrayList<Pago> pagos;
	private Date fEmision;
	private Date fFin; /// cantidad meses?
	private int fPagoXMes; /// Preguntar como se debe hacer
	
	private String datosDeInteres;
	
	
	/// Realizar distintos constructores en base a cada contrato que quiera crear, con respecto a los pagos, si son uniformes o como
	public Contrato(Usuario arrendatario, int id_Contrato, String tipoPago, ArrayList<Pago> pagos, Date fEmision, Date fFin, int fPagoXMes, String duenio, Campo campo){
		
		
		this.arrendatario=arrendatario;
		this.duenio=duenio;
		this.id_Contrato=id_Contrato;
		this.pagos=pagos;
		this.fPagoXMes=fPagoXMes;
		this.fFin=fFin;
		this.fEmision=fEmision;
		this.campo=campo;
		
	}
	
	public void addFactura() {
		
		
	}
	
	public ArrayL
	
	public String getDuenio() {
		return duenio;
	}

	public void setDuenio(String duenio) {
		this.duenio = duenio;
	}

	public Date getfEmision() {
		return fEmision;
	}

	public void setfEmision(Date fEmision) {
		this.fEmision = fEmision;
	}

	public Date getfFin() {
		return fFin;
	}

	public void setfFin(Date fFin) {
		this.fFin = fFin;
	}

	public int getfPagoXMes() {
		return fPagoXMes;
	}

	public void setfPagoXMes(int fPagoXMes) {
		this.fPagoXMes = fPagoXMes;
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
