package baseballPractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class testValidateNumberTwo {

	public static void main(String[] args) {

		System.out.println("정수를 입력하세요.");
		Scanner input = new Scanner(System.in);
		int number = 0;

		while (true) {
			try {
				number = input.nextInt();
				break;
			} catch (InputMismatchException ime) {
				System.out.println("잘못된 입력입니다. 정수만 입력 하세요.");
			} catch (Exception e) {
			}
		}
	}
}