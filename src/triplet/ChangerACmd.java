package triplet;

public class ChangerACmd implements Command{
	private Triplet triplet;
	public ChangerACmd(Triplet triplet) {
		// TODO Auto-generated constructor stub
		this.triplet = triplet;
	}

	@Override
	public void execute(int nombre) {
		// TODO Auto-generated method stub
		triplet.setA(nombre);
	}

}
