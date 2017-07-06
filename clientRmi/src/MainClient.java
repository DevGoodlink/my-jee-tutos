

import java.rmi.Naming;
import java.rmi.RemoteException;

public class MainClient {

	public static void main(String[] args) throws RemoteException {
		try {
			
			
			IntServeurRmi messagerie = (IntServeurRmi)Naming.lookup("rmi://localhost/messagerie");
			ClientRmi c = new ClientRmi(messagerie);
			c.setVisible(true);
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		
		
	}

}
