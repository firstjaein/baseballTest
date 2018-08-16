package baseballPractice;
import java.util.Random;

//중복없는 난수 생성
public class RandomNumber {

//	final int ENDcount = 3;
	int comDigit[] = new int[BaseballMain.EndCount];

	public void makeRandomNumber() {
		Random random = new Random();

		for (int i = 0; i < BaseballMain.EndCount; i++) {
			comDigit[i] = random.nextInt(9) + 1;
			for (int j = 0; j < i; j++) {
				if (comDigit[i] == comDigit[j]) {
					i--;
				}
			}
		}
		for (int k = 0; k < BaseballMain.EndCount; k++) {
			System.out.print(comDigit[k] + " ");
		}
	} // End of makeRandomNumber

	public int[] getRandomNumber() {
		return this.comDigit;
	}
}