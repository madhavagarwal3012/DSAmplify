package fundamentals;

import java.util.Scanner;

public class Fibonacci_Series {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		long number = s.nextLong();
		s.close();
		
		long number1=0;
		long number2=1;
		long sum=0;
		
		while(number1 <= number){
			System.out.println(number1);
			sum = number1 + number2;
			number1 = number2;
			number2 = sum;

		}	
	}
}

