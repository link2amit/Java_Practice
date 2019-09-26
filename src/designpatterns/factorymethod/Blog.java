package designpatterns.factorymethod;

public class Blog implements Website {

	@Override
	public void run() {
		System.out.println("Running Blog website");;
	}

}
