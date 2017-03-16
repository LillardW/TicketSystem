import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Function {
	public static void function() throws Exception {
		System.out.println("============================电影票务系统===========================");
		System.out.println(
				"                          1.用户登录                                                                                  2.用户注册                              ");
		System.out.println(
				"                          3.在线购票                                                                                  4.影片信息                              ");
		System.out.println(
				"                          5.系统帮助                                                                                  6.找回密码                              ");
		System.out.println(
				"                          7.找回影票                                                                                  8.更换座位                              ");
		System.out.println(
				"                          9.退票                                                                                          0.登出系统                              ");
		FileReader loginfr = new FileReader("Login.txt");
		BufferedReader loginbr = new BufferedReader(loginfr);
		String loginJudge = loginbr.readLine();
		if (loginJudge == null) {
			System.out.println("当前未登录！");
		} else {
			System.out.println("当前登录用户为：" + loginJudge);
		}
		System.out.print("请输入需要的功能：");
		Scanner input = new Scanner(System.in);
		int choose = input.nextInt(), returnFunction;

		if (choose == 1)
			Login1.login();
		else if (choose == 2)
			Reg.Reg();
		else if (choose == 3)
			BookTicket.bookTicket();
		else if (choose == 4) {
			for (int i = 0; i < Movieintro.intro().size(); i++) {
				System.out.println(Movieintro.intro().get(i).toString());
			}
			System.out.print("请输入1以返回主界面：");
			returnFunction = input.nextInt();
			Judgement(returnFunction);

		} else if (choose == 5)
			Intro.SysIntro();
		else if (choose == 6)
			FindPassword.findPassword();
		else if (choose == 7)
			FindTicket.findTicket();
		else if (choose == 9)
			RefundTicket.refundTicket();
		else if (choose == 0)
			Exit.exit();
		else {
			System.out.print("输入错误！请输入1以返回主界面：");
			returnFunction = input.nextInt();
			Judgement(returnFunction);
		}
	}

	public static void Judgement(int i) throws Exception {
		Scanner input = new Scanner(System.in);
		if (i == 1)
			Function.function();
		else {
			System.out.print("输入错误！请重新输入：");
			i = input.nextInt();
			Judgement(i);
		}
	}
}
