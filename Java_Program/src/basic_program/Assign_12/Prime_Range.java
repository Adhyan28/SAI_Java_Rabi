package basic_program.Assign_12;

import java.util.Scanner;

public class Prime_Range {
	
	void range(int fnum,int lnum) {
		int max=0;
		for(int index=fnum;index<lnum;index++) {
			boolean flag = true;
			for(int check=2;check<=index/2;check++) {
				if(index%check==0) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				System.out.println("Prime No : "+index);
				if(max<index) {
					max=index;	
				}					
			}
		}
		System.out.println("The Max No of Prime is : "+max);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter First & Last number for Prime range");
		new Prime_Range().range(sc.nextInt(),sc.nextInt());
		sc.close();
	}

}
