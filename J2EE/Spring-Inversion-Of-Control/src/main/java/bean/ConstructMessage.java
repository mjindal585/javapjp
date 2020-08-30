package bean;

public class ConstructMessage {
	private String message=null;

	public ConstructMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConstructMessage(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ConstructMessage [message=" + message + "]";
	}
}
