import java.sql.Connection;

import GUI.Graphicss;
import connectorDB.DBConnector;


public class hola {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Connection coneccion = DBConnector.dbConnector();
			if (coneccion == null)
				System.out.println("Fallo");
			else
				System.out.println("REPIOLANERI");
			//Graphicss.main(null);
			
	}

}
