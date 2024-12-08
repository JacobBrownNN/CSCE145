import java.util.Scanner;

public class Lab2 {

	public static final double FV = 103.3 ;
	public static final double Dt = 543.0 ;
	
	
 static void main(String[] args) {
		// TODO Auto-generated method stub

		
	 System.out.print("Welcome to my first java program!!!\n");
		
		
		System.out.print("\"JAVA\" is fun!!!");
		
		//create scanner object line must come before giving information 
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Whats\'s for lunch today? \nEnter entree: ");
		
		 //labeling box or variable to store information and decorate or name the variable 
		
		String entree;             
		
		entree = key.nextLine();     
		
		System.out.println("Entree:  "+ entree);
		
		//+ concatenation(join operator 
		//= assignment operator 
	 
		
		
		System.out.println("Entree side and drink:");
		
		String side = key.next();
		key.nextLine();   //reads the remainder of the current line 
		
		
		String drink = key.nextLine();
		
		System.out.println("Side:  "+side);
		
		System.out.println("Drink:  "+drink);
	}


	}


