package Week5CodingAssignment;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String str) {
		System.out.println("***" + str + "***");
		
	}

	@Override
	public void error(String str) {
		String res = "***" + "Error: " + str + "***";
		
		 String stars = " ";
		    for (int i=0; i<res.length(); i++) stars += "*";
		    
		    System.out.println(stars + "\n" + res + "\n" + stars);
		
	}

	
	
}
