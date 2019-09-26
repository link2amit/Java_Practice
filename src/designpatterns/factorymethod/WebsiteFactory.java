package designpatterns.factorymethod;

public class WebsiteFactory {

	public static Website createWebsite(WebsiteType websiteType) {
		switch (websiteType) {
		case NEWS:
			return new News();
		case BLOG:
			return new Blog();
		case ECOMMERCE:
			return new ECommerce();
		}

		return null;
	}

}
