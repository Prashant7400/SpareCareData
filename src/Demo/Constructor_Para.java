package Demo;

public class Constructor_Para {

	int id;
	String name;

	public Constructor_Para(int i, String s) {
		System.out.println("Hi");
		id = i;
		name = s;
		System.out.println(id + "  " + name);

	}

	public static void main(String[] args) {

		Constructor_Para cp = new Constructor_Para(1, "Prashant");
		Constructor_Para cp1 = new Constructor_Para(2, "Ashish");

	}
}
