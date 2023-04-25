package March6;

public class Demo_Void_Any {
	public static void addition (int a,int b)
	{
		int c =a+b;
		System.out.println(c);
	}
	public static String verify_String(String str1,String str2)
	{
	String res ="";
   if(str1.equalsIgnoreCase(str2))
   {
	   res ="Strings are Equal";
   }
   else
   {
	   res ="Strings are Not Equal";
   }
return res;
	}
   public static void main(String[] args) {		   
	   Demo_Void_Any.addition(7658, 4567);
		String results = Demo_Void_Any.verify_String("Hello", "Hello");
				System.out.println(results);
	}

	}



