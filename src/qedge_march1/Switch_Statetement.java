package qedge_march1;

import java.util.Scanner;

public class Switch_Statetement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
		System.out.println("Enter your course");
String course =s.next();
switch (course.toUpperCase()) {
case "MANUAL":
	System.out.println("Course is Available::"+course);
	break;
case "SELENIUM":
	System.out.println("Course is Available::"+course);
	break;
	case "JAVA":
		System.out.println("Course is Available::"+course);
		break;
		case "PYTHON":
			System.out.println("Course is Available::"+course);
			break;
default:
	System.out.println("Course is Not Available::"+course);
	break;
}
	}

}
}
