package serverExam;

import java.awt.List;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IntServeurRmi extends Remote{
	public void createAccount(int a) throws RemoteException;
	public boolean sendMessage(int sender,int destination,String Message)throws RemoteException;
	public String readMessage(int destination)throws RemoteException;
}
