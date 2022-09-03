package basic_program;

public class PrimeNumber {
	
	public static void main(String[] args) {	
		int sum=0;
		int max=0;
		for(int i=2;i<=100;i++) {
			Boolean flag = true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				System.out.println("Prime No: "+i);
			sum=sum+i;
			if(max<i) {
				max=i;				
			}
			
			}
		}
		System.out.println("Total Sum is : "+sum);
		System.out.println("Max Prime number is : "+max);
	}
}
