package basic_program;

public class Repeat_EX1 {
	
	void repeat(String name) {
		for(int index=0;index< name.length();index++) {
			char ch = name.charAt(index);
			if(index==name.indexOf(ch)) {
				if(name.indexOf(ch)!=name.lastIndexOf(ch)) {
					System.out.println(ch+" is Duplicate");
				}
			}
		}
		
	}

	public static void main(String[] args) {
		new Repeat_EX1().repeat("technocretid");
	}
}
