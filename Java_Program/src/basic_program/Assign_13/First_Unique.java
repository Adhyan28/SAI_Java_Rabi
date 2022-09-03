package basic_program.Assign_13;

import java.util.Scanner;

public class First_Unique {
	
	int occ(String name,char ch) {
		int count=0;
		for(int fre=0;fre<name.length();fre++) {
			if(ch==name.charAt(fre)) {
				count++;
			}			
		}		
		return count;
	}
	
	void GetName(String name) {
		String lower = name.toLowerCase();
		for(int index=0;index<lower.length();index++) {
			char ch = name.charAt(index);
			int Occurrence = occ(lower,ch);
			if(Occurrence==1) {
				System.out.println("First Unique Character is : "+ch);
				break;
			}
		}		
	}

	public static void main(String[] args) {
		First_Unique fu = new First_Unique();
		Scanner sc = new Scanner(System.in);
		fu.GetName(sc.next());
		
	}
}
