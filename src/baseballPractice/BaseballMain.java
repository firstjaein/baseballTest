package baseballPractice;
import java.util.Scanner;
public class BaseballMain {

	public static void main(String[] args) {
		
		boolean isFinish = false;
		// Instance of Computer
		Computer com = new Computer();
		// Instance of User
		//User user = new User();
		int[] userDigit = new int[3];
		System.out.print("Computer's choice is : ");
		com.comNum();
		System.out.println("");
		System.out.print("User's choice is : ");
		//user.userNum();
		Scanner sc = new Scanner(System.in);
		while(!isFinish)
		{
			System.out.println("숫자입력");
			for(int i = 0; i < userDigit.length; i++)
			{
				System.out.println(i + " 숫자입력:");
				userDigit[i] = sc.nextInt();
			}
			isFinish = compareNums(userDigit, com.getComNum());
		}
	}
	
	public static boolean compareNums(int[] fNum, int[] sNum)	
	{
		int fNumCnt = fNum.length;
		int sNumCnt = sNum.length;
		int ballCnt = 0;
		int stCnt = 0;
		for(int i = 0; i < fNumCnt; i++)
		{
			
			for(int j =0; j < sNumCnt;  j++)
			{
				if(fNum[i] == sNum[j])
				{
					if(i == j )
					{
						stCnt++;
					}
					else
					{
						ballCnt++;
					}
				}
			}
		}
		if(stCnt == 3)
		{
			System.out.println("컴퓨터의 입력값은 :" +sNum[0]+""+sNum[1]+""+sNum[2]);
			System.out.println("정답");
			return true;
		}
		else
		{
			System.out.println((ballCnt+stCnt) == 0 ? "noting" : (ballCnt+" ball," + stCnt+ " strike."));
			return false;
		}
		
	}
}