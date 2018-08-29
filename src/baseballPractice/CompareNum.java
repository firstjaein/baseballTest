package baseballPractice;

public class CompareNum {
	
	public int checkStrike(int[] fNum, int[] sNum) {
		int stCnt = 0;

		for (int i = 0; i < fNum.length; i++) {
			for (int j = 0; j < sNum.length; j++) {
				if (fNum[i] == sNum[j] && i == j) {
					stCnt++;
				}
			}
		}
		return stCnt;
	}

	public int checkBall(int[] fNum, int[] sNum) {

		int ballCnt = 0;

		for (int i = 0; i < fNum.length; i++) {
			for (int j = 0; j < sNum.length; j++) {
				if (fNum[i] == sNum[j] && i != j) {
					ballCnt+=1;
				}
			}
		}
		return ballCnt;
	}
	public boolean compareNum(int[] fNum, int[] sNum) {
		

		int stCnt = checkStrike(fNum, sNum);
		int ballCnt = checkBall(fNum, sNum);

		if (stCnt == BaseballMain.EndCount) {
			System.out.println("정답!컴퓨터의 입력값은 " + sNum[0] + "" + sNum[1] + "" + sNum[2]);
			return true;
		} else {
			System.out.println((ballCnt + stCnt) == 0 ? "nothing" : (ballCnt + " ball," + stCnt + " strike."));
			return false;
		} // End of if
	} // End of compareNum
}