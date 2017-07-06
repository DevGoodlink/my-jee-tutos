package service;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;


public class ServeurCalcule {

	public static void main(String[] args) {

		try 
		{
			
			LocateRegistry.createRegistry(1099);
			IService cal = new Service();
			System.out.println(cal.toString());
			Naming.rebind("rmi://localhost:1099/cal", cal);
			//System.out.println("Serveur à l'écoute");
			
		} 
		catch (Exception e) 
		{

			e.printStackTrace();
			
		}
		
	}

}
