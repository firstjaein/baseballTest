package baseballPractice;

import java.util.Scanner;

public class BaseballMain {

	final static int EndCount = 3;
	
	public static void main(String[] args) {
		// boolean isFinish = false;
		RandomNumber randomNumber = new RandomNumber();
		int[] userDigit = new int[EndCount];
		System.out.println("3자리 랜덤숫자를 맞춰보세요.");
		Scanner sc = new Scanner(System.in);
		randomNumber.makeRandomNumber();

			for (int i = 0; i < userDigit.length; i++) {
				System.out.println("");
				System.out.println(i + " 숫자입력:");
				try
				{
					userDigit[i] = Integer.parseInt(sc.next());
				}
				catch(NumberFormatException nfe)
				{
					System.err.println("잘못된 입력");
					i--;
				}
			}
			CompareNum compareNum = new CompareNum();
			compareNum.compareNum(userDigit, randomNumber.getRandomNumber());
		} //End of While
	} // End of Main