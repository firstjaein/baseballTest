package baseballPractice;

import java.util.Scanner;

public class BaseballMain {

	final static int EndCount = 3;

	public static void main(String[] args) {
		RandomNumber randomNumber = new RandomNumber();
		int[] userDigit = new int[EndCount];
		System.out.println("3자리 랜덤숫자를 맞춰보세요.");
		Scanner sc = new Scanner(System.in);
		randomNumber.makeRandomNumber();

		while (true) {
			for (int i = 0; i < userDigit.length; i++) {
				System.out.println("");
				System.out.println(i + " 숫자입력:");
				try {
					userDigit[i] = Integer.parseInt(sc.next());
				} catch (NumberFormatException nfe) {
					System.err.println("잘못된 입력.숫자를 입력하세요.");
					i--;
				}
			}
			CompareNum compareNum = new CompareNum();
			boolean isFinish = false;
			isFinish = compareNum.compareNum(userDigit, randomNumber.getRandomNumber());
			if (isFinish == true) {
				System.out.println("\n" + "정답입니다." + "새로운 게임을 시작합니다.");
				randomNumber.makeRandomNumber();
			}
		} // End of while
	} // ENd of main
}