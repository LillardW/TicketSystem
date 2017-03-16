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
		System.out.println("------找回密码------");
		System.out.print("请输入你的用户名：");
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
			System.out.println("账号不存在！返回首页");
			Function.function();
		}
		System.out.print("请输入你的邮箱：");
		String email = input.next();
		while (!emailJudge(email, i)) {
			System.out.print("邮箱输入错误，请重新输入：");
			System.out.print("请输入邮箱：");
			email = input.nextLine();
		}
		if (Account().get(i).getEmail().equals(email)) {
			System.out.println("您的密码是：" + Account().get(i).getPassword());
			System.out.print("请输入1以返回首页：");
			int choose = input.nextInt();
			returnJudgement(choose);
		}
	}

	public static void returnJudgement(int i) throws Exception {
		Scanner input = new Scanner(System.in);
		if (i == 1)
			Function.function();
		else {
			System.out.print("输入错误！请重新输入：");
			i = input.nextInt();
			returnJudgement(i);
		}

	}

	public static boolean emailJudge(String email, int i) throws Exception {      //判断邮箱是否存在
		boolean emailjudge = false;
		if (Account().get(i).getEmail().equals(email)) {
			emailjudge = true;
		}
		return emailjudge;

	}
}
