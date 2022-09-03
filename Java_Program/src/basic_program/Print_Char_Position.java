package basic_program;

public class Print_Char_Position {
	
	void Position(String name) {
		for(int index=0;index<name.length();index++) {
			if(index%2!=0) {
				System.out.print(name.charAt(index));
				
			}
		}System.out.println();
	}
	
	void Vowel(String name) {
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index)=='a'||name.charAt(index)=='e'||name.charAt(index)=='i'||name.charAt(index)=='o'||name.charAt(index)=='u') {
				System.out.print(name.charAt(index));
				
			}
		}System.out.println();
	}

	public static void main(String[] args) {
		new Print_Char_Position().Position("technocredits");
		new Print_Char_Position().Vowel("technocredits");
		
	}
}
