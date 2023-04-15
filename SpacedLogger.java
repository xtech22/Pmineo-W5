package Week5CodingAssignment;

public class SpacedLogger implements Logger {

	@Override
	public void log(String str) {
		for (int i=0; i<str.length(); i++){ 
		      char curr = str.charAt(i); 
		      System.out.print(curr + " "); 
		    }	
		System.out.println();
	}

	@Override
	public void error(String str) {
		System.out.print("Error: "); 
	    for (int i=0; i<str.length(); i++){ 
	      char curr = str.charAt(i);
	      System.out.print(curr + " ");
	    }
	    System.out.println();
	}

}
