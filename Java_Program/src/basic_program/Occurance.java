package basic_program;

public class Occurance {
	
	int occ(String input,char ch) {
		int count = 0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i) == ch)
				count++;
		}
		//System.out.println(count);
		return count++;
	}
	
	void name(String name) {
		String lower = name.toLowerCase();
		for(int i=0;i<lower.length();i++) {
			int ob = occ(lower,lower.charAt(i));
			System.out.println("Character of "+lower.charAt(i)+" is time :"+ob);
			if(ob==1) {
				System.out.println(lower.charAt(i));
				break;
			}
			if(ob==2) {
				System.out.println(lower.charAt(i));
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Occurance occurance = new Occurance();		
		occurance.name("Ashokkumarshaw");
		
	}
}


