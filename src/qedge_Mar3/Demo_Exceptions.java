package qedge_Mar3;

public class Demo_Exceptions {

	public static void main(String[] args) {
		try {
int x=3456,y=0,z;
z=x/y;
System.out.println(z);
		}catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
int a=5647,b=50,c;
c=a/b;
System.out.println(c);
	}
}


