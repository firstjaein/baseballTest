package baseballPractice;

import java.util.Scanner;

public class BaseballMain {

	final static int EndCount = 3;
	
	public static void main(String[] args) {
		// boolean isFinish = false;
		RandomNumber randomNumber = new RandomNumber();
		int[] userDigit = new int[EndCount];
		System.out.println("3�ڸ� �������ڸ� ���纸����.");
		Scanner sc = new Scanner(System.in);
		randomNumber.makeRandomNumber();

			for (int i = 0; i < userDigit.length; i++) {
				System.out.println("");
				System.out.println(i + " �����Է�:");
				try
				{
					userDigit[i] = Integer.parseInt(sc.next());
				}
				catch(NumberFormatException nfe)
				{
					System.err.println("�߸��� �Է�");
					i--;
				}
			}
			CompareNum compareNum = new CompareNum();
			compareNum.compareNum(userDigit, randomNumber.getRandomNumber());
		} //End of While
	} // End of Main