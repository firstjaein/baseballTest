package baseballPractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class testValidateNumberTwo {

	public static void main(String[] args) {

		System.out.println("������ �Է��ϼ���.");
		Scanner input = new Scanner(System.in);
		int number = 0;

		while (true) {
			try {
				number = input.nextInt();
				break;
			} catch (InputMismatchException ime) {
				System.out.println("�߸��� �Է��Դϴ�.������ �Է��ϼ���.");
			} catch (Exception e) {
			}
		}
	}
}
