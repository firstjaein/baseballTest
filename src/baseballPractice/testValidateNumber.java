package baseballPractice;

import java.util.Scanner;

public class testValidateNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("0�� ������ ���ڸ� ���ڸ� �Է��ϼ���. ���ڸ� �Է��ϸ� ������ �վ��.");
		while (!scan.hasNextInt()) {
			scan.next();
			System.err.print("����! ���ڰ� �ƴմϴ�. \n�� ���� : ");
		} // End of while
		scan.nextLine();
		int scanNumber = scan.nextInt();
		System.out.println("�Է��� ���ڴ�: " + scanNumber);
	}
}