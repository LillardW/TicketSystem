import java.io.FileWriter;
import java.io.IOException;

public class Exit {
	public static void exit() throws Exception {
		FileWriter exit = new FileWriter("Login.txt");
		exit.write("");
		exit.close();
		System.out.println("µÇ³ö³É¹¦£¡");
		Function.function();
	}

}
