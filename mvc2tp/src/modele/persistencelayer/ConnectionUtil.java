package modele.persistencelayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	private static Connection con;
	 static{
	 	try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection
			("jdbc:mysql://localhost:3306/ecole","root","root");
		} catch (ClassNotFoundException e) {
			System.out.println("driver introuvable");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 public static Connection getConnection(){
	 	return con;
	 }

}
