package designpatterns.specification;

public interface Specification<T> {

	boolean isSatisfied(T item);

}
