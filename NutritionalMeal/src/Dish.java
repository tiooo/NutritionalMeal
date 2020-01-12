import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 菜
 * @author wencui
 *
 */
public class Dish {

	/**
	 * 菜名
	 */
	private String name;
	/**
	 * 辣度
	 * 1~10, 1为不辣,10为最辣
	 */
	private Integer howSpicy;
	/**
	 * 易肥胖程度
	 * 1~10, 1为不胖,10为非常容易胖
	 */
	private Integer howFat;
	/**
	 * 菜量
	 * 表示这个菜的分量，一般是1，但比如饺子，或者一锅炖菜这样的大菜，值就是2，基本上一顿饭一个菜就好了量
	 */
	private Integer dishQuantity;
	/**
	 * 适合做哪一餐
	 * 早，午，晚，外带
	 *  1  1   1    1   哪个适合，哪位就是1，都适合就是 15
	 */
	private int whichMeal;
	/**
	 * 菜谱
	 */
	private String receipe;
	/**
	 * 原料
	 */
	private Material[] material;
	/**
	 * 适合搭配的食物(汤,主食,酒水饮料等)
	 */
	private String[] sides;
	
	public List<Material> getMaterial() {
		return Arrays.asList(material);
	}
	
	public List<String> getSides() {
		return Arrays.asList(sides);
	}
	public boolean isBreakfast() {
		return (whichMeal & 8) > 0;
	}
	public boolean isLunch() {
		return (whichMeal & 4) > 0;
	}
	public boolean isDinner() {
		return (whichMeal & 2) > 0;
	}
	public boolean isTakeAway() {
		return (whichMeal & 1) > 0;
	}
	public String getName() {
		return name;
	}
	public Integer getHowSpicy() {
		return howSpicy;
	}
	public Integer getHowFat() {
		return howFat;
	}
	public String getReceipe() {
		return receipe;
	}
	public void setMaterial(Material[] material) {
		this.material = material;
	}
	/**
	 * 
	 * @param name
	 * @param howSpicy
	 * @param howFat
	 * @param dishQuantity
	 * @param whichMeal
	 * @param receipe
	 * @param materials
	 * @param sides
	 */
	public Dish(String name, Integer howSpicy, Integer howFat, int dishQuantity, int whichMeal, 
			String receipe, Material[] materials, String[] sides) {
		super();
		this.name = name;
		this.howSpicy = howSpicy;
		this.howFat = howFat;
		this.dishQuantity = dishQuantity;
		this.whichMeal = whichMeal;
		this.material = materials;
		this.receipe = receipe;
		this.sides = sides;
	}
	public boolean containsSpecialFood(Food food) {
		for (Material tmp : material) {
			if (tmp.getFood().equals(food)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dishQuantity == null) ? 0 : dishQuantity.hashCode());
		result = prime * result + ((howFat == null) ? 0 : howFat.hashCode());
		result = prime * result + ((howSpicy == null) ? 0 : howSpicy.hashCode());
		result = prime * result + Arrays.hashCode(material);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((receipe == null) ? 0 : receipe.hashCode());
		result = prime * result + Arrays.hashCode(sides);
		result = prime * result + whichMeal;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dish other = (Dish) obj;
		if (dishQuantity == null) {
			if (other.dishQuantity != null)
				return false;
		} else if (!dishQuantity.equals(other.dishQuantity))
			return false;
		if (howFat == null) {
			if (other.howFat != null)
				return false;
		} else if (!howFat.equals(other.howFat))
			return false;
		if (howSpicy == null) {
			if (other.howSpicy != null)
				return false;
		} else if (!howSpicy.equals(other.howSpicy))
			return false;
		if (!Arrays.equals(material, other.material))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (receipe == null) {
			if (other.receipe != null)
				return false;
		} else if (!receipe.equals(other.receipe))
			return false;
		if (!Arrays.equals(sides, other.sides))
			return false;
		if (whichMeal != other.whichMeal)
			return false;
		return true;
	}

	public Integer getDishQuantity() {
		return dishQuantity;
	}
	
}
