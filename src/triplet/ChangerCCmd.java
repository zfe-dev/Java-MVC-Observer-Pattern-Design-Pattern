package triplet;

public class ChangerCCmd implements Command{
	private Triplet triplet;
	public ChangerCCmd(Triplet triplet) {
		// TODO Auto-generated constructor stub
		this.triplet = triplet;
	}

	@Override
	public void execute(int nombre) {
		// TODO Auto-generated method stub
		triplet.setC(nombre);
	}

}
