package basic_program.Assign_18.case_1;

public class Child extends Parent{
	
	int y=50;
	int z=95;
	
	void m1() {
		System.out.println("Hi from Child m1");
	}
	
	void m3() {
		System.out.println("Hi from Child m3");
	}
	
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.x);
		System.out.println(p.y);
		//System.out.println(p.z);
		
		p.m1();
		p.m2();
		//p.m3();
	}

}
