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
		System.out.println("======================��ӭע���ӰƱ��ϵͳ===========================");
		System.out.println("");
		System.out.print("������Ҫע����˺ţ�");
		Scanner input = new Scanner(System.in);
		String Account1 = input.next();

		while (accountJudge(Account1)) {
			System.out.println("�˺��Ѵ��ڣ����������룡");
			System.out.print("������Ҫע����˺ţ�");
			Account1 = input.next();

		}
		// Account1 = input.next();
		System.out.print("������Ҫע������룺");
		String Password1 = input.next();
		System.out.print("�������������䣺");
		String email = input.next();
		FileWriter fw = new FileWriter("Account.txt", true);
		fw.write(Account1 + " " + Password1 + " " + email + "\n");
		fw.close();
		System.out.println("ע��ɹ���");
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
