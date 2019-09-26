package designpatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonBreakerReflection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LazyLoadingStaticMethodSingleton singleton1 = LazyLoadingStaticMethodSingleton.getInstance();
		Class<LazyLoadingStaticMethodSingleton> clazz = LazyLoadingStaticMethodSingleton.class;
		LazyLoadingStaticMethodSingleton singleton2 = null;
		try {
			Constructor<LazyLoadingStaticMethodSingleton> constructor = clazz
					.getDeclaredConstructor(LazyLoadingStaticMethodSingleton.class);
			constructor.setAccessible(Boolean.TRUE);
			singleton2 = constructor.newInstance(LazyLoadingStaticMethodSingleton.class);
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}

		System.out.println(singleton1);
		System.out.println(singleton2);
	}

}
