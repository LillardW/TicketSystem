import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Login {
	public static ArrayList<Account> Account() throws Exception {
		ArrayList<Account> ReadAccount = new ArrayList<Account>();
		FileReader AccountFR = new FileReader("Account.txt");
		BufferedReader AccountBR = new BufferedReader(AccountFR);
		String Information = AccountBR.readLine();
		
		while(Information!=null) {
			String Account[] = Information.split(" ");
			ReadAccount.add(new Account(Account[0],Account[1],Account[2]));
			Information = AccountBR.readLine();
		}
		AccountFR.close();
		AccountBR.close();
		
		return ReadAccount;
	}
	
	public static void login() throws Exception {
		
		System.out.println("====================欢迎登录电影票务系统===========================\n");
		System.out.println("请输入用户名：");
	
		Scanner input1 = new Scanner(System.in);
		String Account1 = input1.next();
		for(int i=0;i<Account().size();i=i+3) {
			if(Account1 == Account().get(i).getAccount()) {
				System.out.println("请输入密码：");
				String Password1 = input1.next();
				for(i=1;i<Account().size();i=i+3) {
					if(Password1==Account().get(i).getPassword()) {
						System.out.println("登录成功！");
					}
					else {
						System.out.println("密码错误！");
					}
				}
			}
			else {
				System.out.println("用户不存在！请重新输入！");
			}
		}
		
		Function.function();
	}
}
