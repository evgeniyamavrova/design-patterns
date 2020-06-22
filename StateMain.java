package state;

public class StateMain {
	public static void main(String[] args) {

		Context employee = new Context("Employee");
		Context employee1 = new Context("Employee1");
		
		StartState startState = new StartState();
		StopState stopState = new StopState();
		
		startState.applyState(employee);
		stopState.applyState(employee1);
		
		State playerState = employee.getState();
		String currentState = playerState.getStateName();
		System.out.println("currentState: " + currentState);
			
	}

}
