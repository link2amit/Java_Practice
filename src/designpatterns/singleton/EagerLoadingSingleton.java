package designpatterns.singleton;

public final class EagerLoadingSingleton {

	private static volatile EagerLoadingSingleton singleton = new EagerLoadingSingleton();

	private EagerLoadingSingleton() {

	}

	public static EagerLoadingSingleton getInstance() {
		return singleton;
	}

}
