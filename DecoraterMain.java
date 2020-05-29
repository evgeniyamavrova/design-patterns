package Decorator;

public class DecoraterMain {

	public static void main(String[] args) {
		Burger ClassicBurger = new ClassicBurger();
		ClassicBurger.create();
		
	Burger CheeseBurger = new CheeseBurger();
	CheeseBurger.create();

	}

}
