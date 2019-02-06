

/// No sirv de nada, solo para guardar el sha512
/*
import org.apache.commons.codec.digest.DigestUtils;

public class Usuario {

	private String nombre;
	private String 	password;
	private String cuit; ///cuit = id usuario????
	private int id_Usuario;
	
	
	
	public Usuario(){
		
		
		
	};
	
	public boolean login(String pass){
		
		if (DigestUtils.sha512Hex(pass)==password){
			return true;
		}
		return false;
	}
	
	public String getNombre() {
		return nombre;
	
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getPassword() {
		return password;
	}
	
	
	public void setPassword(String password) {
		String digesto = (String) DigestUtils.sha512Hex(password);
		this.password = digesto;
	}
	
	public String getCuit() {
		return cuit;
	}
	
	
	public void setCuit(String cuit) {
		
		this.cuit = cuit;
	}
	
}
*/