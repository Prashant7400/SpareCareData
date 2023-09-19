package Practice;

public class ThisKeyword {
	
	// this keyword in instance variabe

	int rollno;
	String name;
	double percencatge;
	
	
	public static void main(String[] args) {

		ThisKeyword tk = new ThisKeyword(1, "Prashant", 74.74);
		ThisKeyword tk1 = new ThisKeyword(2, "Arjun", 63.63);
//		System.out.println(tk);
//		System.out.println(tk1);
		
		
		
		
		
	}
	
	public ThisKeyword(int rollno,String name, double percentage) {
		
		this.rollno= rollno;
		this.name= name;
		this.percencatge = percentage;
		System.out.println(rollno+" "+name+" "+percentage);
		
	}

}
