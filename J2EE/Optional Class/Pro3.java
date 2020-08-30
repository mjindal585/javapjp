import java.util.Optional;


@SuppressWarnings("serial")
class InvalidEmployeeException extends Exception
{
	public InvalidEmployeeException() {
		System.out.println("Invalid Employee Exception");
	}
}
public class Pro3 {

	public static void main(String[] args) {
		Pro3 e=null;
		Optional<Pro3> n=Optional.ofNullable(e);
		try {
			System.out.println(n.orElseThrow(InvalidEmployeeException::new));
		} catch (InvalidEmployeeException e1) {
			e1.printStackTrace();
		}

	}

}