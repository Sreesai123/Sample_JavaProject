package qedge_Mar2;

public class Demo_Single_Dimentions_object {

	public static void main(String[] args) {
Object x[]=new Object[5];
x[0]="Hello";
x[1]=3456;
x[2]=3456.36;
x[3]='i';
x[4]=true;
for (Object each : x) {
	System.out.println(each);
	
}
	}

}
