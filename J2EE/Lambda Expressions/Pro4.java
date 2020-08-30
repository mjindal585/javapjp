import java.util.Scanner;


interface wordcount{
	int count(String str);
}
public class Pro4 {

	public static void main(String[] args) {
wordcount wc=(str)->(str.length());
System.out.println("Enter a string:");
Scanner in=new Scanner(System.in);
String str1=in.next();
	int n=wc.count(str1);
	System.out.println("Length of \""+str1+"\" is "+n);
in.close();
	}
	

}