package basic_program;

public class First_Non_Repeat {
	
	void FNR(String name) {
		int count = 0;
		String lower = name.toLowerCase();
		for(int i=0;i<=lower.length();i++){
			char ch = name.charAt(i);
			for(int j=0;j<lower.length();j++) {
				if(ch==name.charAt(j)) {
					count++;
					if(count==1) {
						System.out.println("First Repeat Character : "+name.charAt(i));
						break;
					}if(count>=2) {
						System.out.println("First Non Repeat Character : "+name.charAt(i));
						break;
					}			
				}				
			}
			/*if(count<2) {
				System.out.println("First Non Repeat Character : "+name.charAt(i));
				break;
			}if(count>1) {
				System.out.println("First Repeat Character : "+name.charAt(i));
				break;
			}*/			
			//count=0;
		}
	}
	
	void Count(String charat,int no) {
		System.out.println(no);
	}
	
		
	public static void main(String[] args) {
		First_Non_Repeat fnr = new First_Non_Repeat();
		fnr.FNR("technocredit");
		
	}

}
