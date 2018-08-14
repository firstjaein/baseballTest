//package baseballPractice;
//
//import java.util.Random;
//
//public class Computer {
//	final int ENDcount = 3;
//	int[] comDigit = null;
//
//	public void comNum() {
//		Random random = new Random();
//
//		comDigit = new int[ENDcount];
//		for (int i = 0; i < comDigit.length; i++) {
//			comDigit[i] = random.nextInt(9) + 1;
//			System.out.print(comDigit[i] + " ");
//		}
//	}// End of comNum
//
//	public int[] getComNum() {
//		return this.comDigit;
//	}
//}