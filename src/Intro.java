import java.util.Scanner;

public class Intro {
	public static void SysIntro() throws Exception {
		System.out.println("��ӭʹ�õ�ӰƱ��ϵͳ��");
		System.out.println("������1�Է��������棺");
		Scanner input = new Scanner(System.in);
		int choose = input.nextInt();
		Function.Judgement(choose);
	}

}
