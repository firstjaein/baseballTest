package baseballPractice;

import java.util.Scanner;

public class BaseballMain {

	final static int EndCount = 3;
	
	public static void main(String[] args) {
//		final int ENDcount = 3;
		// boolean isFinish = false;
		RandomNumber randomNumber = new RandomNumber();
		int[] userDigit = new int[EndCount];
		// System.out.println("��ǻ���� �������ڴ�..");
		// randomNumber.makeRandomNumber();
		System.out.println("");
		System.out.println("3�ڸ� �������ڸ� ���纸����.");
		Scanner sc = new Scanner(System.in);
		randomNumber.makeRandomNumber();

			for (int i = 0; i < userDigit.length; i++) {
				System.out.println("");
				System.out.println(i + " �����Է�:");
				try
				{
					userDigit[i] = Integer.parseInt(sc.next()); // ���ڸ� �Է¹ް� �����ڵ� �ۼ� �ʿ�.
				}
				catch(NumberFormatException nfe)
				{
					System.out.println("�߸��� �Է�");
					i--;
				}
				//System.out.println();
			
			//System.out.println("���ο� ������ ����");
			}
			CompareNum compareNum = new CompareNum();
			// isFinish = compareNum.compareNum(userDigit,
			// randomNumber.getRandomNumber());
			compareNum.compareNum(userDigit, randomNumber.getRandomNumber());
		} //End of While4
	} // End of Main