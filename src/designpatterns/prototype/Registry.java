package designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private Map<BirthdayItems, Object> map = new HashMap<BirthdayItems, Object>();

	public void createRegistry() {

		Cake cake = new Cake();
		cake.setFlavour("Vanilla");
		map.put(BirthdayItems.CAKE, cake);
		
		Balloon balloon = new Balloon();
		balloon.setColor("Red");
		map.put(BirthdayItems.BALLOON, balloon);

	}

}
