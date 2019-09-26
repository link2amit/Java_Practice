package designpatterns.builder;

public class Tea {

	private String teaLeaf;
	private String sugar;
	private String milk;
	private String cardamom;
	private String cinnamon;

	private Tea(TeaBuilder teaBuilder) {
		this.teaLeaf = teaBuilder.teaLeaf;
		this.sugar = teaBuilder.sugar;
		this.milk = teaBuilder.milk;
		this.cardamom = teaBuilder.cardamom;
		this.cinnamon = teaBuilder.cinnamon;
	}

	public static class TeaBuilder {
		private String teaLeaf;
		private String sugar;
		private String milk;
		private String cardamom;
		private String cinnamon;

		public Tea build() {
			return new Tea(this);
		}

		public TeaBuilder teaLeaf() {
			this.teaLeaf = "Added Tealeaf";
			return this;
		}

		public TeaBuilder sugar() {
			this.sugar = "Added Sugar";
			return this;
		}

		public TeaBuilder milk() {
			this.milk = "Added milk";
			return this;
		}

		public TeaBuilder cardamom() {
			this.cardamom = "Added cardamom";
			return this;
		}

		public TeaBuilder cinnamon() {
			this.cinnamon = "Added cinnamon";
			return this;
		}
	}

	@Override
	public String toString() {
		return "Tea [teaLeaf=" + teaLeaf + ", sugar=" + sugar + ", milk=" + milk + ", cardamom=" + cardamom
				+ ", cinnamon=" + cinnamon + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
