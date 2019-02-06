import java.sql.Date;


public class Factura {

	private Persona emisor;
	private Persona destinatario;
	private double cantidad;
	private TipoPago tipoPago;
	private Date femision;
	private Date finicio; /// Date ? String ? DIA MES AÑO ?	
	private Date ffin;
	private Date fvto;
	private String CAE; // PK
	private String rutaFactura;
	
	public Factura() {
		// TODO Auto-generated constructor stub
	}
	
	public Factura(Persona emisor, Persona destinatario, double cantidad, TipoPago tipoPago, Date femision, Date finicio, Date ffin, Date fvto, String CAE, String rutaFactura){
		this.emisor=emisor;
		this.destinatario=destinatario;
		this.cantidad=cantidad;
		this.tipoPago=tipoPago;
		this.femision=femision;
		this.finicio=finicio;
		this.ffin=ffin;
		this.fvto=fvto;
		this.CAE=CAE;
		this.rutaFactura=rutaFactura;
	}
	
	public Persona getEmisor() {
		return emisor;
	}
	
	public void setEmisor(Persona emisor) {
		this.emisor = emisor;
	}
	
	public Persona getDestinatario() {
		return destinatario;
	}
	
	public String getTipoPago(){
		return tipoPago;
	}
	
	public void setTipoPago(TipoPago tipopago){
		this.tipoPago=tipopago;
	}
	public void setDestinatario(Persona destinatario) {
		this.destinatario = destinatario;
	}
	
	public double getcantidad() {
		return cantidad;
	}
	
	public void setcantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public Date getFemision() {
		return femision;
	}
	
	public void setFemision(Date femision) {
		this.femision = femision;
	}
	
	public Date getFinicio() {
		return finicio;
	}
	
	public void setFinicio(Date finicio) {
		this.finicio = finicio;
	}
	
	public Date getFfin() {
		return ffin;
	}
	
	public void setFfin(Date ffin) {
		this.ffin = ffin;
	}
	
	public Date getFvto() {
		return fvto;
	}
	
	public void setFvto(Date fvto) {
		this.fvto = fvto;
	}
	
	public String getCAE() {
		return CAE;
	}
	
	public void setCAE(String cAE) {
		CAE = cAE;
	}
	
	public String getRutaFactura() {
		return rutaFactura;
	}
	
	public void setRutaFactura(String rutaFactura) {
		this.rutaFactura = rutaFactura;
	}
	
	
}
