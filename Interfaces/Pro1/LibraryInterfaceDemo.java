public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		KidUser kidUsers = new KidUser();
		kidUsers.setAge(10);
		kidUsers.setBookType("Kids");
		kidUsers.registerAccount();
		kidUsers.requestBook();
		kidUsers.setAge(14);	
		kidUsers.setBookType("Fiction");		
		kidUsers.registerAccount();
		kidUsers.requestBook();
		System.out.println();
		
		AdultUser adultUser = new AdultUser();
		adultUser.setAge(5);
		adultUser.setBookType("Kids");
		adultUser.registerAccount();
		adultUser.requestBook();
		adultUser.setAge(55);	
		adultUser.setBookType("Fiction");		
		adultUser.registerAccount();
		adultUser.requestBook();
		
	}

}