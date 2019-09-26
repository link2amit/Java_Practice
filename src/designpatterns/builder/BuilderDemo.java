package designpatterns.builder;

import designpatterns.builder.Tea.TeaBuilder;

public class BuilderDemo {

	public static void main(String[] args) {
		TeaBuilder teaBuilder = new TeaBuilder();
		Tea tea = teaBuilder.teaLeaf().sugar().milk().build();
		System.out.println(tea);
	}

}
