package basic_program.Assign_18.case_6;

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
		Parent p = new Child();
		Child c = new Child();
		c=p;
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.z); 
		
		c.m1();
		c.m2();
		c.m3();
	}

}
