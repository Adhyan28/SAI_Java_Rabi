package basic_program.Assign_15;

public class Even_Positive {

	public static void main(String[] args) {
		int[] array = {10,13,-14,-20,22,3};
		int sum=0;
		for(int index=0;index<array.length;index++) {
			if(array[index]>0) {
				if(array[index]%2==0) {
					sum = sum + array[index];
				}
			}
		}
		System.out.println("Sum of Even : "+sum);
	}
}
