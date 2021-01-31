
public class Snacks {
	
	private int columnIndex;
	private double Price; 
	private String name;

	/**
	 * @param columncolumnIndex
	 * @param price
	 */
	public Snacks(int columnIndex, double price,String name) {
		super();
		this.columnIndex = columnIndex;
		this.Price = price;
		this.name = name;
		
	}
	
	/**
	 * @return the columnIndex
	 */
	public int getColumnIndex() {
		return columnIndex;
	}

	/**
	 * @param columnIndex the columnIndex to set
	 */
	public void setColumnIndex(int columnIndex) {
		this.columnIndex = columnIndex;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return Price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.Price = price;
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
	
	
	@Override
	public String toString() {
		return "Snacks [columnIndex=" + columnIndex + ", Price=" + Price + ", name=" + name + "]";
	}

	
}
