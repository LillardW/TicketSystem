import java.util.Scanner;

public class UserOp1 {
	 public static Scanner sc = new Scanner(System.in);
	      public static void userValid(){
	    	 
	    	  String username = sc.next();
	    	
	    	 while(!passwordComp()) {
	    		 
	    	 }
	      }
	      
	      public static boolean passwordComp(){
	    	  System.out.println("password one");
	    	  String password_one = sc.next();
	    	  System.out.println("password two");
	    	  String password_two = sc.next();
	    	  if(password_one.equals(password_two)) {
	    		  return true;
	    	  }
	    	  else {
	    		  return false;
	    	  }
	    		  
	    	  
	      }
	
}
