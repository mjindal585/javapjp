import java.util.*;
import java.util.stream.Collectors;


public class Pro2 {
	int empno,age;
	String name,loc;
	Pro2(int empno,String name,int age,String loc){
		this.age=age;
		this.empno=empno;
		this.loc=loc;
		this.name=name;
	}

	public static void main(String[] args) {
		List<Pro2> emp=new ArrayList<Pro2>();
		emp.add(new Pro2(1,"Mithun",21,"Bangalore"));
		emp.add(new Pro2(2,"Vijay",22,"Mumbai"));
		emp.add(new Pro2(3,"Shadab",22,"Pune"));
		
		List<Pro2> li=emp.stream().filter(x->x.loc=="Pune").collect(Collectors.toList());
		for(Pro2 a:li)
		System.out.println(a.empno+", "+a.name+", "+a.age+", "+a.loc);

	}

}