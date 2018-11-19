package Sample1;

public class DuplicateCharInStringCount {
	
	static int distnict = 0;
	
	public static void RepeatcharinString(String Name)
	{
		for(int i = 0; i< Name.length();i++)
		{
			for(int j = 0; j<Name.length();j++)
			{
				if(Name.charAt(i) == Name.charAt(j))
				{
					distnict++;
				}
				
			}
			
			String value  = String.valueOf(Name.charAt(i));
			System.out.println(Name.charAt(i) + " Count is = " + distnict);
			Name = Name.replaceAll(value, "");
			distnict = 0;
		}
		
	}

	public static void main(String[] args)
	{
		RepeatcharinString("fghfgfhf etyettetytet bvcbvbcvc");

	}

}
