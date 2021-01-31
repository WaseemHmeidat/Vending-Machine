
public enum CashSlots {
	DIME("10c", 0.1), 
	TWENTYCENT("20c", 0.2), 
	HALFDOLLAR("50c", 0.5), 
	ONE("1$", 1.0), 
	TWENTY("20$", 20.0), 
	FIFTY("50$", 50.0);

	private double value;
	private String name;

	/**
	 * @param value
	 * @param name
	 */
	private CashSlots(String name, double value) {
		this.value = value;
		this.name = name;
	}

	/**
	 * @return the value
	 */
	public double getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(double value) {
		this.value = value;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}