import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Movieintro {
	
	   public static ArrayList<Movie> intro() throws Exception{
		   ArrayList<Movie> armov = new ArrayList<Movie>();
		  
		   FileReader fr = new FileReader("movies.txt");
		   
		   BufferedReader br = new BufferedReader(fr);
		   String s = br.readLine();
		   
		   while(s!=null){
			//   System.out.println(s);
			 String[] movieintro = s.split(" ");
			 //Movie mov = new Movie(movieintro[0],movieintro[1],movieintro[2]);
		   armov.add(new Movie(movieintro[0],movieintro[1],movieintro[2],movieintro[3]));
		   s = br.readLine();
		   }
		   br.close();
		   fr.close();
		   
		   return armov;
		  
  	   }

}
