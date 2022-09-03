package basic_program;

import java.util.Scanner;

public class PrintCharacter {
	
	void character(String s) {
		for(int position=0; position<=s.length();position++) {
			char ch = s.charAt(position);
			System.out.println(ch);
		}
	}
	
	public static void main(String[] args) {
		PrintCharacter printcharacter = new PrintCharacter();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printcharacter.character(str);
		sc.close();
	}

}
