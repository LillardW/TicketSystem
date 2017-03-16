import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class RefundTicket {

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

	public static ArrayList<Place> Place() throws Exception {
		ArrayList<Place> ReadPlace = new ArrayList<Place>();
		FileReader PlaceFR = new FileReader("place.txt");
		BufferedReader PlaceBR = new BufferedReader(PlaceFR);
		String Information = PlaceBR.readLine();

		while (Information != null) {
			String Place[] = Information.split(" ");
			ReadPlace.add(new Place(Place[0], Place[1], Place[2]));
			Information = PlaceBR.readLine();
		}
		PlaceFR.close();
		PlaceBR.close();

		return ReadPlace;
	}

	public static void refundTicket() throws Exception {
		FileReader fr = new FileReader("place.txt");
		boolean loginJudge = false;
		FileReader loginUser = new FileReader("Login.txt");
		BufferedReader loginUser1 = new BufferedReader(loginUser);
		String loginAccount = loginUser1.readLine();
		if (loginAccount == null) {
			System.out.println("请先登录！");
			Function.function();
		}
		for (int i = 0; i < Login1.Account().size(); i++) {
			if (loginAccount.equals(Login1.Account().get(i).getAccount())) {
				loginJudge = true;
				break;
			}
		}

		if (loginJudge == false) {
			System.out.println("请先登录！");
			Function.function();
		}
		System.out.println("------退票------");
		for (int i = 0; i < Place().size(); i++) {
			if (loginAccount.equals(Place().get(i).getAccount())) {
				System.out.println(
						"您订的电影票有： " + "电影序号：" + Place().get(i).getMovieNumber() + " 座位号：" + Place().get(i).getPlace());
			}
		}
		System.out.print("请输入您需要退票的电影序号和座位号：");
		Scanner input = new Scanner(System.in);
		String movieNumber = input.next();
		String place = input.next();
		FileWriter fw = new FileWriter("place.txt");
		for (int i = 0; i < Place().size(); i++) {
			if (movieNumber.equals(Place().get(i).getMovieNumber()) && place.equals(Place().get(i).getPlace())) {
				continue;
			} else {
				fw.write(Place().get(i).getMovieNumber() + " " + Place().get(i).getAccount() + " "
						+ Place().get(i).getPlace() + "\n");
			}
		}
		fw.close();
		System.out.println("退票成功！");
		Function.function();
	}

}
