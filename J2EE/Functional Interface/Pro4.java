import java.util.*;
import java.util.stream.Collectors;


public class Pro4 {
	private int id,sal;
	private String name;
	
	Pro4(int id,String name,int sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getSal() {
		return sal;
	}


	public void setSal(int sal) {
		this.sal = sal;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		ArrayList<Pro4> al=new ArrayList<Pro4>();
		al.add(new Pro4(1,"Mithun",123445));
		al.add(new Pro4(2,"Shadab",125));
		
		List<Pro4> sa=al.stream().filter(x->x.getSal()<10000).collect(Collectors.toList());
		for(Pro4 a:sa)
			System.out.println(a.getName());
	}

}