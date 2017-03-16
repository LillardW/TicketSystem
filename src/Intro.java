import java.util.Scanner;

public class Intro {
	public static void SysIntro() throws Exception {
		System.out.println("欢迎使用电影票务系统！");
		System.out.println("请输入1以返回主界面：");
		Scanner input = new Scanner(System.in);
		int choose = input.nextInt();
		Function.Judgement(choose);
	}

}
