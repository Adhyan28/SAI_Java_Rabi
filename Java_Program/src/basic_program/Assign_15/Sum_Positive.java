package basic_program.Assign_15;



public class Sum_Positive {
	
	

	public static void main(String[] args) {
		int[] array = {10,20,-33,-55,2};
		int sum=0;
		for(int index=0;index<array.length;index++) {
			if(array[index]>0) {
				sum = sum +array[index];
			}
		}
		System.out.println("Sum : "+sum);
	}
}
