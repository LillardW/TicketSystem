import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class BookTicket {

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

	public static void bookTicket() throws Exception {
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
		for (int i = 0; i < Movieintro.intro().size(); i++) {
			System.out.println(Movieintro.intro().get(i).toString());
		}
		System.out.println("请选择需要购票的电影:");
		Scanner input = new Scanner(System.in);
		String movieNumber = input.next();
		System.out.println("请选择座位:");
		System.out.println("-------银幕-------");
		for (int i = 1; i < 23; i++) {
			System.out.print(i + " ");
			if (i == 11) {
				System.out.println();
				System.out.print("  ");
			}
			if (i == 17) {
				System.out.println();
				System.out.print("    ");
			}
		}
		System.out.println();
		String place = input.next();
		int placeNumber = Integer.parseInt(place);
		while (placeNumber < 1 || placeNumber > 22) {
			System.out.println("位置输入错误，请重新输入！");
			place = input.next();
		}
		while (placeJudge(movieNumber, place)) {
			System.out.println("此座位已有人，请重新选择座位！");
			System.out.print("请选择座位:");
			place = input.next();
		}
		FileWriter placefw = new FileWriter("place.txt", true);
		placefw.write(movieNumber + " " + loginAccount + " " + place + "\n");
		placefw.close();
		System.out.println("购票成功！");
		Function.function();
	}

	public static boolean placeJudge(String movieNumber, String place) throws Exception {
		int movieNumber1 = Integer.parseInt(movieNumber);
		boolean placeJudge=false;
		for(int i=0;i<Place().size();i++) {
			if (Place().get(i).getMovieNumber().equals(movieNumber)
					&& Place().get(i).getPlace().equals(place)) {
				placeJudge = true;
				break;
			}
		}
		return placeJudge;
	}

}
