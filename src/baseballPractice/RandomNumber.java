package baseballPractice;

import java.util.Random;

//중복없는 난수 생성
public class RandomNumber {

	public static final int ENDcount = 3;
	int comDigit[] = new int[ENDcount];
	public void makeRandomNumber(){
		Random random = new Random();
		

		for (int i = 0; i < ENDcount; i++) {
			comDigit[i] = random.nextInt(9) + 1;
			for (int j = 0; j < i; j++) {
				if (comDigit[i] == comDigit[j]) {
					i--;
				}
			}
		}
		for (int k = 0; k < ENDcount; k++) {
			System.out.print(comDigit[k] + " ");
		}
	}//End of getRandomNumber
	
	public int[] getRandomNumber(){
		return this.comDigit;
	}
}
