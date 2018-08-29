package baseballPractice;

import java.util.ArrayList;
import java.util.List;

public class CompareNum {
	public boolean compareNum(int[] fNum, int[] sNum) {
		int fNumCnt = fNum.length; // user's digit
		int sNumCnt = sNum.length; // com's random digit
		int ballCnt = 0; // ball count
		int stCnt = 0; // strike count

		List<Integer> alist = new ArrayList<Integer>();
		for (int i : fNum) {
			alist.add(i);
		}
		int idx = sNum.length;
		for (int i = 0; i < idx; i++) {
			if (alist.contains(sNum[i])) {
				if (alist.get(i) == sNum[i]) {
					stCnt++;
				} else {
					ballCnt++;
				}
			}
		}

		if (stCnt == BaseballMain.EndCount) {
			System.out.println("정답!컴퓨터의 입력값은 " + sNum[0] + "" + sNum[1] + "" + sNum[2]);
			return true;
		} else {
			System.out.println((ballCnt + stCnt) == 0 ? "nothing" : (ballCnt + " ball," + stCnt + " strike."));
			return false;
		} // End of if
	} // End of compareNum
}