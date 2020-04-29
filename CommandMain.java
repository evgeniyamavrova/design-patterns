package command;

public class CommandMain {

	public static void main(String[] args) {

		RemoteControler remoteControler = new RemoteControler();
		HandsFree handsFree = new HandsFree();
		
		Command handsFreeOnCommand = new HandsFreeOnCommand(handsFree);
		Command handsFreeOffCommand = new HandsFreeOffCommand(handsFree);
		
		
		remoteControler.setCommand(handsFreeOnCommand);
		remoteControler.pressButton();
		
		
		remoteControler.setCommand(handsFreeOffCommand);
		remoteControler.pressButton();
		
		remoteControler.setCommand(handsFreeOnCommand);
		remoteControler.pressButton();
	}

}
