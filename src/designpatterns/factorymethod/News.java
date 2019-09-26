package designpatterns.factorymethod;

public class News implements Website {
	
	private String name;

	@Override
	public void run() {
		System.out.println("News website");;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
