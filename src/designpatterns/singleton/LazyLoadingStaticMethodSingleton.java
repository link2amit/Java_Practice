package designpatterns.singleton;

public class LazyLoadingStaticMethodSingleton {

	private static volatile LazyLoadingStaticMethodSingleton singleton;
	
	private LazyLoadingStaticMethodSingleton() {
		if(singleton != null) {
			throw new RuntimeException("Illegal invocation of constructor");
		}
		
	}
	
	
	public static LazyLoadingStaticMethodSingleton getInstance() {
		if(singleton == null) {
			return singleton = new LazyLoadingStaticMethodSingleton();
		}
		return singleton;
	}
	
}
