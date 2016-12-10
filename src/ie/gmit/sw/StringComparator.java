package ie.gmit.sw;

import java.rmi.RemoteException;
import ie.gmit.algorithms.*;

public class StringComparator {
		private String s;
		private String t;
		private Resultator result;
		private String algo;
		
		//Initialise algorithms
		private Levenshtein ls = new Levenshtein();
		private HammingDistance hd = new HammingDistance();
		private DamerauLevenshtein dl = new DamerauLevenshtein();
		
		public StringComparator(String s, String t, Resultator result, String algo){
			this.s = s;
			this.t = t;
			this.result = result;
			this.algo = algo;
			
			init();
		}

		public void init() {
			int distance;
			
			//Decide with string comparison algorithm to run.
			if(algo.equalsIgnoreCase("Levenshtein Distance")){
				
				distance = ls.distance(s, t);
				try {
					result.setResult("Levenshtein Distance is: "+distance);
					result.setProcessed();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			else if(algo.equalsIgnoreCase("Hamming Distance"))
			{
				distance = hd.distance(s, t);
				try {
					result.setResult("Hamming Distance is: "+distance);
					result.setProcessed();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			else if(algo.equalsIgnoreCase("Damerau-Levenshtein Distance"))
			{
				distance = dl.distance(s, t);
				try {
					result.setResult("Hamming Distance is: "+distance);
					result.setProcessed();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}
	}//end class