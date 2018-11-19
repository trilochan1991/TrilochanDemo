package Sample1;

public class Matrix {

	public static void main(String[] args) {
		
		int i[][] =  {{1,4,5},{4,8,9},{5,3,5}};
		int j[][] = new int[3][3];
		int add[][] = new int[3][3];
		
		for(int a=0;a<i.length;a++){
			
			for(int b=0;b<i[a].length;b++){
				
				System.out.print(i[a][b] + " ");
				
			}
			
			System.out.println();
		}
		
		System.out.println("=====================================");
		
		for(int a=0;a<i.length;a++){
			
			for(int b=0;b<i[a].length;b++){
				
				j[b][a] = i[b][a];
				
				System.out.print(j[b][a] + " ");
				
			}
			
			System.out.println();
		}
		
		System.out.println("=====================================");
		
for(int a=0;a<i.length;a++){
			
			for(int b=0;b<i[a].length;b++){
				
				add[a][b] = i[a][b] + j[a][b];
				
				System.out.print(add[a][b] + " ");
				
			}
			
			System.out.println();
		}							

	}

}
