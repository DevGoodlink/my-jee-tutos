package service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IService extends Remote {
	public int addition(int a,int b) throws RemoteException;
	public double multiplication(int a,int b) throws RemoteException;
}
