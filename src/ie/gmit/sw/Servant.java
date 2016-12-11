package ie.gmit.sw;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import ie.gmit.rmi.StringService;
import ie.gmit.rmi.StringServiceImpl;

public class Servant {

		public static void main(String[] args) throws Exception{
			
		//Create an instance of the class StringService and pass the string as an argument to its constructor.
		StringService service = new StringServiceImpl();
		
		//Start the RMI registry on port 1099
		LocateRegistry.createRegistry(1099);
		
		//Bind our remote object to the registry with the human-readable name "stringservice"
		Naming.rebind("stringservice", service);
		
		//Print a nice message to standard output
		System.out.println("Server ready....");
	}
}