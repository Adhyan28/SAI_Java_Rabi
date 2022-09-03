package basic_program.Assign_14;

import java.util.Scanner;

public class Unique_Duplicate {
	
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
		int count=0;
		int unique=0,duplicate=0;
		for(int index=0;index<lower.length();index++) {
			char ch = lower.charAt(index);
			if(index==lower.indexOf(ch)) {
				int occurrence = occ(lower,ch);
				if(occurrence>=2) {
					duplicate++;
					//System.out.println("Duplicate char are : "+name.charAt(index)+":"+duplicate);
				}else if(occurrence<2) {
					unique++;
					//System.out.println("Unique char are : "+name.charAt(index)+":"+unique);
				}					
			}			
		}
		if(duplicate>unique) {
			System.out.println("Java");					
		}else {
			System.out.println("Selenium");
		}
	}

	public static void main(String[] args) {
		Unique_Duplicate ud = new Unique_Duplicate();
		Scanner sc = new Scanner(System.in);
		ud.GetName(sc.next());
	}
}
