package triplet;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

public class TripletController extends AbstractAction {
	private Triplet triplet;
	private int nombre;
	private String texte;

	public TripletController(String Texte, Triplet triplet) {
		// TODO Auto-generated constructor stub
		super(Texte);
		this.triplet = triplet;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("TODO : " + arg0.getActionCommand());
		texte = JOptionPane.showInputDialog(arg0.getActionCommand() + " : Nouvelle valeur ");
		
		try {
			CommandFactory cf = new CommandFactory();
			Command cmd = cf.createCommand(arg0.getActionCommand(), triplet);
			cmd.execute(Integer.parseInt(texte));
		} catch(NumberFormatException e) {
			System.out.println("Ceci n'est pas un entier");
		}
		
		
		
	}

}
