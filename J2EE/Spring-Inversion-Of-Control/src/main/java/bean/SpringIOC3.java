package bean;


public class SpringIOC3 {
	private SetterMessage stm=null;

	public SpringIOC3(SetterMessage stm) {
		super();
		this.stm = stm;
	}

	public SpringIOC3() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SetterMessage getStm() {
		return stm;
	}

	public void setStm(SetterMessage sm) {
		this.stm = sm;
	}

	@Override
	public String toString() {
		return "SpringIOC3 [sm=" + stm + "]";
	}
	

}
