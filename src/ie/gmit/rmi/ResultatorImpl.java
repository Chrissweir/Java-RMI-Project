package ie.gmit.rmi;
/**
 * ResultatorImpl Class extends UnicastRemoteObject and implements Resultator interface.
 * 
 * @author Christopher Weir
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ResultatorImpl extends UnicastRemoteObject implements Resultator{
	private static final long serialVersionUID = 1L;
	private String s;
	private String t;
	private boolean isProcessed = false;
	private String result;

	//Constructor
	public ResultatorImpl() throws RemoteException{
	}
	
	public ResultatorImpl(String str1, String str2) throws RemoteException{
		this.s=str1;
		this.t=str2;
	}

	public String getResult() throws RemoteException {
		
		return result;
	}

	public void setResult(String result) throws RemoteException {
		
		this.result = result;
	}

	public boolean isProcessed() throws RemoteException {		
		return isProcessed;
	}

	public void setProcessed() throws RemoteException {
		this.isProcessed = true;
	}
}