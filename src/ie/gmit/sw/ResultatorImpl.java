package ie.gmit.sw;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ResultatorImpl extends UnicastRemoteObject implements Resultator{
	
	private static final long serialVersionUID = 1L;
	private boolean isProcessed = false;
	private String result;

	
	//Constructor
	public ResultatorImpl() throws RemoteException{
		this.result = null;
		this.isProcessed = false;
	}

	@Override
	public String getResult() throws RemoteException {
		return this.result;
	}

	@Override
	public void setResult(String result) throws RemoteException {
		this.result = result;
	}

	@Override
	public boolean isProcessed() throws RemoteException {
		return this.isProcessed;
	}

	@Override
	public void setProcessed() throws RemoteException {
		this.isProcessed = true;
	}

}
