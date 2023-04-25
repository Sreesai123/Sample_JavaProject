package qedge_March4;



public class Demo_String_Functions {

	public static void main(String[] args) {
		//lengths
String str="i am learning java";
System.out.println(str.length());

//equals & //equal Ignore
String str1="Java";
String str2="java";
String str3="JAVA";
String str4="java";
System.out.println(str1.equals(str3));
System.out.println(str2.equals(str4));
System.out.println(str3.equalsIgnoreCase(str4));

//contains
String st="Welcome to selenium classes and java";
System.out.println(st.contains("java"));
System.out.println(st.contains("selenium"));
System.out.println(st.contains("Welcome"));
System.out.println(st.contains("class"));

//startsWith and //endsWith
String s="Welcome to selenium classes and java";
System.out.println(s.startsWith("Welcome"));
System.out.println(s.endsWith("java"));
System.out.println(s.startsWith("Wel"));
System.out.println(s.endsWith("va"));

//replace
String re="Welcome into India";
System.out.println(re.replace("into","to"));
System.out.println(re.replace("India","Abraod"));

//Split

String company="HCL@TATA@TCS@HCL@INFOSYS@MAHINDRA@GOOGLE@MICROSOFT";
String[] reddy = company.split("@");
System.out.println(reddy);
for (String each : reddy) {
	System.out.println(each);
	
}
	}
}
