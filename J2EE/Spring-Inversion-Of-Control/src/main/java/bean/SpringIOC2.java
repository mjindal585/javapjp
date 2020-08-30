package bean;

 class SpringIOC2 {

	private ConstructMessage cm;

	public SpringIOC2(ConstructMessage cm) {
		super();
		this.cm = cm;
	}

	public ConstructMessage getCm() {
		return cm;
	}

	public void setCm(ConstructMessage cm) {
		this.cm = cm;
	}

	@Override
	public String toString() {
		return "SpringIOC2 [cm=" + cm + "]";
	}
	

}
