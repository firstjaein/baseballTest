package baseballPractice;

import java.util.Scanner;

public class BaseballMain {

	final static int EndCount = 3;
	
	public static void main(String[] args) {
//		final int ENDcount = 3;
		// boolean isFinish = false;
		RandomNumber randomNumber = new RandomNumber();
		int[] userDigit = new int[EndCount];
		// System.out.println("컴퓨터의 랜덤숫자는..");
		// randomNumber.makeRandomNumber();
		System.out.println("");
		System.out.println("3자리 랜덤숫자를 맞춰보세요.");
		Scanner sc = new Scanner(System.in);
		randomNumber.makeRandomNumber();

			for (int i = 0; i < userDigit.length; i++) {
				System.out.println("");
				System.out.println(i + " 숫자입력:");
				try
				{
					userDigit[i] = Integer.parseInt(sc.next()); // 숫자만 입력받게 예외코드 작성 필요.
				}
				catch(NumberFormatException nfe)
				{
					System.out.println("잘못된 입력");
					i--;
				}
				//System.out.println();
			
			//System.out.println("새로운 게임을 시작");
			}
			CompareNum compareNum = new CompareNum();
			// isFinish = compareNum.compareNum(userDigit,
			// randomNumber.getRandomNumber());
			compareNum.compareNum(userDigit, randomNumber.getRandomNumber());
		} //End of While4
	} // End of Main