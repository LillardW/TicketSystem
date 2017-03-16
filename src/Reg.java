import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Reg {
	public static ArrayList<Account> Account() throws Exception {
		ArrayList<Account> Account = new ArrayList<Account>();
		FileReader AccountReader = new FileReader("Account.txt");
		BufferedReader AccountBufferedReader = new BufferedReader(AccountReader);
		String s = AccountBufferedReader.readLine();
		while (s != null) {
			String[] zhanghao = s.split(" ");

			Account.add(new Account(zhanghao[0], zhanghao[1], zhanghao[2]));
			s = AccountBufferedReader.readLine();
		}

		AccountReader.close();
		AccountBufferedReader.close();
		return Account;
	}

	public static void Reg() throws Exception {
		System.out.println("======================欢迎注册电影票务系统===========================");
		System.out.println("");
		System.out.print("请输入要注册的账号：");
		Scanner input = new Scanner(System.in);
		String Account1 = input.next();

		while (accountJudge(Account1)) {
			System.out.println("账号已存在，请重新输入！");
			System.out.print("请输入要注册的账号：");
			Account1 = input.next();

		}
		// Account1 = input.next();
		System.out.print("请输入要注册的密码：");
		String Password1 = input.next();
		System.out.print("请输入您的邮箱：");
		String email = input.next();
		FileWriter fw = new FileWriter("Account.txt", true);
		fw.write(Account1 + " " + Password1 + " " + email + "\n");
		fw.close();
		System.out.println("注册成功！");
		Function.function();

	}

	public static boolean accountJudge(String Account1) throws Exception {
		System.out.println("judge function start........");
		int i = 0;
		boolean accountJudge = false;
		for (i = 0; i < Account().size(); i++) {
			if (Account1.equals(Account().get(i).getAccount())) {
				accountJudge = true;
			}
		}
		return accountJudge;
	}
}
