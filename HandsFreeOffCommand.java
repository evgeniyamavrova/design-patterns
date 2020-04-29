package command;

public class HandsFreeOffCommand implements Command {

	private HandsFree handsFree;
	
	public HandsFreeOffCommand(HandsFree handsFree) {
		this.handsFree = handsFree;
	}

	@Override
	public void execute() {
		this.handsFree.switchOff();
	}

}
