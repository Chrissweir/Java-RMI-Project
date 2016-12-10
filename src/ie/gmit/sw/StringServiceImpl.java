package ie.gmit.sw;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

//Here the string service remote interface is implemented.
public class StringServiceImpl extends UnicastRemoteObject implements StringService {

	protected StringServiceImpl() throws RemoteException {
	}

	private static final long serialVersionUID = 1L;

	@Override
	public Resultator compare(String s, String t, String algo) throws RemoteException {
		return null;
	}

	
}
