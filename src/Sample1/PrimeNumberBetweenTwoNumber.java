package Sample1;

public class PrimeNumberBetweenTwoNumber {
	
	public static void primenumbercount(int firstnum, int secnum){
		
		boolean flag = true;
		
		for(int i = firstnum; i<=secnum;i++){
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag = false;
					break;
				}
				flag = true;
			}
			
			if(flag){
				System.out.println("prime number" + i);
			}
		}
	}

	public static void main(String[] args) {
		primenumbercount(3,100);

	}

}
