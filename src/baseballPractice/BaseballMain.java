package baseballPractice;

import java.util.Scanner;

public class BaseballMain {

	final static int EndCount = 3;

	public static void main(String[] args) {
		RandomNumber randomNumber = new RandomNumber();
		int[] userDigit = new int[EndCount];
		System.out.println("3�ڸ� �������ڸ� ���纸����.");
		Scanner sc = new Scanner(System.in);
		randomNumber.makeRandomNumber();

		while (true) {
			for (int i = 0; i < userDigit.length; i++) {
				System.out.println("");
				System.out.println(i + " �����Է�:");
				try {
					userDigit[i] = Integer.parseInt(sc.next());
				} catch (NumberFormatException nfe) {
					System.err.println("�߸��� �Է�.���ڸ� �Է��ϼ���.");
					i--;
				}
			}
			CompareNum compareNum = new CompareNum();
			boolean isFinish = false;
			isFinish = compareNum.compareNum(userDigit, randomNumber.getRandomNumber());
			if (isFinish == true) {
				System.out.println("\n" + "�����Դϴ�." + "���ο� ������ �����մϴ�.");
				randomNumber.makeRandomNumber();
			}
		} // End of while
	} // ENd of main
}