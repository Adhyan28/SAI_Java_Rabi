package basic_program.Assign_16;

import java.util.Scanner;

public class VowelCount {
	
	int VowelCountofName(String name) {
		int countVowel=0;
		for(int count=0;count<name.length();count++) {
			if(name.charAt(count)== 'a'|| name.charAt(count)=='e'||name.charAt(count)=='i'||name.charAt(count)=='o'||name.charAt(count)=='u') {
				countVowel++;
			}
		}
		return countVowel;
	}
	
	void GetName(String[] arr) {
		for(int index=0;index<arr.length;index++) {
			int count = VowelCountofName(arr[index]);
			System.out.println(arr[index]+" : "+count);
		}
		
	}
	
	public static void main(String[] args) {
		VowelCount vc = new VowelCount();
		String[] array = {"priyanka", "swati", "acharya", "hevin"};		
		vc.GetName(array);
	}

}
