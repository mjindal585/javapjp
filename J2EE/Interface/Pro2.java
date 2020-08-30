interface Test{
	abstract int myFunction(int a,int b,int c);
}
public class Pro2 {

	private int myFunction(int a,int b,int c,Test t) {
		return t.myFunction(a, b, c);
	}
	public static void main(String[] args) {
		Pro2 inf2=new Pro2();
		Test t1=(int a,int b,int c)->a+b+c;
		System.out.println("Adding three values:"+(inf2.myFunction(3,4,5,t1)));
		Test t2=(int a,int b,int c)->a*b*c;
		System.out.println("Multiplying three values:"+(inf2.myFunction(3, 4, 5, t2)));
	}

}