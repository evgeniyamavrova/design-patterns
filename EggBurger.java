package Decorator;

public class EggBurger implements Burger {

	private static final Burger decoratedBurger = null;
	public void EggBurgerDecorator(Burger decoratedBurger) {
		
	}

	@Override
	public void create() {
		this.decoratedBurger.create();
		setEgg(decoratedBurger);

	}
private void setEgg(Burger decoratedBurger) {
System.out.println("Classic Burger now is Egg Burger");
}
}
