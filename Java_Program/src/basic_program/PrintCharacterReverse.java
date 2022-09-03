package basic_program;

import java.util.Scanner;

public class PrintCharacterReverse {
	
	void reversecharacter(String input) {
		int ln = input.length();
		for(int num=input.length()-1; num>=0; num--) {
			char ch = input.charAt(num);
			System.out.println(ch);
		}
	}
	
	public static void main(String[] args) {
		PrintCharacterReverse printChar = new PrintCharacterReverse();
		Scanner sc = new Scanner(System.in);		
		printChar.reversecharacter(sc.nextLine());
		sc.close();
	}
}
