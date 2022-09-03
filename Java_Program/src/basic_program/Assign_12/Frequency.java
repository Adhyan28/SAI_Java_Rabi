package basic_program.Assign_12;

import java.util.Scanner;

public class Frequency {
	
	int occ(String name,char ch) {
		int count=0;
		for(int fre=0;fre<name.length();fre++) {
			if(name.charAt(fre)==ch) {
				count++;
			}
		}
		
		return count;
	}
	
	void sender(String name) {
		String lower = name.toLowerCase();
		for(int index=0;index<lower.length();index++) {
			char ch = lower.charAt(index);
			int observation = occ(lower,ch);
			if(index==lower.indexOf(ch)) {				
			System.out.println("Character of "+name.charAt(index)+" is "+observation);				
			}
		}
		
	}

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		new Frequency().sender(sc.nextLine());
		sc.close();
		
	}
}
