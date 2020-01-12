/**
 * 食材
 *
 */
public enum Food {
	
	// dddd("", "", ""),
	dami("dami", "rice", "大米"),
	baimian("baimian", "flour", "白面"),
	wuhuarou("wuhuarou","pork belly","五花肉"),
	xiaocong("xiaocong","","小葱"),
	dacong("dacong", "", "大葱"),
	jiang("jiang", "ginger", "姜"),
	suan("suan", "garlic", "蒜"),
	jiangyou("jiangyou", "soy sauce", "酱油"),
	shaoxingjiu("shaoxingjiu", "", "绍兴酒"),
	tang("tang", "suger", "糖"),
	yan("yan", "salt", "盐"),
	doufu("doufu","toufu","豆腐"),
	jidan("jidan","egg", "鸡蛋"),
	gaotang("gaotang","soup", "高汤"),
	huanggua("huanggua", "cucumber", "黄瓜"),
	zhurou("zhurou", "pork", "猪肉"),
	qingjiao("qingjiao","","青椒"),
	zhupaigu("zhupaigu","pork chop","猪排骨"),
	kaopaiguyanliao("kaopaiguyanliao","","烤排骨腌料"),
	kaopaigujiang("kaopaigujiang","","烤排骨酱"),
	ji("ji","whole chicken","鸡"),
	tianjiao("tianjiao","","甜椒"),
	jirou("jirou","chicken","鸡肉"),
	hujiaofen("hujiaofen","peper powder", "胡椒粉"),
	qinghuajiao("qinghuajiao","","青花椒"),
	mianbaopian("mianbaopian","sliced break","面包片"),
	huangyou("huangyou","butter","黄油"), 
	niurou("niurou","beef","牛肉"),
	jinzhengu("jinzhengu","","金针菇"),
	shengcai("shegncai","","生菜"),
	qingsun("qingsun","","青笋"),
	douya("douya","","豆芽"),
	doubanjiang("doubanjiang","","豆瓣酱"),
	ganlajiao("ganlajiao","","干辣椒"),
	jitui("jitui","chicken leg", "鸡腿"),
	jichi("jichi","chicken wings","鸡翅"),
	zhurouxian("zhurouxian","","猪肉馅"),
	niurouxian("niurouxian","","牛肉馅"),
	xiaren("xia","shrimp","虾仁"),
	huluobo("huluobo","carrot","胡萝卜"),
	bailuobo("bailuobo","","白萝卜"),
	jiucai("jiucai","","韭菜"),
	baicai("baicai","","白菜"),
	pizza("pizza","pizza","披萨"),
	baicu("白醋","vinger","白醋"),
	tudou("tudou","potato","土豆"),
	huanggali("huanggali","yellow curry","黄咖喱"),
	honggali("honggali","red curry","红咖喱 "),
	haimi("haimi","","海米"),
	lijirou("lijirou","","里脊肉"),
	dianfen("dianfen","","淀粉"),
	yangcong("yangcong","unoin","洋葱"),
	niupai("niupai","steak","牛排"),
	mogu("mogu","mushroom","蘑菇"),
	yangrou("yangrou","mutton","羊肉"),
	huoguodiliao("huoguodiliao","","火锅底料"),
	zhimajiang("zhimajiang","","芝麻酱"),
	xiangyou("xiangyou","","香油"),
	huashengjiang("huashengjiang","peanut butter", "花生酱"),
	qincai("qincai","","芹菜"),
	suanmiao("suanmiao","","蒜苗"),
	kaochang("kaochang","","烤肠"),
	jikuai("jikuai","nugget","鸡块"),
	donggua("donggau","","冬瓜"),
	doujiao("doujiao","","豆角"),
	kele("kele","","可乐"),
	brisket("brisket","Schwartz","brisket"),
	Schwartz("Schwartz","Schwartz","Schwartz调料"),
	xilanhua("xilanhua","","西兰花"),
	heimuer("heimuer","","黑木耳"),
	micu("micu","","米醋"),
	mifan("mifan","rice","米饭"),
	baiyouchang("baiyouchang","","白油肠"),
	huotui("huotui","ham","火腿"),
	qingdou("qingdou","","青豆"),
	yumili("yumili","","玉米粒"),
	yumi("yumi","corn","玉米"),
	huasheng("huasheng","peanut","花生"),
	zhima("zhima","","芝麻"),
	huajiaoyou("huajiaoyou","","花椒油"),
	douchi("douchi","","豆豉"),
	tianmianjiang("tianmianjiang","","甜面酱"),
	daliao("daliao","","大料"),
	guipi("guipi","","桂皮"),
	zicai("zicai","","紫菜"),
	shalacai("shalacai","", "沙拉菜"),
	shalajiang("shalajiang","","沙拉酱"),
	peigen("peigen","bacon","培根"),
	ziran("ziran","cumin", "孜然"),
	jiangmi("jiangmi","", "江米(糯米)"),
	huangbingtang("huangbingtang","", "黄冰糖"),
	hetao("hetao","", "核桃"),
	zao("zao","","枣"),
	pipatui("pipatui", "", "琵琶腿"),
	honglalajiao("honglalajiao", "", "红的辣的辣椒"),
	
	
	
	xihongshi("xihongshi", "tomato", "西红柿");
	
	
	private String chr;
	private String engName;
	private String msg;
	
	private Food(String chr, String engName, String msg) {
		this.chr = chr;
		this.engName = engName;
		this.msg = msg;
	}
	
	public static Food get(String val) {
        for (Food resultCode : Food.values()) {
            if (resultCode.getChr().equals(val)) {
                return resultCode;
            }
        }
        return null;
    }

	public String getChr() {
		return chr;
	}

	public String getMsg() {
		return msg;
	}

	public String getEngName() {
		return engName;
	} 
}
