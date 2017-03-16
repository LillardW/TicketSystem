import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Login1 {
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

	public static void login() throws Exception {
		FileWriter loginUser = new FileWriter("Login.txt");

		System.out.println("======================ª∂”≠µ«¬ºµÁ”∞∆±ŒÒœµÕ≥===========================");
		System.out.println("\n");
		System.out.println("«Î ‰»Î’À∫≈£∫");
		Scanner input = new Scanner(System.in);

		boolean accountJudge, passwordJudge;
		String Account1 = input.nextLine();
		System.out.print("«Î ‰»Î√‹¬Î£∫");
		String Password1 = input.nextLine();
		// accountJudge = accountJudge(Account1);
		while (accountJudge(Account1, Password1) == false) {
			System.out.println("’À∫≈√‹¬Î¥ÌŒÛ£¨«Î÷ÿ–¬ ‰»Î£°");
			System.out.print("«Î ‰»Î’À∫≈£∫");
			Account1 = input.nextLine();
			System.out.print("«Î ‰»Î√‹¬Î£∫");
			Password1 = input.nextLine();
			accountJudge(Account1, Password1);
		}

		if (accountJudge(Account1, Password1) == true) {
			loginUser.write(Account1);
			loginUser.close();
			System.out.println("µ«¬Ω≥…π¶£°");
		}

		Function.function();
	}

	public static boolean accountJudge(String Account1, String Password1) throws Exception {
		int i;
		boolean accountJudge = true, passwordJudge = true, tempJudge1 = true, tempJudge2 = true;
		for (i = 0; i < Account().size(); i++) {
			if (Account1.equals(Account().get(i).getAccount())) {
				tempJudge1 = true;
				break;
			} else {
				tempJudge1 = false;
			}
		}
		accountJudge = tempJudge1;
		if (Password1.equals(Account().get(i).getPassword())) {
			tempJudge2 = true;
		} else {
			tempJudge2 = false;
		}
		passwordJudge = tempJudge2;
		if (accountJudge == true && passwordJudge == true) {
			return true;
		} else {
			return false;
		}
	}

}
