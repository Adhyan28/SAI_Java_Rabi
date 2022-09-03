package basic_program;

public class Seven {
	
	void evenNumber(int StartIndex, int EndIndex) {
				System.out.print("Even number are : ");
		for(int even=StartIndex; even<=EndIndex; even++) {				
			if(even%2==0) {				
				System.out.print(even+",");				
			}
		}
				System.out.println();
	}
	
	void Divisibleby5(int StartIndex, int EndIndex) {
				System.out.print("Divident by 5 number are : ");
		for(int dividend=StartIndex; dividend<=EndIndex; dividend++) {
			if(dividend%5==0) {
				System.out.print(dividend+",");
			}
		}
				System.out.println();
	}
	
	void DivisiablebyMul(int StartIndex, int EndIndex) {
				System.out.print("Divident by 3 & 5 number are : ");
		for(int divident=StartIndex; divident<=EndIndex; divident++) {
			if(divident%5==0 && divident%3==0) {
				System.out.print(divident+",");
			}
		}
				System.out.println();
	}
	
	void Divisiableby7and13(int StartIndex, int EndIndex){
			//System.out.print(false);
		for(int divident = StartIndex; divident<=EndIndex; divident++) {
			if(divident%7==0) {
				System.out.println(divident+"is divisible by 7");
			}
			if(divident%13==0) {
				System.out.println(divident+"is divisible by 13");
			}
		}
	}
	
	void sum(int StartIndex, int EndIndex) {
		int sum = 0;
		for(int range=StartIndex; range<=EndIndex; range++) {
			sum = sum+range;			
		}
		System.out.println("Total Sum is "+sum);
	}
	
	void Odd_Even_Sum(int StartIndex, int EndIndex){
		int Even=0,Odd=0, Total=0;
		for(int num=StartIndex; num<=EndIndex; num++) {
			if(num%2==0) {
				Even=Even+num;
			}else {
				Odd=Odd+num;
			}
		}
		System.out.println("Even Sum : "+Even);
		System.out.println("Odd Sum : "+Odd);
		Total = Odd-Even;
		System.out.println("Total is : "+Total);
	}
	
	void reverse(int StartIndex, int EndIndex) {
		for(int num=EndIndex; num>=StartIndex; num--) {
			if(num%2!=0) {
				System.out.println("Odd reverse : "+num);
			}
		}
	}
	
	public static void main(String[] args) {
		Seven seven1 = new Seven();
		seven1.evenNumber(1, 6);
		seven1.Divisibleby5(1, 10);
		seven1.DivisiablebyMul(1, 16);
		seven1.Divisiableby7and13(1, 16);
		seven1.sum(1, 5);
		seven1.Odd_Even_Sum(1, 5);
		seven1.reverse(10, 20);
		
	}

}
