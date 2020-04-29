package command;

public class HandsFreeOnCommand implements Command {

private HandsFree handsFree;
	
	public HandsFreeOnCommand(HandsFree handsFree) {
		this.handsFree = handsFree;
	}

	@Override
	public void execute() {
		this.handsFree.switchOn();
	}
}
