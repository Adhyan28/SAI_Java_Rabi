package basic_program;

public class class6 {
	static int var=12;
	
	public static void main(String[] args) {
		while(var >=0) {
			if(var % 3 == 0) {
				var/=3;
				var-=3;
			}else {
				var/=2;
				var-=2;
			}
		}
		System.out.println(var);
	}
	

}
