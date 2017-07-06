

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IntServeurRmi extends Remote{
	public void createAccount(int a) throws RemoteException;
	public boolean sendMessage(int sender,int destination,int idMessage)throws RemoteException;
	public boolean readMessage(int destination,int sender,int idMessage)throws RemoteException;
}
