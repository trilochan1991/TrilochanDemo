package Sample1;

public class shortingstringchar {

	public static void main(String[] args) {
		
		String strb = "trilochan";
		char temp = 0;
		char tri[] = strb.toCharArray();
		
		for(int i=0;i<tri.length;i++){
			 
			for(int j= i+1; j<tri.length;j++){
				
				if((tri[i]-tri[j])>0){
					
					temp = tri[i];
					tri[i] = tri[j];
					tri[j] = temp;					
				}
			}			
		}
		System.out.println(tri);

	}

}
