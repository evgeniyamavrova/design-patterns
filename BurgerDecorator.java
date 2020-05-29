package Decorator;

public abstract class BurgerDecorator implements Burger {

	protected Burger decoratedBurger;
	
	public BurgerDecorator(Burger decoratedBurger) {
		this.decoratedBurger = decoratedBurger;
	}

	@Override
	public void create() {
		this.decoratedBurger.create();

	}

}
