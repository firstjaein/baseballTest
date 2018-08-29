package baseballPractice;

import java.util.Scanner;

public class testValidateNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("0을 제외한 한자리 숫자만 입력하세요. 문자를 입력하면 에러가 발생해요.");
		while (!scan.hasNextInt()) {
			scan.next();
			System.err.print("에러! 숫자가 아닙니다. \n재 선택 : ");
		} // End of while
		scan.nextLine();
		int scanNumber = scan.nextInt();
		System.out.println("입력한 숫자는: " + scanNumber);
	}
}