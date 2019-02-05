import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
			Graphicss.main(null);

			// Preparamos la consulta 
			Statement s;
			try {
				s = coneccion.createStatement();
				ResultSet rs = s.executeQuery ("select * from Usuario");
				while (rs.next()) 
				{ 	
				    System.out.println (rs.getString (1) + " " + rs.getString (2)+ " " + rs.getInt(3) + " " + rs.getInt(4)); 
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//coneccion.close();

	}

}
