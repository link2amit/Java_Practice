package designpatterns.factorymethod;

public class FactoryMethodDemo {

	public static void main(String[] args) {
		Website website = WebsiteFactory.createWebsite(WebsiteType.BLOG);
		website.run();

	}

}
