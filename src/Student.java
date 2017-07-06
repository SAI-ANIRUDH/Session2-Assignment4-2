import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int P,C,M;
	        int i;
	        float sum=0, avg;
	        Scanner scan = new Scanner(System.in);
			System.out.print("Enter Marks Obtained in Physics  ");
	        P=scan.nextInt();
	        System.out.print("Enter Marks Obtained in Maths ");
	        M=scan.nextInt();
	        System.out.print("Enter Marks Obtained in Chemistry ");
	       C=scan.nextInt();
	        for(i=0; i<3;i++)
	        {
	            
	            sum = sum +P+C+M;
	        }
			
	        avg = sum/5;
			
	        System.out.print("Your Grade is ");
	        if(avg>70)
	        {
	            System.out.print("A");
	        }
	        else if(avg>61 && avg<70)
	        {
	            System.out.print("B");
	        }
	        else if(avg<=60)
	        {
	            System.out.print("C");
	        }
	       
	    }
	}