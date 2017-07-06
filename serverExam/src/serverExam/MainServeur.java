package serverExam;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class MainServeur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			ImpMessage obj = new ImpMessage();
			Naming.rebind("rmi://localhost/messagerie", obj);
			System.out.println("Serveur en marche");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		

	}

}
