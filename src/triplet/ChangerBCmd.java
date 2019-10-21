package triplet;

public class ChangerBCmd implements Command{
	private Triplet triplet;
	public ChangerBCmd(Triplet triplet) {
		// TODO Auto-generated constructor stub
		this.triplet = triplet;
	}

	@Override
	public void execute(int nombre) {
		// TODO Auto-generated method stub
		triplet.setB(nombre);
	}

}
