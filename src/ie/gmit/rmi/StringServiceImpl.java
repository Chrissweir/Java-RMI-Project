package ie.gmit.rmi;
/**
* StringServiceImpl Class extends UnicastRemoteObject and implements StringService interface
* Sends threaded requests to StringComparator
* 
* @author Christopher Weir
*/
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StringServiceImpl extends UnicastRemoteObject implements StringService {
	
	private static final long serialVersionUID = 1L;

	public StringServiceImpl() throws RemoteException {
		super();
	}

	public Resultator compare(String s, String t, String algo) throws RemoteException {
		Resultator result = new ResultatorImpl();
		
		//Compare Strings with StringComparator
		Thread thread = new Thread(new StringComparator(s, t, result, algo));
        thread.start();

        //Returns the Resultator
		return result;
	}
}