package Model;

public class Item {
	private Integer itemId;
	private String name;
	private double price;
	
	public Item() {
		super();
	}
	
	public Item(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public Item(Integer itemId, String name, double price) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.price = price;
	}

	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}
}
