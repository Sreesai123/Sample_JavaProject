package qedge_march1;

public class Array_Single_Dimention {

	public static void main(String[] args) {
        int x[]= new int[7];
		x[0]=10;
		x[1]=20;
		x[2]=30;
		x[3]=40;
		x[4]=50;
		x[5]=60;
		x[6]=70;
		System.out.println(x.length);
		System.out.println(x[6]);
		 for (int each: x) {
			 System.out.println(each);
			
		}
	}

}
