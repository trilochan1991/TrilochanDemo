package Sample1;

public class RemoveDuplicateCharInArray {

	public static void main(String[] args) {
		String stringWithDuplicates = "afsjeadrffafvgdefeverhfgberAAad";
		char[] characters = stringWithDuplicates.toCharArray();
		int length = characters.length;
		System.out.println("String with duplicates : " + stringWithDuplicates);
		for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (characters[i] == characters[j]) {
                    int temp = j;//set duplicate element index
 
                    //delete the duplicate element by shifting the elements to left
                    for (int k = temp; k < length-1; k++) {
                    	characters[k] = characters[k + 1];
                    }
                    j--;
                    length--;//reduce char array length
 
                }
            }
		}
		
		for(int l = 0; l < length;l++){
			
			System.out.print(characters[l]);
		}
	}

}
