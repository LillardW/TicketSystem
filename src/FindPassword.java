import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class FindPassword {
	public static ArrayList<Account> Account() throws Exception {
		ArrayList<Account> ReadAccount = new ArrayList<Account>();
		FileReader AccountFR = new FileReader("Account.txt");
		BufferedReader AccountBR = new BufferedReader(AccountFR);
		String Information = AccountBR.readLine();

		while (Information != null) {
			String Account[] = Information.split(" ");
			ReadAccount.add(new Account(Account[0], Account[1], Account[2]));
			Information = AccountBR.readLine();
		}
		AccountFR.close();
		AccountBR.close();

		return ReadAccount;
	}

	public static void findPassword() throws Exception {
		System.out.println("------�һ�����------");
		System.out.print("����������û�����");
		Scanner input = new Scanner(System.in);
		boolean accountExistJudge = false;
		String Account = input.next();
		String trueAccount = "";
		int i;
		for (i = 0; i < Account().size(); i++) {
			if (Account.equals(Account().get(i).getAccount())) {
				trueAccount = Account;
				accountExistJudge = true;
				break;
			}
		}
		if (!accountExistJudge) {
			System.out.println("�˺Ų����ڣ�������ҳ");
			Function.function();
		}
		System.out.print("������������䣺");
		String email = input.next();
		while (!emailJudge(email, i)) {
			System.out.print("��������������������룺");
			System.out.print("���������䣺");
			email = input.nextLine();
		}
		if (Account().get(i).getEmail().equals(email)) {
			System.out.println("���������ǣ�" + Account().get(i).getPassword());
			System.out.print("������1�Է�����ҳ��");
			int choose = input.nextInt();
			returnJudgement(choose);
		}
	}

	public static void returnJudgement(int i) throws Exception {
		Scanner input = new Scanner(System.in);
		if (i == 1)
			Function.function();
		else {
			System.out.print("����������������룺");
			i = input.nextInt();
			returnJudgement(i);
		}

	}

	public static boolean emailJudge(String email, int i) throws Exception {      //�ж������Ƿ����
		boolean emailjudge = false;
		if (Account().get(i).getEmail().equals(email)) {
			emailjudge = true;
		}
		return emailjudge;

	}
}
