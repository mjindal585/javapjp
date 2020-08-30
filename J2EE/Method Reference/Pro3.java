interface myprime{
	void prime(int n);
}
public class Pro3 {
	private int flag=0;
	Pro3(int n)
	{
		for(int i=2;i<n;i++)
			if(n%i==0)
				{ flag=1; break;}
		if(flag==0)
			System.out.println(n+" is Prime number");
		else
			System.out.println(n+" is not prime number");

	}

	public static void main(String[] args) {
		myprime obj1=Pro3::new;
		obj1.prime(17);

	}

}