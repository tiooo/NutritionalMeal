
public class Material {

	private Food food;
	private Integer quantity;
	private String unit;
	
	
	public Material(Food food, Integer quantity) {
		super();
		this.food = food;
		this.quantity = quantity;
	}

	public Material(Food food, Integer quantity, String unit) {
		super();
		this.food = food;
		this.quantity = quantity;
		this.unit = unit;
	}
	
	public Food getFood() {
		return food;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public void setFood(Food food) {
		this.food = food;
	}


	
}
