package basic_program.Assign_13;

import java.util.Scanner;

public class Duplicate {
	
	void name(String name) {
		String lower = name.toLowerCase();
		for(int index=0;index<lower.length();index++) {
				char ch = lower.charAt(index);
				if(index==lower.indexOf(ch)) {
					if(lower.indexOf(ch)!=lower.lastIndexOf(ch)) {
						System.out.println("Duplicate charracter are : "+name.charAt(index));						
				}
			}
		}
	}
	

	public static void main(String[] args) {
		Duplicate dc = new Duplicate();
		Scanner sc = new Scanner(System.in);
		dc.name(sc.next());
	}
}
