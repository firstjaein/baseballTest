package baseballPractice;
import java.util.Random;

public class Computer {
	int[] comDigit = null;
	public void comNum() {
		Random random = new Random();
		comDigit = new int[3];
		for (int i = 0; i < comDigit.length; i++) {
			comDigit[i] = random.nextInt(9) + 1;
			//System.out.print(comDigit[i]);	
		}//end of for
	}
	
	public int[] getComNum()
	{
		return this.comDigit;
	}
}