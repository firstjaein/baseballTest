package baseballPractice;
import java.util.Random;

public class User {
	int[] userDigit = null;
	public void userNum() {
		Random random = new Random();
		userDigit = new int[3];
			for (int i = 0; i < userDigit.length; i++) {
			userDigit[i] = random.nextInt(9) + 1;
			System.out.print(userDigit[i]);
		}
	}
	
	public int[] getUserNum()
	{
		return this.userDigit;
	}
	
}