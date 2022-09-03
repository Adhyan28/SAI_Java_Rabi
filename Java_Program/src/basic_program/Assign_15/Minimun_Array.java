package basic_program.Assign_15;

public class Minimun_Array {

	public static void main(String[] args) {
		int[] array = {11,22,33};
		int min = array[0];
		for(int index=0;index<array.length;index++) {
			if(array[index]<min) {
				min=array[min];
			}
		}
		System.out.println(min);
	}
}
