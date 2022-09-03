package basic_program.Assign_17;

public class Triplets {
	
	void GetNum(int[] arr) {
		int temp=0;
		for(int index=0;index<arr.length-2;index++) {
			temp = arr[index];
			
			if(temp+1==arr[index+1] && temp+2==arr[index+2]) {
				System.out.println(arr[index]+"->"+arr[index+1]+"->"+arr[index+2]);
			}			
		}		
	}
	
	public static void main(String[] args) {
		Triplets tr = new Triplets();
		int[] array = {10,13,14,15,16,19,20,22,23,24};
		tr.GetNum(array);
	}
}
