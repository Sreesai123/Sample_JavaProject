package qedge_Mar2;


public class Demo_Multiple_Dimentions {

	public static void main(String[] args) {
		String str[][] = new String[4][2];
		str[0][0]="Admin1";
		str[0][1]="test1";
		str[1][0]="Admin2";
		str[1][1]="test2";
		str[2][0]="Admin3";
		str[2][1]="test3";
		str[3][0]="Admin4";
		str[3][1]="test4";
		System.out.println(str.length);
		System.out.println(str[0].length);
		System.out.println(str[3][1]);
		for (int i=0;i<str.length;i++)
	{
			for (int j=0;j<str[0].length;j++)
					{
				System.out.print(str[i][j]+"\t");
					}
				System.out.println();
}
	}
	}

