package ie.gmit.sw;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StringServiceImpl extends UnicastRemoteObject implements StringService{

	private static final long serialVersionUID = 1L;
	private Resultator result;
	
	protected StringServiceImpl() throws RemoteException {
	}

	@Override
	public Resultator compare(String s, String t, String algo) throws RemoteException {

		 result = new ResultatorImpl();
		 AlgoComparator compareJob = new AlgoComparator(s, t, result, algo);
		 return null;
	}


}
