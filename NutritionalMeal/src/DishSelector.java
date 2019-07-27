import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DishSelector {
	
	private Integer minSpicy;
	private Integer maxSpicy;
	private Integer minFat;
	private Integer maxFat;
	private List<Food> favourateMaterial = new ArrayList<Food>();
	
	public DishSelector(Integer minSpicy, Integer maxSpicy, Integer minFat, Integer maxFat,
			List<Food> favourateMaterial) {
		super();
		this.minSpicy = minSpicy;
		this.maxSpicy = maxSpicy;
		this.minFat = minFat;
		this.maxFat = maxFat;
		this.favourateMaterial = favourateMaterial;
	}

	public Dish randomDish(List<Dish> oriList) {
		List<Dish> list = new ArrayList<Dish>();
		for (Dish dish : oriList) {
			if (minSpicy == null || minSpicy <= dish.getHowSpicy()) {
				if (maxSpicy == null || maxSpicy >= dish.getHowSpicy()) {
					if (minFat == null || minFat <= dish.getHowFat()) {
						if (maxFat == null || maxFat >= dish.getHowFat()) {
							if (favourateMaterial == null || favourateMaterial.isEmpty()) {
								list.add(dish);
							} else {
								boolean isContainAllRequireFood = true;  
								for (Food food : favourateMaterial) {
									if (dish.containsSpecialFood(food)) {
										
									} else {
										isContainAllRequireFood = false;
										break;
									}
								}
								if (isContainAllRequireFood) {
									list.add(dish);
								}
							}
						}
					}
				}
			}
		}
		if (list.size() > 0) {
			Random random = new Random();
			int index = random.nextInt(list.size());
			Dish result = list.get(index);
			oriList.remove(result);
			return result;
		} else {
			return null;
		}
	}

	@Override
	public String toString() {
		return "DishSelector [minSpicy=" + minSpicy + ", maxSpicy=" + maxSpicy + ", minFat=" + minFat + ", maxFat="
				+ maxFat + ", favourateMaterial=" + favourateMaterial + "]";
	}
}
