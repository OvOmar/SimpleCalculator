package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Omars calculator ");
		System.out.println("Please enter two integers to  calulcate the sum difference product and division ");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		System.out.println(("The sum is equal to " + addition(x, y)));
		System.out.println(("The difference is equal to " + subtraction(x, y)));
		System.out.println(("The product is equal to " + multiplication(x, y)));
		System.out.println(("The division is equal to " + division(x, y)));
	}


	


public static int addition(int x , int y) {
	int answer; 
	answer = x + y;
	return answer;	
}

public static int subtraction(int x , int y) {
	int answer; 
	answer = x - y;
	return answer;	
}

public static int multiplication(int x , int y) {
	int answer; 
	answer = x * y;
	return answer;	
}
public static int division(int x , int y) {
	int answer; 
	answer = x / y;
	return answer;	
}



}