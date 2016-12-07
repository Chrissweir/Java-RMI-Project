package ie.gmit.sw;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StringServiceImpl extends UnicastRemoteObject implements StringService{

	private static final long serialVersionUID = 1L;
	
	protected StringServiceImpl() throws RemoteException {
		super();
	}

	

	@Override
	public Resultator compare(String s, String t, String algo) throws RemoteException {
		return null;
	}


}
