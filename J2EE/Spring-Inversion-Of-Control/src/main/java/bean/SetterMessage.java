package bean;

public class SetterMessage {
	private String msg=null;

	public SetterMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SetterMessage(String message) {
		super();
		this.msg = message;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String message) {
		this.msg = message;
	}

	@Override
	public String toString() {
		return "SetterMessage [message=" + msg + "]";
	}
}
