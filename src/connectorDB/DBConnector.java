package connectorDB;	

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import javax.swing.*;
import java.sql.DriverManager;

public class DBConnector {

	
	
 private Connection connection=null;
	

 	public DBConnector(){};
 

	public static Connection dbConnector(){
		
		try {
			Class.forName("org.sqlite.JDBC");
			String dbPath = "D:\\Facultad\\tpObjetos\\WindowsTpObjetos\\GestionCampo\\databaseSQLITE\\tpObjetos.db";
			Connection connection = DriverManager.getConnection("jdbc:sqlite:"+dbPath);
			
			if (false) {
			/// ESTO TIENE QUE IR EN OTRA CLASE CREO QUE SE LLAMARIA INICIALIZADOR DE BASE DE DATOS O ALGO ASI
			
			/// HAY QUE MODIFICARLO PARA DETECTAR UN STRING NUEVO CADA VEZ QUE APARECE CREATE TABLE, Y REALIZAR LO MISMO CON LAS INSERSIONES
			String dbInitializer = "";
			String fileName = "./databaseSQLITE/creador.txt";
			String line=null;
			
            FileReader fileReader =  new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null) {
                dbInitializer+=line;
            }   
            
            
            bufferedReader.close();
					
			
            
            ///Creador de la base de datos
            
            Statement statement = connection.createStatement();
            //statement.setQueryTimeout(30);  // set timeout to 30 sec. I DONT KNOW WHY THIS SHIT

            int inic=dbInitializer.indexOf("`");
            int fin= dbInitializer.indexOf("`",inic+1);
            String table= dbInitializer.substring(inic+1, fin);
            
            System.out.println(dbInitializer);
            
            statement.executeUpdate("drop table if exists "+table);
            statement.executeUpdate(dbInitializer);
            
			//JOptionPane.showMessageDialog(null, "Conexion exitosa");
            }
			return connection;
		} catch (Exception e) {
			//JOptionPane.showMessageDialog(null, e);
			e.printStackTrace();
			return null;
		}
	}
	
	
}
