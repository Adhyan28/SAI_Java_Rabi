package basic_program.Assign_13;

import java.util.Scanner;

public class First_Duplicate {
	
	int occ(String name,char ch) {
		int count=0;		
		for(int fre=0;fre<name.length();fre++) {
			if(ch==name.charAt(fre)) {
				if(name.indexOf(ch)!=name.lastIndexOf(ch)) {						
					count++;					
				}
				
			}
		}		
		return count;
	}
	
	void GetName(String name) {
		String lower = name.toLowerCase();
		for(int index=0;index<lower.length();index++) {
			char ch = lower.charAt(index);
			int occurrence = occ(lower,ch);
			if(occurrence>=2) {
				System.out.println("First Duplicate is : "+lower.charAt(index));
				break;
				
			}			
		}
	}

	public static void main(String[] args) {
		First_Duplicate dc = new First_Duplicate();
		Scanner sc = new Scanner(System.in);
		dc.GetName(sc.next());
	}
}
