import java.io.FileReader;
import java.util.Scanner;

public class SaveUser {
	String[][] User;
	
	public SaveUser() throws Exception{
		System.out.println("������Ҫע����˺ţ�");
		Scanner input = new Scanner(System.in);
		String Account = input.next();
		System.out.println("���������룺");
		String TempPassword1 = input.next();
		System.out.println("���ٴ�ȷ�����룺");
		String TempPassword2 = input.next();
		if(TempPassword1.equals(TempPassword2)) {
			String Password = TempPassword1;
			System.out.println("�������������䣺");
			String Mail = input.next();
			User[0][0] = Account;
			User[0][1] = Password;
			User[0][2] = Mail;
			}
		else System.out.println("");
		
		FileReader fr = new FileReader("Account.txt");
		
	}
}
	


