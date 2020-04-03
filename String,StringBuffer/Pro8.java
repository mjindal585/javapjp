public class Pro8 {

	public static void main(String[] args) {
		String str = "ab*cd*gf";
		
		String[] strs = str.split(".[\\*]+.");
		
		StringBuffer sb = new StringBuffer();
		
		for (String x : strs)
			sb.append(x);
		
		System.out.println(sb);

	}

}
