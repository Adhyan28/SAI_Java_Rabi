package basic_program.Assign_15;

public class Retunr_Positive {

	public static void main(String[] args) {
		int[] array = {12,-11,99,11,23,-44};
		int count=0;
		for(int index=0;index<array.length;index++) {
			if(array[index]>0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
