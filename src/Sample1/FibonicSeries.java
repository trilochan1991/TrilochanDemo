package Sample1;

public class FibonicSeries {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 1;
		int k = 0;
		System.out.print(a);
		while(k <= 10){				
			System.out.print(b);
			k = a+b;
			a = b;
			b = k;			
		}			
	}

}
