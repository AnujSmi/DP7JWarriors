package switchcase;
import java.util.Scanner;
public class Votingeligibilty {
   public static void main(String args[])
   {
	   Scanner sc = new Scanner(System.in);
	   int age = sc.nextInt();
	   String status;
	   status=(age>=18)?"yes":"no";
	   System.out.println(status);
	   
	   if(age>=18) {
		   status="yes";
	   }
	   else {
		   status="no";
	   }
	  System.out.println(status);
	  boolean s = (age>=18)?true:false;
	  System.out.println(s);
	  if(age>=18)
	  {
		  s= true;
	  }
	  else
	  {
		  s=false;
	  }
	   
		   
   }
	
}
