package basic_program.Assign_13;

import java.util.Scanner;

public class Unique {
	
	int oc(String lower_name, char ch) {
		int count=0;
		for(int fre=0;fre<lower_name.length();fre++) {
			
		}
		
		return count;
	}
	
	void GetName(String name) {
		String lower = name.toLowerCase();
		for(int index=0;index<lower.length();index++) {
			char ch = lower.charAt(index);
			if(index==lower.indexOf(ch)) {
				if(lower.indexOf(ch)==lower.lastIndexOf(ch)) {
					System.out.println("Unique Character is : "+ch);
				}
			}
		}
	}

	public static void main(String[] args) {
		Unique un = new Unique();
		Scanner sc = new Scanner(System.in);
		un.GetName(sc.next());
		
	}
}
