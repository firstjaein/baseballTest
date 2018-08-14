package baseballPractice;

public class CompareNum {
	public boolean compareNum(int[] fNum, int[] sNum) {
		final int ENDcount = 3;
		int fNumCnt = fNum.length;	//user's digit
		int sNumCnt = sNum.length;	//com's random digit
		int ballCnt = 0; // ball count
		int stCnt = 0; // strike count
		for (int i = 0; i < fNumCnt; i++) {
			for (int j = 0; j < sNumCnt; j++) {
				if (fNum[i] == sNum[j] && i == j) {
					stCnt++;
				}
				ballCnt++;
			}
		}

		if (stCnt == ENDcount) {
			System.out.println("컴퓨터의 입력값은 :" + sNum[0] + "" + sNum[1] + "" + sNum[2]);
			return true;
		} else {
			System.out.println((ballCnt + stCnt) == 0 ? "nothing" : (ballCnt + " ball," + stCnt + " strike."));
			return false;
		} // End of if
	} // End of compareNum
}