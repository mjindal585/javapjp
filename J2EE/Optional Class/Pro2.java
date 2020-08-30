import java.util.Optional;


public class Pro2 {

	public static void main(String[] args) {
String add = null;
String default_add="Delhi , India";
Optional<String> n=Optional.ofNullable(add);
System.out.println(n.orElse(default_add));
	}

}