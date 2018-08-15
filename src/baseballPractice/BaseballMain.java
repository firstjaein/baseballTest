package baseballPractice;
import java.util.Scanner;

public class BaseballMain {

	public static void main(String[] args) {
		final int ENDcount = 3;
//		boolean isFinish = false;
		RandomNumber randomNumber = new RandomNumber();
		int[] userDigit = new int[ENDcount];
//		System.out.println("컴퓨터의 랜덤숫자는..");
//		randomNumber.makeRandomNumber();

		System.out.println("");
		System.out.println("3자리 랜덤숫자를 맞춰보세요.");
		Scanner sc = new Scanner(System.in);

		while (true) {
			randomNumber.makeRandomNumber();
			for (int i = 0; i < userDigit.length; i++) {
				System.out.println("");
				System.out.println(i + " 숫자입력:");
				userDigit[i] = sc.nextInt();	//숫자만 입력받게 예외코드 작성 필요.
			}
			CompareNum compareNum = new CompareNum();
//			isFinish = compareNum.compareNum(userDigit, randomNumber.getRandomNumber());
			compareNum.compareNum(userDigit, randomNumber.getRandomNumber());
			System.out.println("새로운 게임을 시작");
		} // End of While
	} // End of Main
}