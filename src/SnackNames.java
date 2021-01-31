
public enum SnackNames {// enum class for the snakes types 
	Almonds("Almonds"),
	Cashews("Cashews"),
	Cookies("Cookies"),
	Crackers("Crackers"),
	CandyBar("CandyBar");
	
	
	private String name;
	
	private SnackNames(String name) { 
		this.name=name;
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
