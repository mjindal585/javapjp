package bean;

import bean.*;

@SuppressWarnings("unused")
public class SpringIOC1 {

	private Shape s;

	public SpringIOC1(Shape s) {
		super();
		this.s = s;
	}

	public Shape getS() {
		return s;
	}

	public void setS(Shape s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "SpringIOC1 [s=" + s + "]";
	}
	

}
