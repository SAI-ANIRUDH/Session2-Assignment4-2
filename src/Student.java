package assignment2;
import java.util.Scanner; // Importing Scanner class from Util Package //
public class Student // Declaring class Student //
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int P,C,M; // Declaring marks Physics P, Chemistry C, Maths M //
	        int i; // Declaring iterator i //
	        float sum=0, avg; // Declaring variables Sum and Avg //
	        Scanner scan = new Scanner(System.in); // Intialising user input values using scanner class//
			System.out.print("Enter Marks Obtained in Physics  "); 
	        P=scan.nextInt(); // Taking input for physics marks from user //
	        System.out.print("Enter Marks Obtained in Maths ");
	        M=scan.nextInt(); // Taking input for Maths marks from user //
	        System.out.print("Enter Marks Obtained in Chemistry ");
	       C=scan.nextInt(); // Taking input for Chemistry marks from user //
	        for(i=0; i<3;i++)
	        {
	            
	            sum = sum +P+C+M; // Total of marks P, C, M //
	        }
			
	        avg = sum/5; // Taking Average //
			
	        System.out.print("Your Grade is ");
	        if(avg>70)
	        {
	            System.out.print("A"); // If avg of marks greater than 70 , display A //
	        }
	        else if(avg>61 && avg<70) // If avg of marks greater than 61 and less than 70, display A //
	        {
	            System.out.print("B");
	        }
	        else if(avg<=60) // If avg of marks less than 60 display C //
	        {
	            System.out.print("C");
	        }
	       
	    }
	}
