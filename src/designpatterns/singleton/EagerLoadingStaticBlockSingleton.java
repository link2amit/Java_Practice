package designpatterns.singleton;

public class EagerLoadingStaticBlockSingleton {
	
	private static volatile EagerLoadingStaticBlockSingleton singleton;

	static {
		singleton  = new EagerLoadingStaticBlockSingleton();
	}
	
	private EagerLoadingStaticBlockSingleton() {
		
	}
	
	public static EagerLoadingStaticBlockSingleton getInstance() {
		return singleton;
	}
}
