interface myfunc{
	abstract int count(int n);
}
public class Pro2 {
	
	public static int digitcount(int n) {
		int l=String.valueOf(n).length();
		return l;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myfunc obj=Pro2::digitcount;
		System.out.println(obj.count(123456));
		
	}

}