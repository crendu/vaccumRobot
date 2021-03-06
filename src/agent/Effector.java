package agent;

public abstract class Effector {

	public Effector() {
		super();
	}
	
	public enum EffectorIntentions {
		DRAWUP, PICKUP, MOVE("position");
		
		private String position;
		
		EffectorIntentions() {}
		EffectorIntentions(String position) {
			this.position = position;
		}
	}

	// Call DrawUp, PickUp or Move for an eventually action
	abstract void doAction();
	abstract void consumeEnergy ();
}
