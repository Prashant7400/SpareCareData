package Practice;

public class ThisKeyword2 {
	
	
	
	public ThisKeyword2(){
		System.out.println("Hello");
	}
	
	public ThisKeyword2(int x){
		this();
		System.out.println(x);
	}
	

	public static void main(String[] args) {
		
		ThisKeyword2 tk = new ThisKeyword2(7474);
		


	}

}
