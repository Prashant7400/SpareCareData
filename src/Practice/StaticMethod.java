package Practice;

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = StaticMethod.multi(5);
		System.out.println(result);

	}

	static int multi(int x) {
		return x*x*x;
	}
}
