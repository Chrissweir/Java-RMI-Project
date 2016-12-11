package ie.gmit.rmi;
/**
* StringService is an Interface that extends remote
* and contains the method Resultator compare();
*
* @author Christopher Weir
*/
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StringService extends Remote{

    public Resultator compare(String s, String t, String algo) throws RemoteException;

}