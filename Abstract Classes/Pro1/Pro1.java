public class Pro1 {

	public static void main(String[] args) {
		ICICIBank iciciBank = new ICICIBank();
		KotMBank kotMBank = new KotMBank();

		System.out.println("INTEREST ( SAVINGS ) ICICI : " +iciciBank.getSavingInterestRate());
		System.out.println("INTEREST ( fIXED ) ICICI : " +iciciBank.getFixedInterestRate());
		System.out.println("INTEREST ( SAVINGS ) KOTAK : " +kotMBank.getSavingInterestRate());
		System.out.println("INTEREST ( fIXED ) KOTAK : " +kotMBank.getFixedInterestRate());
		
		GeneralBank gb1 = new ICICIBank();
		GeneralBank gb2 = new KotMBank();
		
		System.out.println("INTEREST ( SAVINGS GENERAL) ICICI : " +gb1.getSavingInterestRate());
		System.out.println("INTEREST ( FIXED GENERAL ) ICICI : " +gb1.getFixedInterestRate());
		System.out.println("INTEREST ( SAVINGS GENERAL ) KOTAK : " +gb2.getSavingInterestRate());
		System.out.println("INTEREST ( FIXED GENERAL ) KOTAK : " +gb2.getFixedInterestRate());
	}

}
