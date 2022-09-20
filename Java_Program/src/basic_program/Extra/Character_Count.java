package basic_program.Extra;

public class Character_Count {
	 
	void Character(String name) {
		int upper=0,lower=0,digit=0;
		for(int index=0; index<name.length(); index++) {
			if(Character.isLetter(name.charAt(index))) {
				if(Character.isUpperCase(name.charAt(index))) {
					upper++;
				}else {
					lower++;
				}
			}else if(Character.isDigit(name.charAt(index))) {
				digit++;				
			}
		}
		System.out.println("Upper Character Letter : "+upper);
		System.out.println("Lower Character Letter : "+lower);
		System.out.println("Total Character Letter : "+(upper+lower));
		System.out.println("Digit Character Letter : "+digit);
	}
	
	public static void main(String[] args) {
		Character_Count cc = new Character_Count();
		cc.Character("Tec1hNOC2redits");
	}
}
