package basic_program.Assign_17;

public class MaxVowel {
	
	int GetCountofVowel(String name) {
		int vowelCount=0;		
		for(int charindex=0;charindex<name.length();charindex++) {
			if(name.charAt(charindex)=='a'||name.charAt(charindex)=='e'||name.charAt(charindex)=='i'||name.charAt(charindex)=='o'||name.charAt(charindex)=='u') {
				vowelCount++;							
			}				
		}		
		return vowelCount;
	}
	
	void GetName(String[] arr) {
		int max=0;
		int count=0;
		String position = null;
		String maxVowelName = null;
		for(int index=0;index<arr.length;index++) {
			position = arr[index];
			count = GetCountofVowel(position);
			if(max<count) {
				max=count;
				maxVowelName = arr[index];
			}			
		}
		System.out.print("Name having maximum vowel is : ");
		System.out.println(maxVowelName+" -> "+max);
		
	}
	
	public static void main(String[] args) {
		MaxVowel mv = new MaxVowel();
		String[] array = {"hi","priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
		mv.GetName(array); 
	}
}
