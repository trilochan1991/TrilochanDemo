package Sample1;

public class SplitString {

	public static void main(String[] args) {
		
		String str = "My name is trilochan pradhan i am staying in hyderabad";
		String dtrarr[] = str.split(" ");		
		System.out.println(dtrarr.length);
		for(int i = 0; i<dtrarr.length;i++){
			System.out.println(dtrarr[i]);
		}
		
		StringBuffer dtrb = new StringBuffer(str);
		StringBuffer g =  dtrb.reverse();
		System.out.println(g);

	}

}
