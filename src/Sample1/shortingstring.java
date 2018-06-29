package Sample1;

public class shortingstring
{
    public static void main(String[] args) 
    {        
        String temp;        
        String names[] = new String[5];   
        names[0] = "tri" ;
        names[1] = "bapi" ;
        names[2] = "dilu" ;
        names[3] = "jasmin" ;
        names[4] = "litu" ;
        System.out.println("Enter all the names:");       
        for (int i = 0; i < names.length; i++) 
        {
            for (int j = i + 1; j < names.length; j++) 
            {
                if (names[i].compareTo(names[j])>0) 
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.print("Names in Sorted Order:");
        for (int i = 0; i < names.length; i++) 
        {
            System.out.print(names[i] + ",");
        }        
    }
}
