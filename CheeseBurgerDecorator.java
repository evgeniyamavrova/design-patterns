package Decorator;

public class CheeseBurgerDecorator implements Burger {

	private static final Burger decoratedBurger = null;
	public CheeseBurgerDecorator(Burger decoratedBurger) {
		super();
	}
	
	@Override
	public void create() {
		this.decoratedBurger.create();
		setCheese(decoratedBurger);

	}
private void setCheese(Burger decoratedBurger) {
System.out.println("Classic Burger now is Cheese Burger");
}
}
