package service;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ClientCalcule {

	public static void main(String[] args) {
		
		try {
			
			Service cal = (Service) Naming.lookup("rmi://localhost/cal");
			
			System.out.println(cal.addition(5, 5));
			System.out.println(cal.multiplication(5, 5));
			
		} catch (MalformedURLException | RemoteException | NotBoundException e) {

			
			e.printStackTrace();
		}
		
		
	}

}
