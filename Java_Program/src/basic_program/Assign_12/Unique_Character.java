package basic_program.Assign_12;

import java.util.Scanner;

public class Unique_Character {
	
	int occ(String name,char ch) {
		int count=0;
		for(int fre=0;fre<name.length();fre++) {
			if(ch==name.charAt(fre)) {
				if(name.indexOf(ch)==name.lastIndexOf(ch)) {
					count++;
				}				
			}
		}		
		return count;
	}
	
	void unique(String name) {
		String lower = name.toLowerCase();
		for(int index=0;index<lower.length();index++) {
			char ch = lower.charAt(index);
			int observation = occ(lower,ch);
			if(observation==1) {
				System.out.println("First Non Repeating character is : "+name.charAt(index));
				break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		new Unique_Character().unique(sc.next());
	}
}
