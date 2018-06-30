package Sample1;

public class FectorialLogic {
	
	public static int a = 1;
	public static int fectorial = 10;

	public static void main(String[] args) {
		
		for(int i = 1; i<=fectorial;i++ ){
			a = a*i;
		}
		System.out.println(a);
	}

}
