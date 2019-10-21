package triplet;

import java.awt.GridLayout;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("deprecation")
public class TripletFrame extends JFrame{
	private AffichageCamembert ac;
	private AffichageValeurs av;
	private JComponent [] mesVues;
	private Triplet triplet;
	
	public TripletFrame(int a, int b, int c) {
		// TODO Auto-generated constructor stub
		super("Gestion graphique d'un triplet d'effectifs");
		setLayout( new GridLayout(0,1));
		setSize(400,400);
		
		this.triplet = new Triplet(a, b, c);
		this.ac = new AffichageCamembert(this.triplet);
		this.av = new AffichageValeurs(this.triplet);
		
		this.mesVues = new  JComponent[2];
		this.mesVues[0] = av;
		this.mesVues[1] = ac;
		add(mesVues[0]);
		add(mesVues[1]);
		
		this.triplet.addObserver(this.ac);
		this.triplet.addObserver(this.av);
		
		JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        menuBar.add(menu);
        menu.add(new JMenuItem (new TripletController("Changer A", triplet)));
        menu.add(new JMenuItem (new TripletController("Changer B", triplet)));
        menu.add(new JMenuItem (new TripletController("Changer C", triplet)));
		setJMenuBar(menuBar);
	}

}
