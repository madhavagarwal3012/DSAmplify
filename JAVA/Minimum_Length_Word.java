package fundamentals;

import java.util.Scanner;

public class Minimum_Length_Word {
	
	public static String minLengthWord(String input) {
		
		int start=0;
		int end=input.length();
		
		String Previous_minimum="";
		String minimum="";
		
		while(start<end) {
			
			if(input.charAt(start)!=' ') {
				Previous_minimum+=input.charAt(start);
				start++;		
			}
			else {
				start++;
				break;
			}
		}
		while(start<end) {
			if(input.charAt(start)!=' ') {
				minimum+=input.charAt(start);
			}
			else if(minimum.length()<Previous_minimum.length()){
				Previous_minimum=minimum;
				minimum="";
			}
			else {
				minimum="";
			}
			if(start==end-1) {
				if(minimum.length()<Previous_minimum.length()) {
					Previous_minimum=minimum;
					minimum="";
				}
			}
			start++;
			
		}
		return Previous_minimum;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String string = s.nextLine();
		s.close();
		String minimum=minLengthWord(string);
		System.out.print(minimum);
		
		
		

	}

}
