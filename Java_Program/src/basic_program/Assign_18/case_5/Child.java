package basic_program.Assign_18.case_5;

public class Child extends Parent{
	
	int y=50;
	int z=70;
	
	void m2() {
		System.out.println("Hi from Child m2");
	}
	
	void m3() {
		System.out.println("Hi from Child m3");
	}
	
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		p=c;
		System.out.println(p.x);
		System.out.println(p.y);
		System.out.println(p.z); 
		
		p.m1();
		p.m2();
		p.m3();
	}

}
