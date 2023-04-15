package Week5CodingAssignment;

public class App {

	public static void main(String[] args) {
		AsteriskLogger AL = new AsteriskLogger();
	    AL.log("Hello"); 
	    System.out.println(); 
	    AL.error("Hello"); 
	    System.out.println();

	    SpacedLogger SL = new SpacedLogger();
	    SL.log("Hello"); 
	    System.out.println(); 
	    SL.error("Hello"); 
	    System.out.println(); 	

	}

}
