package baseballPractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class testValidateNumberTwo {

	public static void main(String[] args) {

		System.out.println("정수를 입력하세요.");
		Scanner input = new Scanner(System.in);
		int number = 0;
		
		try{
			number = input.nextInt();
		}catch(InputMismatchException ime){
			System.out.println("잘못된 입력입니다.정수만 입력하세요.");
		}
		System.out.println("입력한 정수는: "+ number +"입니다.");
	}
}
