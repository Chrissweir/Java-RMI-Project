package ie.gmit.sw;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

//Here the string service remote interface is implemented.
public class StringServiceImpl extends UnicastRemoteObject implements StringService {
	
	private static final long serialVersionUID = 1L;
	private Resultator result;

	public StringServiceImpl() throws RemoteException {
	}

	public Resultator compare(String s, String t, String algo) throws RemoteException {
		result = new ResultatorImpl();
		
		//compare Strings with string compare service
        StringComparator comparator = new StringComparator(s, t, algo, result);
        
        //log out result
        System.out.println(result.getResult());

        //returns the Resultator
		return result;
	}

}//end StringServiceImpl