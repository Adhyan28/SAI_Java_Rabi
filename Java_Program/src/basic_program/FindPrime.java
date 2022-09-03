package basic_program;

import java.util.*;

public class FindPrime {
	
	int count,sum, avg,count1,sum1;
	void findPrimeNo(int n,boolean nonPrimePrint) {
		
		boolean flag = false;
		for(int div=2;div<=n/2;div++) {
			if(n%div==0) {
				if(nonPrimePrint==true) {					
					count1++;
					sum1=sum1+n;
						}
				flag=true;
				break;
			}
		}
		if(flag == true)
			System.out.println(+n +" is not a prime number");
		if (flag==false)
		 {
			if(n<2) { 
				System.out.println("INVALID INPUT........plz enter number greater than or equal to 2 !!!");
			}
			else {
			System.out.println(+n +" is a prime number");
			count++;
			sum=sum+n;
			}
		}
	}
	
	
		void findPrimeNoRange(int num1, int num2,boolean nonPrimePrint) {
			if(num1>=2&&num2>num1) {
				for(int start=num1;start<=num2;start++) {
					findPrimeNo(start,nonPrimePrint);
				}
			}else {
				if(num1<2) {
					System.out.println("First Number must be greater than : 2");
				}
				if(num2<=num1) {
					System.out.println("Second num must be greater than 2 & First Number");
				}
			}
			}
			
		
	void totalPrimeNumberInRange(int num1, int num2,boolean nonPrimePrint) {
		count=0; count1=0;
		for(int start=num1;start<=num2;start++) {
			findPrimeNo(start,nonPrimePrint);
			}
		System.out.println("Total No. of prime numbers in given range between "+num1+" to "+num2+" is = " +count);
		if(nonPrimePrint==true)
		System.out.println("Total No. of  non prime numbers in given range between "+num1+" to "+num2+" is = " +count1);
		}
	
	void sumOfPrimeNumberInRange(int num1, int num2,boolean nonPrimePrint) {
		sum=0; sum1=0;
		for(int start=num1;start<=num2;start++) {
			findPrimeNo(start,nonPrimePrint);
			}
		System.out.println("Total sum of prime numbers in given range between "+num1+" to "+num2+" is = " +sum);
		if(nonPrimePrint==true)
			System.out.println("Total sum of non prime numbers in given range between "+num1+" to "+num2+" is = " +sum1);
		}
	
	void averageOfPrimeNumberInRange(int num1, int num2,boolean nonPrimePrint) {
		sum=0; sum1=0; 
		count=0;count1=0;
		int avg=0,avg1=0;
		for(int start=num1;start<=num2;start++) {
			findPrimeNo(start,nonPrimePrint);
			}
		System.out.println("Total Average of prime numbers in given range between "+num1+" to "+num2+" is = " +(avg=sum/count));
		if(nonPrimePrint==true)
			System.out.println("Total Average of non prime numbers in given range between "+num1+" to "+num2+" is = "+(avg1=sum1/count1));
		}
	


	public static void main(String[] args) {
		FindPrime fp=new FindPrime();
		System.out.println("Enter first number and last number to find prime number in the given range ");
		System.out.println("Would you like print non prime number also??? if YES type TRUE....if NO type FALSE....");
		Scanner sc =new Scanner(System.in);
		int fnum=sc.nextInt();
		int lnum=sc.nextInt();
		boolean flag=sc.nextBoolean();
		//fp.findPrimeNo(fnum,flag);
		fp.findPrimeNoRange(fnum,lnum,flag);
		//fp.totalPrimeNumberInRange(fnum,lnum,flag);
	    //fp.sumOfPrimeNumberInRange(fnum,lnum,flag);
		//fp.averageOfPrimeNumberInRange(fnum,lnum,flag);
	}

}