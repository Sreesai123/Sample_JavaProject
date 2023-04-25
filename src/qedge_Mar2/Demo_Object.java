package qedge_Mar2;

public class Demo_Object {

	public static void main(String[] args) {
Object str[][]= new Object [4][2];
str[0][0]="Admin1";
str[0][1]=234567;
str[1][0]="Admin2";
str[1][1]=23456.768;
str[2][0]="Admin3";
str[2][1]=345678;
str[3][0]="Admin3";
str[3][1]=3456;
System.out.println(str.length);
System.out.println(str[0].length);
System.out.println(str[3][1]);
for (int i = 0; i < str.length; i++)
{
	for (int j = 0; j < str[0].length; j++)
	{
		System.out.print(str[i][j]+"\t");
		
	}
	System.out.println();
	
}
	}

}
