package Sample1;

public class SingleToneLogic {
	//singleTone class is nothing but we are creating only one object but Giving More reference to that object
	
	private static SingleToneLogic singletone = null;
	public String str;
	
	private SingleToneLogic()
	{
		str = "This is trilochan single tone logic";
	}
	
	public static SingleToneLogic git_Instance(){
		
		if(singletone == null)
			singletone = new SingleToneLogic();
		return singletone;
		
	}
	public static void main(String[] args) {
		singletone = git_Instance();
		SingleToneLogic x = git_Instance();
		singletone.str = singletone.str;
		System.out.println(singletone.str);
		System.out.println(x.str);	
		
		x.str = x.str.toUpperCase();
		System.out.println(x.str);
		System.out.println(singletone.str);
	}

}
