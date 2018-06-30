package Sample1;

public class secondHigstNumber {
	
	static double k[] = {600,365,9658,45215,4585,25455,357877,8545241,447546,24145,7523,3663};
	static double temp = 0;

	public static void main(String[] args) {
		
		for(int i=0; i < k.length;i++){
			
			for(int j = i+1; j<k.length;j++){
				
				if(k[i] > k[j]){
					
					temp = k[i];
					k[i] = k[j];
					k[j] = temp;
				}
			}			
		}		
		System.out.println(k[k.length-2]);			

	}

}
