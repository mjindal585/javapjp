import java.util.ArrayList;


public class Pro2 {
	public int id;
	public static int count=0;
	public double sal;
	public String name,add;
	
	public Pro2() {}
public Pro2(int id,String name,String add,double sal)
{
	super();
	this.id=id;
	this.name=name;
	this.sal=sal;
	this.add=add;
	count++;
}

	public static void main(String[] args) {
ArrayList<Pro2> al=new ArrayList<Pro2>();
al.add(new Pro2(1,"Mithun","Bangalore",1234545.90));
al.add(new Pro2(2,"Vijay","Mumbai",1654343.44));
al.add(new Pro2(3,"Suhas","Pune",2345678.88));
		al.forEach(
				s->{
					System.out.println(s.getId()+", "+s.getName()+", "+s.getSal()+", "+s.getAdd());
				}
				);
		
	}
	public int getId() {
		return id;
	}
	public double getSal() {
		return sal;
	}
	public String getName() {
		return name;
	}
	public String getAdd() {
		return add;
	}

}
