package baseballPractice;
import java.util.Scanner;

public class BaseballMain {

	public static void main(String[] args) {
		final int ENDcount = 3;
//		boolean isFinish = false;
		RandomNumber randomNumber = new RandomNumber();
		int[] userDigit = new int[ENDcount];
//		System.out.println("��ǻ���� �������ڴ�..");
//		randomNumber.makeRandomNumber();

		System.out.println("");
		System.out.println("3�ڸ� �������ڸ� ���纸����.");
		Scanner sc = new Scanner(System.in);

		while (true) {
			randomNumber.makeRandomNumber();
			for (int i = 0; i < userDigit.length; i++) {
				System.out.println("");
				System.out.println(i + " �����Է�:");
				userDigit[i] = sc.nextInt();	//���ڸ� �Է¹ް� �����ڵ� �ۼ� �ʿ�.
			}
			CompareNum compareNum = new CompareNum();
//			isFinish = compareNum.compareNum(userDigit, randomNumber.getRandomNumber());
			compareNum.compareNum(userDigit, randomNumber.getRandomNumber());
			System.out.println("���ο� ������ ����");
		} // End of While
	} // End of Main
}