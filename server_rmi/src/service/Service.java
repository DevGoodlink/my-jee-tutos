package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class Service extends UnicastRemoteObject implements IService  {

	protected Service() throws RemoteException {
		super();
	}

	@Override
	public int addition(int a, int b) throws RemoteException {
		return a+b;
	}

	@Override
	public double multiplication(int a, int b) throws RemoteException {
		return a*b;
	}


}
