package command;

public class HandsFree {

	private Boolean HandsFreeOn;
	
	public void switchOn () {
		System.out.println("Power On");
		this.HandsFreeOn = true;
	}
	public void switchOff () {
		System.out.println("Power Off");
		this.HandsFreeOn = false;
	}
	
}
