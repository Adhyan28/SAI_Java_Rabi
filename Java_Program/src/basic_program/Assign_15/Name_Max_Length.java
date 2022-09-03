package basic_program.Assign_15;

public class Name_Max_Length {

	public static void main(String[] args) {		
		
		String user_name = null;
		
		String[] name_array = {"Karan","Shweta","Pallavi","Abhishek","Sagar"};
		for(int index=0;index<name_array.length-1;index++) {			
			if(name_array[index+1].length()>name_array[index].length()) {
				user_name = name_array[index+1];				
			}					
		}System.out.println(user_name);		
	}	
}
