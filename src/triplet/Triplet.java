package triplet;

import java.util.Observable;

//TODO Cette classe modèle doit être informée des changements du modèle (le triplet.Triplet).
// Pour ce faire, utilisez la classe java.util.Observable et créez une nouvelle classe TripletFrame
@SuppressWarnings("deprecation")
public class Triplet extends Observable {
	private  int a;
	private  int b;
	private  int c;
	

	public Triplet(int a, int b, int c) {
		this.a  = a;
		this.b = b;
		this.c  = c;
	}

	void setA( int pa) {
		this.a = pa;
		setChanged();
		notifyObservers();
	}

	void setB( int pb) {
		this.b = pb;
		setChanged();
		notifyObservers();
	}

	void setC( int pc) {
		this.c = pc;
		setChanged();
		notifyObservers();
	}

	int getA() {
		return a;
	}

	int getB() {
		return b;
	}

	int getC() {
		return c;
	}

}

