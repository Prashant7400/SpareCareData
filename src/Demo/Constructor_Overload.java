package Demo;

public class Constructor_Overload {

	int id;
	String name;
	int age;
	
	
	public Constructor_Overload(int i,String s) {
	
		id =i;
		name =s;
		System.out.println(id+" "+name);
	}
	
	public Constructor_Overload(int i,String s,int j) {
		
		id =i;
		name =s;
		age = j;
		System.out.println(id+" "+name+" "+age);
	}
	
	
	
	public static void main(String[] args) {
		
		Constructor_Overload co = new Constructor_Overload(1, "Prashant");
		Constructor_Overload co1 = new Constructor_Overload(2, "Ashish",24);
		

	}

}
