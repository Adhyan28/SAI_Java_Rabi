package basic_program.Assign_15;

import java.util.Scanner;

public class Maximum_Array {

	public static void main(String[] args) {
		//Maximum_Array ma = new Maximum_Array();
		//Scanner sc = new Scanner(System.in);
		int[] array = {13,2,3};
		int max = array[0];
		for(int index=0;index<array.length;index++) {
			if(array[index]>max) {
				max=array[index];
			}			
		}	
		System.out.println(max);
	}
}
