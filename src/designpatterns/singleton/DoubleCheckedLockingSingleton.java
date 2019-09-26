package designpatterns.singleton;

public class DoubleCheckedLockingSingleton {

	
	
	private static volatile DoubleCheckedLockingSingleton singleton;
	
	private DoubleCheckedLockingSingleton() {
		if(singleton != null) {
			throw new RuntimeException("Illegal access to the private constructor, use getInstance()");
			
		}
		
	}
	
	public DoubleCheckedLockingSingleton getInstance() {
		if(singleton == null) {
			synchronized(DoubleCheckedLockingSingleton.class) {
				if(singleton == null) {
					return new DoubleCheckedLockingSingleton();
				}
			}
		}
		return singleton;
	}
	
	
}
