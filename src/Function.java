import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Function {
	public static void function() throws Exception {
		System.out.println("============================��ӰƱ��ϵͳ===========================");
		System.out.println(
				"                          1.�û���¼                                                                                  2.�û�ע��                              ");
		System.out.println(
				"                          3.���߹�Ʊ                                                                                  4.ӰƬ��Ϣ                              ");
		System.out.println(
				"                          5.ϵͳ����                                                                                  6.�һ�����                              ");
		System.out.println(
				"                          7.�һ�ӰƱ                                                                                  8.������λ                              ");
		System.out.println(
				"                          9.��Ʊ                                                                                          0.�ǳ�ϵͳ                              ");
		FileReader loginfr = new FileReader("Login.txt");
		BufferedReader loginbr = new BufferedReader(loginfr);
		String loginJudge = loginbr.readLine();
		if (loginJudge == null) {
			System.out.println("��ǰδ��¼��");
		} else {
			System.out.println("��ǰ��¼�û�Ϊ��" + loginJudge);
		}
		System.out.print("��������Ҫ�Ĺ��ܣ�");
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
			System.out.print("������1�Է��������棺");
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
			System.out.print("�������������1�Է��������棺");
			returnFunction = input.nextInt();
			Judgement(returnFunction);
		}
	}

	public static void Judgement(int i) throws Exception {
		Scanner input = new Scanner(System.in);
		if (i == 1)
			Function.function();
		else {
			System.out.print("����������������룺");
			i = input.nextInt();
			Judgement(i);
		}
	}
}
