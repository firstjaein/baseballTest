package baseballPractice;

import java.util.Random;

public class RandomNumber {

	int comDigit[] = new int[BaseballMain.EndCount];

	public void makeRandomNumber() {
		Random random = new Random();
		for (int i = 0; i < BaseballMain.EndCount; i++) {
			comDigit[i] = random.nextInt(9) + 1;
			for (int j = 0; j < i; j++) {	//중복 숫자 생성 방지
				if (comDigit[i] == comDigit[j]) {
					i--;
				}
			}
		} // End of for
		for (int k = 0; k < BaseballMain.EndCount; k++) {	//중복없는 랜덤숫자 배열 생성
			System.out.print(comDigit[k] + " ");
		}
	} // End of makeRandomNumber

	public int[] getRandomNumber() {
		return this.comDigit;	//메인에서 중복없는 랜덤숫자 배열 호출
	}
}