package basic_program;

public class Week {
	
	
	void indexNo(int index) {
		if(index>=1 || index<=5) {
			switch(index) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;	
			}
		}
		if(index>=6 || index<=7) {
			switch(index) {
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			}
		}
		if(index<=0 || index>=8) {
			System.out.println("Invalid Index");
		}
		
	}
	
	public static void main(String[] args) {
		Week week1 = new Week();
		week1.indexNo(2);
		week1.indexNo(6);
		week1.indexNo(8);
		week1.indexNo(0);
		week1.indexNo(-1);
	}

}
