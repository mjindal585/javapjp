import java.util.ArrayList;
import java.util.List;

public class Pro3 {
	int rno;
	String name;
	float marks;
	Pro3(int rno,String name,float marks)
	{
		this.marks=marks;
		this.rno=rno;
		this.name=name;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Pro3> emp=new ArrayList<Pro3>();
		emp.add(new Pro3(1,"Mithun",49));
		emp.add(new Pro3(2,"Vijay",60));
		emp.add(new Pro3(3,"Shadab",100));
		
	long c=emp.stream().filter(x->x.marks>=50).count();
	System.out.println(c);


	}

}