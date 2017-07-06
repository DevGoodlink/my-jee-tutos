package serverExam;

import java.awt.List;
import java.io.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

@SuppressWarnings("serial")
public class ImpMessage extends UnicastRemoteObject implements IntServeurRmi {

	protected ImpMessage() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createAccount(int a) throws RemoteException {
		try {
			PrintWriter sortie = new PrintWriter(new FileWriter("comptes.txt",true));
			sortie.println(""+a);
			sortie.close();
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}
		
	}

	@Override
	public boolean sendMessage(int sender, int destination, String message) throws RemoteException {
		try {
			PrintWriter sortie = new PrintWriter(new FileWriter("messages.txt",true));
			sortie.println(sender+" : " + destination+" : "+message+" : ");
			sortie.close();
			return true;
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
			return false;
		}
	}

	@Override
	public String readMessage(int destination) throws RemoteException {
		String retour="";
		try {
			BufferedReader br = new BufferedReader(new FileReader("messages.txt"));
			while (br.ready()) 
			{
				int d,s,im;
				String line=br.readLine();
				d=Integer.parseInt(line.split(" : ")[0]);
				s=Integer.parseInt(line.split(" : ")[1]);
				im=Integer.parseInt(line.split(" : ")[2]);
				
				if (d==destination) {
					retour+=line;
				}
				
			}
			//le fichier messages est créé depuis la forme client
		} catch (Exception e) {
			// TODO: handle exception
		}
		return retour;
	}
	

}
