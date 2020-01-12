import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class GenOneWeekMeal {
	private static final String MONDAY = "Monday";
	private static final String TUESDAY = "Tuesday";
	private static final String WEDNESDAY = "Wednesday";
	private static final String THURSDAY = "Thursday";
	private static final String FRIDAY = "Friday";
	private static final String SATURDAY = "Saturday";
	private static final String SUNDAY = "Sunday";
	
	private static final int BREAKFAST_QUANTITY = 1;
	private static final int LUNCH_QUANTITY = 2;
	private static final int LUNCH_BACKUP_QUANTITY = 1;
	private static final int DINNER_QUANTITY = 2;
	private static final int DINNER_BACKUP_QUANTITY = 1;
	
	private static Map<String, Dish> allDishes = new HashMap<String, Dish>();
	private static List<Dish> breakfastList = new ArrayList<Dish>();
	private static List<Dish> lunchList = new ArrayList<Dish>();
	private static List<Dish> dinnerList = new ArrayList<Dish>();
	private static List<Dish> takeAwayList = new ArrayList<Dish>();
	private static Map<String, Material> material = new LinkedHashMap<String, Material>();
	
	static {
		
		putAllDishes();
		
		for (Dish dish : allDishes.values()) {
			if (dish.isBreakfast()) {
				breakfastList.add(dish);
			}
			if (dish.isLunch()) {
				lunchList.add(dish);
			}
			if (dish.isDinner()) {
				dinnerList.add(dish);
			}
			if (dish.isTakeAway()) {
				takeAwayList.add(dish);
			}
		}
	}
	/**
	 * 随机生成一周的食谱
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 开始配置
		String roodDir = "D:/资料盘/memu";
		
		// 开始生成一周菜谱
		// 周一
		DishSelector MondayDinnerSelector1 = new DishSelector(null,2,null,null,null);
		DishSelector MondayDinnerSelector2 = new DishSelector(null,null,null,null,null);
		List<DishSelector> MondayDinnerSelectorList = new ArrayList<DishSelector>();
		MondayDinnerSelectorList.add(MondayDinnerSelector1);
		MondayDinnerSelectorList.add(MondayDinnerSelector2);
		List<Dish> test = new ArrayList<Dish>();
		test.add(allDishes.get("手抓饭"));
		Day Monday = new Day(MONDAY, null, null, null, MondayDinnerSelectorList, test);
		Monday.genDish(breakfastList, lunchList, dinnerList);
		// 周二
		DishSelector TuesdayDinnerSelector1 = new DishSelector(null,2,null,null,null);
		DishSelector TuesdayDinnerSelector2 = new DishSelector(null,null,null,null,null);
		List<DishSelector> TuesdayDinnerSelectorList = new ArrayList<DishSelector>();
		TuesdayDinnerSelectorList.add(TuesdayDinnerSelector1);
		TuesdayDinnerSelectorList.add(TuesdayDinnerSelector2);
		Day Tuesday = new Day(TUESDAY, null, null, null, TuesdayDinnerSelectorList, null);
		Tuesday.genDish(breakfastList, lunchList, dinnerList);
		// 周三
		DishSelector WednesdayDinnerSelector1 = new DishSelector(null,2,null,null,null);
		DishSelector WednesdayDinnerSelector2 = new DishSelector(null,null,null,null,null);
		List<DishSelector> WednesdayDinnerSelectorList = new ArrayList<DishSelector>();
		WednesdayDinnerSelectorList.add(WednesdayDinnerSelector1);
		WednesdayDinnerSelectorList.add(WednesdayDinnerSelector2);
		Day Wednesday = new Day(WEDNESDAY, null, null, null, WednesdayDinnerSelectorList, null);
		Wednesday.genDish(breakfastList, lunchList, dinnerList);
		// 周四
		DishSelector ThursdayDinnerSelector1 = new DishSelector(null,2,null,null,null);
		DishSelector ThursdayDinnerSelector2 = new DishSelector(null,null,null,null,null);
		List<DishSelector> ThursdayDinnerSelectorList = new ArrayList<DishSelector>();
		ThursdayDinnerSelectorList.add(ThursdayDinnerSelector1);
		ThursdayDinnerSelectorList.add(ThursdayDinnerSelector2);
		Day Thursday = new Day(THURSDAY, null, null, null, ThursdayDinnerSelectorList, null);
		Thursday.genDish(breakfastList, lunchList, dinnerList);
		// 周五
		DishSelector FridayDinnerSelector1 = new DishSelector(null,2,null,null,null);
		DishSelector FridayDinnerSelector2 = new DishSelector(null,null,null,null,null);
		List<DishSelector> FridayDinnerSelectorList = new ArrayList<DishSelector>();
		FridayDinnerSelectorList.add(FridayDinnerSelector1);
		FridayDinnerSelectorList.add(FridayDinnerSelector2);
		Day Friday = new Day(FRIDAY, null, null, null, FridayDinnerSelectorList, null);
		Friday.genDish(breakfastList, lunchList, dinnerList);
		// 周六
		DishSelector SaturdayLunchSelector1 = new DishSelector(null,2,null,null,null);
		DishSelector SaturdayLunchSelector2 = new DishSelector(null,null,null,null,null);
		List<DishSelector> SaturdayLunchSelectorList = new ArrayList<DishSelector>();
		SaturdayLunchSelectorList.add(SaturdayLunchSelector1);
		SaturdayLunchSelectorList.add(SaturdayLunchSelector2);
		Day Saturday = new Day(SATURDAY, null, SaturdayLunchSelectorList, null, null, null);
		Saturday.genDish(breakfastList, lunchList, dinnerList);
		// 周日
		DishSelector SundayLunchSelector1 = new DishSelector(null,2,null,null,null);
		DishSelector SundayLunchSelector2 = new DishSelector(null,null,null,null,null);
		List<DishSelector> SundayLunchSelectorList = new ArrayList<DishSelector>();
		SundayLunchSelectorList.add(SundayLunchSelector1);
		SundayLunchSelectorList.add(SundayLunchSelector2);
		Day Sunday = new Day(SUNDAY, null, SundayLunchSelectorList, null, null, null);
		Sunday.genDish(breakfastList, lunchList, dinnerList);		
		
		// 打印保存结果
		List<Day> days = new ArrayList<Day>();
		days.add(Monday);
		days.add(Tuesday);
		days.add(Wednesday);
		days.add(Thursday);
		days.add(Friday);
		days.add(Saturday);
		days.add(Sunday);
		for (Day day : days) {
			System.out.println(day.getDayInWeek() + " ");
			
			String breakfast = "早餐： ";
			for (Dish dish : day.breakfast) {
				breakfast += dish.getName() + ",";
			}
			breakfast = breakfast.substring(0, breakfast.length() - 1);
			breakfast += "       side： ";
			Set<String> setBreakfast = new HashSet<String>();
			for (Dish dish : day.breakfast) {
				for (String str : dish.getSides()) {
					setBreakfast.add(str);
				}
			}
			for (String str : setBreakfast) {
				if (!str.isEmpty()) {
					breakfast += str + ",";
				}
			}
			breakfast = breakfast.substring(0, breakfast.length() - 1);
			System.out.println(breakfast);
			
			String lunch = "午餐： ";
			for (Dish dish : day.lunch) {
				lunch += dish.getName() + ",";
			}
			lunch = lunch.substring(0, lunch.length() - 1);
			
			lunch += "        side： ";
			Set<String> setLunch = new HashSet<String>();
			for (Dish dish : day.lunch) {
				for (String str : dish.getSides()) {
					setLunch.add(str);
				}
			}
			for (String str : setLunch) {
				if (!str.isEmpty()) {
					lunch += str + ",";
				}
			}
			lunch = lunch.substring(0, lunch.length() - 1);
			System.out.println(lunch);
			
			
			String dinner = "晚餐： ";
			for (Dish dish : day.dinner) {
				dinner += dish.getName() + ",";
			}
			dinner = dinner.substring(0, dinner.length() - 1);
			dinner += "          side： ";
			Set<String> setDinner = new HashSet<String>();
			for (Dish dish : day.dinner) {
				for (String str : dish.getSides()) {
					setDinner.add(str);
				}
			}
			for (String str : setDinner) {
				if (!str.isEmpty()) {
					dinner += str + ",";
				}
			}
			dinner = dinner.substring(0, dinner.length() - 1);
			System.out.println(dinner);
		}
		for (Day day : days) {
			for (Dish dish : day.breakfast) {
				for (Material mt : dish.getMaterial()) {
					material.put(mt.getFood().getMsg(), mt);
				}
			}
			for (Dish dish : day.lunch) {
				for (Material mt : dish.getMaterial()) {
					material.put(mt.getFood().getMsg(), mt);
				}
			}
			for (Dish dish : day.dinner) {
				for (Material mt : dish.getMaterial()) {
					material.put(mt.getFood().getMsg(), mt);
				}
			}
		}
		String mtStr = "原料：";
		int i = 0;
		for (Material mt : material.values()) {
			mtStr += mt.getFood().getMsg() + ",";
			i++;
			if (i%15 == 0) {
				System.out.println(mtStr);
				mtStr = "";
			}
		}
		mtStr = mtStr.substring(0, mtStr.length() - 1);
		System.out.println(mtStr);
	}
	public static class Day {
		private String dayInWeek;
		private List<Dish> breakfast = new ArrayList<Dish>();
		private List<DishSelector> lunchSelector = new ArrayList<DishSelector>();
		private List<Dish> lunch = new ArrayList<Dish>();
		private List<DishSelector> dinnerSelector = new ArrayList<DishSelector>();
		private List<Dish> dinner = new ArrayList<Dish>();
	
		private int getBreakfastQuantity() {
			int result = 0;
			for (Dish dish : breakfast) {
				result += dish.getDishQuantity();
			}
			return result;
		}
		private int getLunchQuantity() {
			int result = 0;
			for (Dish dish : lunch) {
				result += dish.getDishQuantity();
			}
			return result;
		}
		private int getDinnerQuantity() {
			int result = 0;
			for (Dish dish : dinner) {
				result += dish.getDishQuantity();
			}
			return result;
		}
		/**
		 * 一天的餐食
		 * @param dayInWeek		星期几
		 * @param breakfast		如果直接传入Dish,表示这一餐要这个菜
		 * @param lunchSelector 传入null表示当天没有午饭,传入几个selector就表示需要几个菜
		 * @param lunch         如果直接传入Dish,表示这一餐要这个菜。
		 * @param dinnerSelector传入null表示当天没有晚饭,传入几个selector就表示需要几个菜
		 * @param dinner		如果直接传入Dish,表示这一餐要这个菜
		 */
		public Day(String dayInWeek, List<Dish> breakfast, List<DishSelector> lunchSelector, List<Dish> lunch,
				List<DishSelector> dinnerSelector, List<Dish> dinner) {
			super();
			this.dayInWeek = dayInWeek;
			if (breakfast == null) {
				this.breakfast = new ArrayList<Dish>();
			} else {
				this.breakfast = breakfast;
			}
			this.lunchSelector = lunchSelector;
			if (lunch == null) {
				this.lunch = new ArrayList<Dish>();
			} else {
				this.lunch = lunch;
			}
			this.dinnerSelector = dinnerSelector;
			if (dinner == null) {
				this.dinner = new ArrayList<Dish>();
			} else {
				this.dinner = dinner;
			}
		}
		public void genDish(List<Dish> oriBreakfastList, List<Dish> oriLunchList, List<Dish> oriDinnerList) {
			// copy
			List<Dish> breakfastList = new ArrayList<Dish>(oriBreakfastList);
			List<Dish> lunchList = new ArrayList<Dish>(oriLunchList);
			List<Dish> dinnerList = new ArrayList<Dish>(oriDinnerList);
			
			Random random = new Random();
			// 早饭
			if (breakfast != null && !breakfast.isEmpty()) {
				if (getBreakfastQuantity() >= BREAKFAST_QUANTITY) {
					// do nothing
				} else {
					for (; getBreakfastQuantity() < BREAKFAST_QUANTITY;) {
						int index = random.nextInt(breakfastList.size());
						breakfast.add(breakfastList.get(index));
						breakfastList.remove(index);
					}
				}
			} else {
				for (; getBreakfastQuantity() < BREAKFAST_QUANTITY;) {
					int index = random.nextInt(breakfastList.size());
					breakfast.add(breakfastList.get(index));
					breakfastList.remove(index);
				}
			}
			// 午饭（通过DishSelector进行筛选)
			if (lunchSelector != null) {
				for (DishSelector sel : lunchSelector) {
					if (getLunchQuantity() < LUNCH_QUANTITY) {
						Dish tmp = sel.randomDish(lunchList);
						if (tmp != null) {
							if (getLunchQuantity() + tmp.getDishQuantity() <= LUNCH_QUANTITY) {
								lunch.add(tmp);
								lunchList.remove(tmp);
							} else { // 重选
								for (int i = 0; i < 100; i++) { // 防止死循环
									tmp = sel.randomDish(lunchList);
									if (tmp != null) {
										if (getLunchQuantity() + tmp.getDishQuantity() <= LUNCH_QUANTITY) {
											lunch.add(tmp);
											lunchList.remove(tmp);
											break;
										}
									} else {
										System.out.println("随机选择午餐出错2,selctor：" + sel.toString());
									}
								}
							}
						} else {
							System.out.println("随机选择午餐出错1,selctor：" + sel.toString());
						}
					}
				}
			}
			// 晚饭 （通过DishSelctro进行筛选）
			if (dinnerSelector != null) {
				for (DishSelector sel : dinnerSelector) {
					if (getDinnerQuantity() < DINNER_QUANTITY) {
						Dish tmp = sel.randomDish(dinnerList);
						if (tmp != null) {
							if (getDinnerQuantity() + tmp.getDishQuantity() <= DINNER_QUANTITY) {
								dinner.add(tmp);
								dinnerList.remove(tmp);
							} else { // 重选
								for (int i = 0; i < 100; i++) { // 防止死循环
									tmp = sel.randomDish(dinnerList);
									if (tmp != null) {
										if (getDinnerQuantity() + tmp.getDishQuantity() <= DINNER_QUANTITY) {
											dinner.add(tmp);
											dinnerList.remove(tmp);
											break;
										}
									} else {
										System.out.println("随机选择晚餐出错2,selctor：" + sel.toString());
									}
								}
							}
						} else {
							System.out.println("随机选择晚餐出错1,selctor：" + sel.toString());
						}
					}
				}
			}
		}
		public String getDayInWeek() {
			return dayInWeek;
		}
	}
	/**
	 * 添加所有的菜
	 */
	private static void putAllDishes() {
		
		// params 菜名, 辣度, 油腻, 每餐比例, 适合的时间, 做法, 材料准备, 搭配
		// template
//		Dish template = new Dish("", 0, 1, 0.5f, 15,"", new Material[] {new Material(Food.wuhuarou, 1)},new String[] {""});
//		allDishes.put(template.getName(), template);
		// 西红柿炒鸡蛋
		Dish xihongshijidan = new Dish("西红柿炒鸡蛋", 0, 3, 1, 7, 
				"打鸡蛋加盐,西红柿切瓣,先加葱花炒鸡蛋,炒成8成熟倒出,再炒西红柿,出汁后放入鸡蛋同炒,放盐和糖",
				new Material[] {new Material(Food.jidan,4), new Material(Food.xihongshi,3), new Material(Food.xiaocong,1)},
				new String[] {"白米饭"});
		allDishes.put(xihongshijidan.getName(), xihongshijidan);
		// 西红柿鸡蛋面
		Dish faqiejidanmian = new Dish("番茄煎蛋面", 0, 2, 1, 14,
				"西红柿切片,热锅放猪油和清油,入锅炸。开锅后放入高汤,放白胡椒粉,盐,糖,煮5分钟。按人头每人一个煎蛋。另起一锅煮面,煮好后放入番茄汤中",
				new Material[] {new Material(Food.jidan, 4), new Material(Food.xihongshi,3), new Material(Food.gaotang,1)},
				new String[] {""});
		allDishes.put(faqiejidanmian.getName(), faqiejidanmian);
		// 黄瓜炒鸡蛋
		Dish huangguachaojidan = new Dish("黄瓜炒鸡蛋", 0, 3, 1, 7,
				"两根黄瓜,四个鸡蛋,黄瓜切片,鸡蛋打散加葱花,油热后先炒鸡蛋8成熟,然后倒出再炒黄瓜,不要炒出水,放入鸡蛋翻炒即可",
				new Material[] {new Material(Food.jidan, 4), new Material(Food.huanggua,2), new Material(Food.xiaocong,1)},
				new String[] {"白米饭"});
		allDishes.put(huangguachaojidan.getName(), huangguachaojidan);
		// 青椒炒肉
		Dish qingjiaochaorou = new Dish("青椒炒肉", 6, 3, 1, 7,
				"肉事先腌制,放葱姜酱油料酒淀粉,肉与青椒切丝,炝锅炒肉,8成熟后到处,再炒辣椒放入肉炒熟即可", 
				new Material[] {new Material(Food.zhurou, 300, "g"), new Material(Food.qingjiao,4)},
				new String[] {"白米饭"});
		allDishes.put(qingjiaochaorou.getName(), qingjiaochaorou);
		// 蒜香烤猪排骨
		Dish kaopaigu = new Dish("烤排骨", 0, 3, 1, 7,
				"麻椒放白酒泡一会,大蒜一个挤成蒜泥,加入葱,姜,酱油,糖。少量花椒和大量麻椒弄碎倒入碗中。"
						+ "把排骨放进去涂抹均匀腌制2个小时,烤箱230度烤制大概40分钟,中间翻面一次", 
				new Material[] {new Material(Food.zhupaigu, 1000, "g"), new Material(Food.suan,1), new Material(Food.qinghuajiao,1), new Material(Food.jiangyou,1)},
				new String[] {"青菜","蛋花汤"});
		allDishes.put(kaopaigu.getName(), kaopaigu);
		// 葱姜炒鸡块
		Dish congjiangchaojikuai = new Dish("葱姜炒鸡块", 4, 4, 1, 7,
				"鸡半只,最好6个月左右,去掉屁股和鸡爪,生姜50g,小葱树根,甜椒。锅适量清水,料酒,放入鸡肉大火烧开后倒出鸡肉备用"
				+ "锅加入底油,5成热后下鸡肉炒1分钟,鸡肉需要炒干,下姜和葱段炒出香味,加入蚝油,酱油,上好色后加料酒。再加适量清水"
				+ "10分钟后加入盐,白糖,胡椒粉,加入红椒片,最后淋明油", 
				new Material[] {new Material(Food.ji, 1), new Material(Food.jiang,1), new Material(Food.xiaocong,1)},
				new String[] {"白米饭"});
		allDishes.put(congjiangchaojikuai.getName(), congjiangchaojikuai);
		// 盐酥鸡
		Dish yansuji = new Dish("盐酥鸡", 1, 7, 1, 7,
				"鸡肉加葱片,生姜,料酒,生抽,胡椒粉,青花椒,拌匀5分钟拿出。干淀粉,食用盐,花椒面拌好后给鸡肉挂干糊"
				+ "宽油6成热放入鸡块,中火炸90秒,捞出,升温7成热,复炸25秒,关火捞出",
				new Material[] {new Material(Food.jirou, 500, "g"), new Material(Food.hujiaofen,1), new Material(Food.qinghuajiao,4)},
				new String[] {"啤酒","饮料"});
		allDishes.put(yansuji.getName(), yansuji);
		// 烤面包片
		Dish kaomianbaopian = new Dish("烤面包片", 0, 2, 1, 8,
				"化一片奶油,6片面包片蘸奶油,撒上白糖,不用预热放入烤箱中200度大概8分钟",
				new Material[] {new Material(Food.mianbaopian, 6), new Material(Food.huangyou,1)},
				new String[] {"煎蛋","牛奶"});
		allDishes.put(kaomianbaopian.getName(), kaomianbaopian);
		// 水煮牛肉
		Dish shuizhuniurou = new Dish("水煮牛肉", 5, 4, 1, 7,
				"牛肉切0.2厘米片。加清水洗净后挤干水分。盐,料酒,姜葱水加苏打加一个蛋清按摩腌制牛肉片。"
				+ "青笋,金针菇,生菜,豆芽都可以作为底菜,入锅炒香,加点盐。"
				+ "用菜籽油,猪油混合炒香豆瓣酱,加入 姜末蒜末炒香,加入刀口海椒,加汤熬制几分钟,需要少放点水，保证最后出锅时汤的浓度，最好是比较干的汁"
				+ "肉片下锅,加水淀粉1分钟左右。起锅加入花椒粉辣椒,蒜末,葱花,之后用热油连点三下",
				new Material[] {new Material(Food.niurou, 300, "g"), new Material(Food.jinzhengu,1), new Material(Food.shengcai,1), new Material(Food.qingsun,1), new Material(Food.douya,1),
						 new Material(Food.doubanjiang,1), new Material(Food.suan,1), new Material(Food.qinghuajiao,1), new Material(Food.xiaocong,1), new Material(Food.ganlajiao,1)},
				new String[] {"白米饭"});
		allDishes.put(shuizhuniurou.getName(), shuizhuniurou);
		// 酱油蒜烤鸡腿
		Dish jiangyousuankaojitui = new Dish("酱油蒜烤鸡腿", 0, 3, 1, 7,
				"麻椒放白酒泡一会,大蒜一个挤成蒜泥,加入葱,姜,酱油,糖。少量花椒和大量麻椒弄碎加水煮沸,倒入碗中。"
				+ "把鸡腿放进去腌制一宿,烤箱230度烤制大概40分钟,中间翻面一次", 
				new Material[] {new Material(Food.jitui, 12), new Material(Food.qinghuajiao,1), new Material(Food.suan, 1), new Material(Food.jiangyou,1)},
				new String[] {"啤酒","饮料"});
		allDishes.put(jiangyousuankaojitui.getName(), jiangyousuankaojitui);
		// 酱油蒜烤鸡翅
		Dish jiangyousuankaojichi = new Dish("酱油蒜烤鸡翅", 0, 1, 1, 7,
				"麻椒放白酒泡一会,大蒜一个挤成蒜泥,加入葱,姜,酱油,糖。少量花椒和大量麻椒弄碎加水煮沸,倒入碗中。"
						+ "把鸡翅放进去腌制一宿,烤箱230度烤制大概40分钟,中间翻面一次", 
						new Material[] {new Material(Food.jichi, 20), new Material(Food.qinghuajiao,1), new Material(Food.suan, 1), new Material(Food.jiangyou,1)},
						new String[] {"啤酒","饮料"});
		allDishes.put(jiangyousuankaojichi.getName(), jiangyousuankaojichi);
		// 饺子
		Dish jiaozi = new Dish("饺子", 0, 1, 2, 7,"这个靠嘿嘿了",
				new Material[] {new Material(Food.zhurouxian, 1), new Material(Food.niurouxian,1), new Material(Food.xiaren, 200, "g"), new Material(Food.huluobo,1),
						 new Material(Food.bailuobo,1), new Material(Food.jiucai, 200, "g"), new Material(Food.baicai,1)},
				new String[] {""});
		allDishes.put(jiaozi.getName(), jiaozi);
		// 烤披萨
		Dish kaopizza = new Dish("烤披萨", 0, 3, 1, 7,"买现成的,烤就行了", 
				new Material[] {new Material(Food.pizza, 1)},
				new String[] {"啤酒","饮料","炸鸡"});
		allDishes.put(kaopizza.getName(), kaopizza);
		// 美式烤猪排
		Dish meishikaozhupai = new Dish("美式烤猪排", 2, 4, 1, 7,
				"把猪排里面的筋膜撕掉,撒入腌料,用锡纸包两层,烤箱190摄氏度烤1个半小时,拿出来打开锡纸刷调料酱200度再烤20分钟", 
				new Material[] {new Material(Food.zhupaigu, 1000, "g") , new Material(Food.kaopaiguyanliao,1), new Material(Food.kaopaigujiang,1)},
				new String[] {"啤酒","饮料","色拉"});
		allDishes.put(meishikaozhupai.getName(), meishikaozhupai);
		// 锅包肉
		Dish guobaorou = new Dish("锅包肉", 0, 4, 1,7,
				"里脊肉切成3毫米薄片,土豆淀粉调制成拉丝状,加入肉片搅拌均匀。生姜,大葱,胡萝卜丝备用"
				+ "调汁,白糖30g,9度白醋20g,加入水。宽油6成热,加入肉片,50s,定型。7成热油,再下肉片复炸。"
				+ "30s后捞出肉片。下入料汁烧开,加入淀粉勾芡,下肉片,下入葱姜胡萝卜丝", 
				new Material[] {new Material(Food.zhurou, 300, "g") , new Material(Food.huluobo,1), new Material(Food.xiaocong,1),new Material(Food.baicu,1)},
				new String[] {"白米饭"});
		allDishes.put(guobaorou.getName(), guobaorou);
		// 西红柿炖牛肉
		Dish xihongshidunniurou = new Dish("西红柿炖牛肉", 0, 2, 2, 7,
				"牛肉飞水,另换一锅水加葱姜煮1个小时,然后放入切好的西红柿再炖1个小时,加入胡椒粉和盐",
				new Material[] {new Material(Food.niurou, 600, "g") , new Material(Food.jiang,1), new Material(Food.xihongshi,3)},
				new String[] {"白米饭"});
		allDishes.put(xihongshidunniurou.getName(), xihongshidunniurou);
		// 土豆炖牛肉
		Dish tudoudunniurou = new Dish("土豆炖牛肉", 0, 2, 2, 7,
				"牛肉切麻将大小飞水,另入一锅中放入葱姜,花椒,大料,香叶炖煮1个小时,放入滚刀块土豆加少量酱油再炖煮1小时收汁",
				new Material[] {new Material(Food.niurou, 1000, "g") , new Material(Food.tudou,4)},
				new String[] {"白米饭"});
		allDishes.put(tudoudunniurou.getName(), tudoudunniurou);
		// 咖喱炖牛肉
		Dish galidunniurou = new Dish("咖喱炖牛肉", 2, 2, 2, 7,
				"牛肉切麻将大小飞水,另入一锅中放入葱姜,花椒,大料,香叶炖煮1个小时,放入滚刀块土豆炖煮半小时,下入咖喱再炖半小时。收汁即可", 
				new Material[] {new Material(Food.niurou, 600, "g") , new Material(Food.jiang,1), new Material(Food.huanggali,1)},
				new String[] {"白米饭"});
		allDishes.put(galidunniurou.getName(), galidunniurou);
		// 早餐饼
		Dish zaocanbing = new Dish("早餐饼", 0, 1, 1, 8,
				"两小杯面,一个鸡蛋加温水搅拌,里面可以根据自己的口味加葱,糖,盐。搅拌至糊状。一勺勺如平底锅两面烙金黄即可",
				new Material[] {new Material(Food.baimian, 200, "g") , new Material(Food.jidan,1)},
				new String[] {"牛奶","sirop","煎鸡蛋"});
		allDishes.put(zaocanbing.getName(), zaocanbing);
		// 煎鸡蛋
		Dish jianjidan = new Dish("煎鸡蛋", 0, 3, 1, 8,
				"倒油,放鸡蛋,翻面",
				new Material[] {new Material(Food.jidan, 4)},
				new String[] {"牛奶","面包片"});
		allDishes.put(jianjidan.getName(), jianjidan);
		// 鸡蛋糕
		Dish jidangao = new Dish("鸡蛋糕", 0, 1, 1, 14,
				"蒸锅加水烧热。小钢盆,加入四个鸡蛋,葱花,海米,胡椒粉,加热水搅打均匀。加盐去掉上面的泡,再搅拌一下"
				+ "入蒸锅中小火蒸12分钟,关火后一分钟。拿出后加酱油,香油等", 
				new Material[] {new Material(Food.jidan, 4) , new Material(Food.xiaocong,1), new Material(Food.haimi,1)},
				new String[] {"面包片","白米饭"});
		allDishes.put(jidangao.getName(), jidangao);
		// 摊鸡蛋
		Dish tanjidan = new Dish("摊鸡蛋", 0, 4, 1, 14,
				"鸡蛋四个,加葱花盐几滴水,搅打均匀。热锅多油,冒烟后入锅。翻面稍等一下即熟", 
				new Material[] {new Material(Food.jidan, 4)},
				new String[] {"白米饭","牛奶","面包片"});
		allDishes.put(tanjidan.getName(), tanjidan);
		// 溜肉段
		Dish liurouduan = new Dish("溜肉段", 0, 4, 1, 7,
				"里脊肉切成1厘米粗,3厘米长的小段。洗净挤干。土豆淀粉或绿豆淀粉150g,调糊。里脊肉导入碗中,加入盐,加油拌匀。"
				+ "大青椒两个,红椒,洋葱切片。白糖,蚝油,生抽酱油,清水,干淀粉拌匀。宽油6热炸肉,炸2分钟。捞出"
				+ "炒辅料下里脊肉,再放入调好的料汁。翻炒几下后加明油装盘",
				new Material[] {new Material(Food.lijirou, 4) , new Material(Food.dianfen,1), new Material(Food.qingjiao,1), new Material(Food.yangcong,1)},
				new String[] {"白米饭"});
		allDishes.put(liurouduan.getName(), liurouduan);
		// 煎牛排
		Dish jianniupai = new Dish("煎牛排", 0, 2, 1, 14,
				"洋葱0.5个到1个,或者蘑菇。牛排先在表面撒盐和黑胡椒粉,锅烧热加黄油,蒜片,煎香后有调料的那一面朝底放入锅中煎1分钟"
				+ "煎的过程中撒盐和黑胡椒,翻面。旁边加入辅料。撒盐。煎1分钟。牛排厚度不一,煎的时候随时观察。再翻面煎一小会", 
				new Material[] {new Material(Food.niupai, 1), new Material(Food.yangcong,1), new Material(Food.mogu, 1), new Material(Food.suan,1)},
				new String[] {"红酒 "});
		allDishes.put(jianniupai.getName(), jianniupai);
		// 火锅
		Dish huoguo = new Dish("火锅", 6, 3, 2, 4,
				"买麻辣锅底料加水,葱,蒜,姜。再调好调料。调料使用麻将或者花生酱,加蚝油,韭菜花,腐乳,盐,热水搅拌。吃的时候加"
				+ "葱花和香菜。也可以做蒜泥香油调料。", 
				new Material[] {new Material(Food.huoguodiliao, 1), new Material(Food.zhimajiang,1), new Material(Food.huashengjiang,1), new Material(Food.xiangyou, 1), new Material(Food.yangrou,1)},
				new String[] {"啤酒","饮料"});
		allDishes.put(huoguo.getName(), huoguo);
		// 芹菜炒肉
		Dish qincaichaorou = new Dish("芹菜炒肉", 0, 1, 1, 7,
				"里脊肉切丝加少量酱油,糖,胡椒粉,葱花淀粉腌制10分钟,芹菜切丝。锅中倒油,加入肉炒7成熟,加芹菜,同时加盐给芹菜断生即可",
				new Material[] {new Material(Food.lijirou, 300,"g"), new Material(Food.qincai,1)},
				new String[] {"白米饭"});
		allDishes.put(qincaichaorou.getName(), qincaichaorou);
		// 蒜苗炒肉
		Dish suanmiaochaorou = new Dish("蒜苗炒肉", 0, 1, 1, 7,
				"里脊肉切丝加少量酱油,糖,胡椒粉,葱花淀粉腌制10分钟,蒜苗切丝。锅中倒油,加入肉炒7成熟,加蒜苗,同时加盐给蒜苗断生即可",
				new Material[] {new Material(Food.lijirou, 300,"g"), new Material(Food.suanmiao,1)},
				new String[] {"白米饭"});
		allDishes.put(suanmiaochaorou.getName(), suanmiaochaorou);		
		// 葱爆羊肉
		Dish congbaoyangrou = new Dish("葱爆羊肉", 0, 1, 1, 7,
				"羊通脊抹刀切片,切葱,使用滚刀切,一半放入羊肉中,一半放另一容器内。羊肉放入料酒,葱姜水,酱油,香油,盐,白糖"
				+ "抓匀,腌制入味,最好提前1小时。热锅放油,放入羊肉,急火快炒。再放另一半葱,放入酱油,出勺的时候放点醋锅边淋入,再加点香油",
				new Material[] {new Material(Food.yangrou, 1), new Material(Food.dacong,1), new Material(Food.xiangyou, 1)},
				new String[] {"白米饭"});
		allDishes.put(congbaoyangrou.getName(), congbaoyangrou);
		// 烤肠
		Dish kaochang = new Dish("烤肠", 0, 3, 1, 7,
				"超市买放入烤箱中20分钟", 
				new Material[] {new Material(Food.kaochang, 3)},
				new String[] {"饮料","汤"});
		allDishes.put(kaochang.getName(), kaochang);
		// 烤鸡块
		Dish kaojikuai = new Dish("烤鸡块", 0, 3, 1, 7,
				"超市买,放入烤箱中大概25分钟", 
				new Material[] {new Material(Food.jikuai, 10)},
				new String[] {"饮料","汤"});
		allDishes.put(kaojikuai.getName(), kaojikuai);
		// 排骨炖冬瓜
		Dish paigudundonggua = new Dish("排骨炖冬瓜", 0, 1, 2, 6,
				"排骨飞水放入另一锅中,加水,料酒,葱,姜,八角,花椒,香叶,小火2小时,在放入冬瓜大概1小时煮烂", 
				new Material[] {new Material(Food.zhupaigu, 1000, "g"), new Material(Food.donggua, 1)},
				new String[] {"白米饭"});
		allDishes.put(paigudundonggua.getName(), paigudundonggua);
		// 排骨炖豆角
		Dish paigudundoujiao = new Dish("排骨炖豆角", 0, 1, 2, 6,
				"排骨飞水放入另一锅中,加水,料酒,葱,姜,八角,花椒,香叶,小火2小时,在放入豆角大概1小时煮烂",
				new Material[] {new Material(Food.zhupaigu, 1000, "g"), new Material(Food.doujiao, 1)},
				new String[] {"白米饭"});
		allDishes.put(paigudundoujiao.getName(), paigudundoujiao);
		// 可乐鸡翅
		Dish kelejichi = new Dish("可乐鸡翅", 0, 4, 1, 7,
				"锅下油,姜,葱。煎鸡翅,7成熟后加入可乐,酱油,酱油要稍微少点,不然都是酱油的味道了。中火烧制收汁", 
				new Material[] {new Material(Food.jichi, 1000, "g"), new Material(Food.kele, 1)},
				new String[] {"白米饭"});
		allDishes.put(kelejichi.getName(), kelejichi);
		// 东坡肉
		Dish dongporou = new Dish("东坡肉", 0, 7, 1, 6,
				"五花肉2斤皮朝下入锅煮,当水开后就捞出。表面洗干净用刀刮皮,把毛除尽。切成5cm见方的块。砂锅垫竹篦,上面铺小葱,姜片。肉皮向下放入砂锅中。放入黄酒过肉的一半,老抽,糖。大火转"
				+ "小火2小时,中间一小时后翻面。油需要打走。拿出来放汁入蒸锅中火蒸半个小时", 
				new Material[] {new Material(Food.wuhuarou, 1000, "g"), new Material(Food.xiaocong, 1),new Material(Food.jiang, 1), new Material(Food.tang, 1)},
				new String[] {"白米饭"});
		allDishes.put(dongporou.getName(), dongporou);
		// brisket
		Dish brisket = new Dish("brisket", 0, 3, 1, 7,
				"切掉表面大块的肥肉,留下少部分薄的肥肉,撒腌料,放250华氏度8小时。中间翻一次。用butcher paper包上再烤5个小时 ", 
				new Material[] {new Material(Food.brisket, 1), new Material(Food.Schwartz, 1)},
				new String[] {"啤酒","饮料","矿泉水"});
		allDishes.put(brisket.getName(), brisket);
		// 西湖煎蛋
		Dish xihujiandan = new Dish("西湖煎蛋", 0, 3, 1, 7,
				"猪肉末,虾皮入水炒干->香,四个鸡蛋打散,加入盐,醋。韭菜一分为二,入锅,加入少许的水和油,让其变软。等韭菜有香气了拿出来。肉末虾皮加入蛋液中。"
				+ "锅入油,放入一半蛋液摊鸡蛋,入 韭菜,再放剩下蛋液,要小火。加水煮,盐,糖,酱油,勾芡汁,后放醋。",
				new Material[] {new Material(Food.zhurouxian, 200, "g"), new Material(Food.jidan, 4),new Material(Food.jiucai, 1)},
				new String[] {"白米饭"});
		allDishes.put(xihujiandan.getName(), xihujiandan);
		// 醋溜白菜
		Dish culiubaicai = new Dish("醋溜白菜", 0, 1, 1, 6,
				"长白菜先拍几下,抹刀法切片,切葱粒,干辣椒段。醋2.5克,酱油1.5克,盐,淀粉,糖,水调汁。热锅,油将葱干辣椒爆香。入白菜,当边上有点发软发黄的时候沿着锅边加入芡汁", 
				new Material[] {new Material(Food.baicai, 200, "g"), new Material(Food.micu, 4),new Material(Food.xiaocong, 1), new Material(Food.ganlajiao, 1)},
				new String[] {"白米饭"});
		allDishes.put(culiubaicai.getName(), culiubaicai);
		// 炒饭
		Dish chaofan = new Dish("炒饭", 0, 2, 1, 7,
				"先准备炒饭需要的配料,比如火腿,虾仁,青豆,玉米,胡萝卜,黄瓜等。凉米饭1人分量,加入一个鸡蛋还有 白胡椒粉搅拌,热锅稍多油,将需要炒香的肉类炒好后加入米饭翻炒均匀,加入其它配料加盐翻炒均匀即可",
				new Material[] {new Material(Food.mifan, 1), new Material(Food.huotui, 1),new Material(Food.xiaren, 1),new Material(Food.qingdou, 1), 
						new Material(Food.yumili, 1),new Material(Food.huluobo, 1),new Material(Food.huanggua, 1),new Material(Food.jidan, 1)},
				new String[] {""});
		allDishes.put(chaofan.getName(), chaofan);
		// 蒜蓉西兰花
		Dish suanrongxilanhua = new Dish("蒜蓉西兰花", 0, 1, 1, 7,
				"切好的西兰花焯水,热锅加油,下蒜蓉,炒香后加的西兰花,加盐翻炒均匀", 
				new Material[] {new Material(Food.xilanhua, 300, "g"), new Material(Food.suan, 1)},
				new String[] {"白米饭"});
		allDishes.put(suanrongxilanhua.getName(), suanrongxilanhua);
		// 肉炒木耳
		Dish rouchaomuer = new Dish("肉炒木耳", 0, 1, 1, 7,
				"里脊肉切丝,加酱油,淀粉,料酒,葱姜腌制10分钟,黑木耳焯水。热锅加油,将肉炒成8成熟,加黑木耳,盐翻炒均匀", 
				new Material[] {new Material(Food.heimuer, 1), new Material(Food.lijirou, 300, "g")},
				new String[] {"白米饭"});
		allDishes.put(rouchaomuer.getName(), rouchaomuer);
		// 辣子鸡
		Dish laziji = new Dish("辣子鸡", 7, 6, 1, 6,
				"仔公鸡半只,去除内脏,洗净,擦干。剁成1cm左右备用。加入盐5g,胡椒粉,料酒3g,生抽酱油3g,加入鸡蛋黄一个。搅拌均匀,加入3g淀粉,加10g植物油拌匀。姜30g大蒜20g小葱20g切碎"
				+ "七星椒,子弹头,灯笼椒,各30g,青花椒30g。起锅前撒料：1.花生米40g,熟芝麻10g。花椒油5g,香油10g。锅烧热,宽油7热,加入鸡块。炸1分钟。捞出。在加热刀8成热,下入鸡肉炸至酥脆"
				+ "捞出。加入菜籽油,青花椒,干辣椒,蒜末姜末小葱。爆香。再加入鸡肉。炒2分钟。加入少许白糖提鲜,香醋,加入油酥花生米和芝麻,调料油和盐翻炒均匀", 
				new Material[] {new Material(Food.ji, 1), new Material(Food.jidan, 1),new Material(Food.suan, 1), new Material(Food.jiang, 1),
						new Material(Food.xiaocong, 1), new Material(Food.ganlajiao, 1),new Material(Food.qinghuajiao, 1), new Material(Food.huasheng, 1),
						new Material(Food.zhima, 1), new Material(Food.huajiaoyou, 1),new Material(Food.xiangyou, 1)},
				new String[] {"白米饭"});
		allDishes.put(laziji.getName(), laziji);
		// 麻婆豆腐
		Dish mapodoufu = new Dish("麻婆豆腐", 5, 4, 1, 7,
				"豆腐400g,切成1.2厘米的小方形,带肥肉的牛肉末50g,泡姜15g,泡椒20g,蒜苗1根。刀口辣椒,永川豆豉。"
				+ "水加盐,中小火焯豆腐,当水快开时,捞出。油加入猪油10g,加入牛肉末。爆香。加入豆瓣酱,加入其它辅料"
				+ "爆出红油后加入刀口辣椒,加入清水。加盐,白糖,少量老抽。小火加入豆腐烧5分钟。分3此加入芡汁", 
				new Material[] {new Material(Food.doufu, 400, "g"), new Material(Food.niurouxian, 50, "g"), new Material(Food.doubanjiang, 1), new Material(Food.douchi, 1), new Material(Food.ganlajiao, 1)},
				new String[] {"白米饭"});
		allDishes.put(mapodoufu.getName(), mapodoufu);
		// 手抓饭
		Dish shouzhuafan = new Dish("手抓饭", 0, 3, 1, 7,
				"米泡水。羊肉250g切大点的块,胡萝卜3根切丝,洋葱一个切丝,先宽油炸肉,表面熟了但没有变金黄,下洋葱,再下胡萝卜"
				+ "等肉表面金黄,洋葱和胡萝卜都有些蔫的时候,倒出多余的油。加入与表面平齐的水,小火 炖10分钟后加入泡好的米。等水在米之下后。小火30分钟。出锅拌匀即可",
				new Material[] {new Material(Food.wuhuarou, 1)},
				new String[] {""});
		allDishes.put(shouzhuafan.getName(), shouzhuafan);
		// 粉蒸肉
		Dish mifenrou = new Dish("米粉肉", 0, 4, 1, 6,
				"炒米,放桂皮,大料一起用小火炒,微黄后给一点中火。然后拿出来等一会凉凉。用擀面杖捣碎。葱姜丝,五花肉最好瘦肉多一点,切片加一点酱油,料酒,甜面酱,糖,盐,香油,抓腌肉半小时。加1/3肉的米粉拌匀,在加一点水或者酱油"
				+ "老抽都可以。肉皮朝下码碗,碗最好使用比较平的碗,蒸90分钟,大火转中火,蒸的时候碗上不用盖盖。碗中的水倒出来。然后扣过来即成", 
				new Material[] {new Material(Food.dami, 1), new Material(Food.wuhuarou, 500, "g"), new Material(Food.tianmianjiang, 1), new Material(Food.daliao, 1), new Material(Food.guipi, 1)},
				new String[] {"白米饭"});
		allDishes.put(mifenrou.getName(), mifenrou);
		// 紫菜鸡蛋汤
		Dish zicaijidantang = new Dish("紫菜鸡蛋汤", 0, 1, 1, 6,
				"汤中放紫菜，碗中打3个鸡蛋打散后倒入汤中，加盐即可", 
				new Material[] {new Material(Food.zicai, 1), new Material(Food.jidan, 1)},
				new String[] {"白米饭"});
		allDishes.put(zicaijidantang.getName(), zicaijidantang);
		// salad
		Dish salad = new Dish("salad", 0, 1, 1, 7,
				"随便拌就行了", 
				new Material[] {new Material(Food.shalacai, 1),new Material(Food.shalajiang, 1)},
				new String[] {""});
		allDishes.put(salad.getName(), salad);
		// 汉堡
		Dish hanbao = new Dish("汉堡", 0, 3, 1, 7,
				"鲜牛肉 馅加少许盐，带保鲜膜每天揉，大概20天后取出。把面包包肉的一面用油烤焦一点，洋葱加入油和盐小火加焦糖煎发黑，蘑菇切片煎熟。"
				+ "肉馅一分为二，中间加培根，芝士。包上后上烤盘，或者煎锅，烤4分钟，中间翻面一次。拿出来后加蔬菜，酱，洋葱，果醋即成",
				new Material[] {new Material(Food.niurouxian, 1), new Material(Food.peigen, 1)},
				new String[] {"啤酒"});
		allDishes.put(hanbao.getName(), hanbao);
		// 羊肉串
		Dish angeauBaton = new Dish("羊肉串", 0, 1, 1, 15,
				"adonis买新鲜的羊肩肉，每人半斤分量，以下按3斤羊肉准备，切成块，块的大小根据孩子和大人的要求分开。挤入一块生姜汁，一个洋葱切小快放入，放入适量的盐，孜然粉，油，搅拌均匀。腌制1小时",
				new Material[] {new Material(Food.yangrou, 3), new Material(Food.ziran, 1)},
				new String[] {"啤酒"});
		// 核桃酪
		allDishes.put(angeauBaton.getName(), angeauBaton);
		Dish hetaolao = new Dish("核桃酪", 0, 0, 0, 0
				,"红枣洗净蒸，蒸透后加点水捏烂，过滤。江米泡3个小时。用适量的去皮核桃和水一起磨细，加冰糖用小火煮。用非铁锅煮。江米容易糊，煮的时候要不停搅动。煮到完全成熟，再加枣泥，呈现细腻稠滑状态时，关火", 
				new Material[] {new Material(Food.zao, 1),new Material(Food.hetao, 1),new Material(Food.jiangmi, 1),new Material(Food.huangbingtang, 1)},
				new String[] {""});
		allDishes.put(hetaolao.getName(), hetaolao);
		// 大盘鸡
		Dish dapanji = new Dish("大盘鸡", 5, 5, 2, 7,
				"土豆切块加酱油和盐煮，要煮面。两个琵琶腿， 切好后盐，黄酒，胡椒粉， 花椒粉，玉米淀粉腌制一下。葱姜切好。豆瓣酱，新疆线辣椒，花椒。炒糖色。葱姜花椒下锅炒香，加入鸡。慢慢扁香鸡。出油后下糖色。下豆瓣酱，花椒面。加水，汤汁宽一点"
				+ "下盐，酱油。放新疆线辣椒。煮一会后放土豆 出锅前蒜拍好，斩一下。等汤汁粘稠后，下葱，蒜，青辣椒"
				, new Material[] {new Material(Food.pipatui, 2), new Material(Food.tudou, 3), new Material(Food.honglalajiao, 1), new Material(Food.qingjiao, 1)},new String[] {""});
		allDishes.put(dapanji.getName(), dapanji);
		// template
//		Dish template = new Dish("", 0, 1, 1, 15,"", new Material[] {new Material(Food.wuhuarou, 1)},new String[] {""});
//		allDishes.put(template.getName(), template);
	}
}
