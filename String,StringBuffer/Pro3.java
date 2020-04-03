public class Pro3 {
	public static void main(String[] args) {
		String str = "Wipro";
		int n = str.length();		
		String repeater = "";		
		repeater = str.substring(0, 2);		
		
		for (int i = 0; i < n; i++) {
            System.out.print(repeater);
		}
		

	}

}
