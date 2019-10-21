package triplet;

public class CommandFactory {
	private Command cmd;
	public CommandFactory() {
		// TODO Auto-generated constructor stub
	}

	public Command createCommand(String actionName, Triplet triplet) {
		if(actionName == "Changer A") {
			cmd = new ChangerACmd(triplet);
		} else if (actionName == "Changer B") {
			cmd = new ChangerBCmd(triplet);
		} else {
			cmd = new ChangerCCmd(triplet);
		}
		return(cmd);
	}
}
