package triplet;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;

//TODO : Cette vue doit être informée des changements du modèle (le triplet.Triplet)
public class AffichageValeurs extends JLabel implements Observer {
	private Triplet t;

	public AffichageValeurs(Triplet t) {
		super("",JLabel.CENTER);
		this.t = t;

		afficher();
	}

	public void afficher() {
		setText(
				"A = " + String.valueOf(t.getA()) + " : " +
				"B = " + String.valueOf(t.getB()) + " : " +
				"C = " + String.valueOf(t.getC())
		);
	}

	@Override
	public void update(Observable o, Object arg) {
		this.afficher();
		
	}
}