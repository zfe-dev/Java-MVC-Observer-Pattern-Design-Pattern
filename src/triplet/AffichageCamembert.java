package triplet;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

//TODO : Cette vue doit être informée des changements du modèle (le triplet.Triplet)
public class AffichageCamembert extends JPanel implements Observer {
	private Triplet t;
	private Graphics g;

	public AffichageCamembert(Triplet t) {
		this.t = t;
	}

	public void paint(Graphics g) {
		this.g = g;

		int startAngle = 0;
		int arcAngle;
		int cote = Math.min(getBounds().width, getBounds().height);
		int marge = (getBounds().width - cote)/2;

		int somme = t.getA() +   t.getB() +  t.getC();

		g.fillOval(marge,0, cote,cote);
		if(somme > 0) {

			arcAngle = (int)(360 * (float)t.getA() /somme);
			g.setColor(new Color(255,0,0));
			g.fillArc(marge,0, cote,cote, startAngle, arcAngle);

			startAngle += arcAngle;

			arcAngle = (int)(360 * (float)t.getB() /somme);
			g.setColor(new Color(0,255,0));
			g.fillArc(marge,0, cote,cote, startAngle, arcAngle);

			startAngle += arcAngle;

			arcAngle = (int)(360 * (float)t.getC() /somme);
			g.setColor(new Color(0,0,255));
			g.fillArc(marge,0, cote,cote, startAngle, arcAngle);
		}
	}

	@Override
	public void update(Observable o, Object arg) {
	
		this.repaint();
	}
}