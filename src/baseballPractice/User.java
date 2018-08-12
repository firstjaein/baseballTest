package baseballPractice;

public class User {
	private static final int ENDcount = 3;
	int[] userDigit = null;
//	public void userNum() {
//		Random random = new Random();
//		userDigit = new int[ENDcount];
//			for (int i = 0; i < userDigit.length; i++) {
//			userDigit[i] = random.nextInt(9) + 1;
//			System.out.print(userDigit[i]);
//		}
//	}
	
	public int[] getUserNum(){
		return this.userDigit;
	}	
}