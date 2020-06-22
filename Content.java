package state;

public class Content {
private String name;
private State state;

public Context(String name) {
	this.name = name;
}

public State getState() {
	return state;
}

public void setState(State state) {
	this.state = state;
}
}
