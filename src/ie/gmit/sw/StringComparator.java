package ie.gmit.sw;

import java.rmi.RemoteException;

//import algorithms
import ie.gmit.algorithms.*;

public class StringComparator {
	//Instance variables to retrieve string task values
		private String s;
		private String t;
		private Resultator result;
		private String algo;
		
		private Levenshtein ls = new Levenshtein();
		private HammingDistance hd = new HammingDistance();
		private DamerauLevenshtein dl = new DamerauLevenshtein();
		
		//Constructor accepts values from string task object. Client runnable grabs them and passes them into compare()
		//which in turn then passes them to this runnable..
		public StringComparator(String s, String t, Resultator result, String algo){
			this.s = s;
			this.t = t;
			this.result = result;
			this.algo = algo;//just holds the name of the algorithm for comparison
			init();
		}

		//Run method, essentially the main method of the runnable.
		public void init() {
			
			//Different algorithms return the result in different formats
			int distance;
			//float distanceF;
			//String distanceS;
			
			
			//Decide with string comparison algorithm to run. The code in each selection is basically the same
			if(algo.equalsIgnoreCase("Levenshtein Distance")){
				
				distance = ls.distance(s, t);
				try {
					result.setResult("Levenshtein Distance is: "+distance);
					result.setProcessed();//All done :)
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			else if(algo.equalsIgnoreCase("Hamming Distance"))
			{
				distance = hd.distance(s, t);
				try {
					result.setResult("Hamming Distance is: "+distance);
					result.setProcessed();//All done :)
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			else if(algo.equalsIgnoreCase("Damerau-Levenshtein Distance"))
			{
				distance = dl.distance(s, t);
				try {
					result.setResult("Hamming Distance is: "+distance);
					result.setProcessed();//All done :)
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}//end run()
	}//end class