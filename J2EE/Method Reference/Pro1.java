interface factofn{
	abstract int fact(int n);
}
public class Pro1 {

		public int factn(int n) {
			if(n==1||n==0)
				return 1;
			else
				return n*factn(n-1);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pro1 obj=new Pro1();
		factofn fn=obj::factn;
		System.out.println(fn.fact(5));
	}

}