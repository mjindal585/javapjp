public class Pro4 {
	public static void main(String[] args) {
		String str = "TomCAt";		
		String output;		
		if (str.length() % 2 == 0) {
			output = str.substring(0, str.length() / 2);
		} else {
			output = null;
		}
		
		System.out.println(output);
	}

}
