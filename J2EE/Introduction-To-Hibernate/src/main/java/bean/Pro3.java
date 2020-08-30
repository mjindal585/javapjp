package bean;
import javax.persistence.*;

@Entity
@Table(name = "empl")
public class Pro3 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	   @Column(name = "name")
	   private String name;

	   @Column(name = "desg")
	   private String desg;

	   @Column(name = "sal")
	   private double sal;
	public Pro3() {}
	public Pro3(String name, String desg, double sal) {
		super();
		this.name = name;
		this.desg = desg;
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Pro3 [name=" + name + ", id=" + id + ", desg=" + desg + ", sal=" + sal + "]";
	}

}