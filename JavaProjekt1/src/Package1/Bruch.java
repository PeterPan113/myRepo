package Package1;

public class Bruch {
	public int nenner = 1;
	public int zaehler = 1;

	public Bruch(int nenner, int pZaehler){
		this.nenner = nenner;
		this.zaehler = pZaehler;
	}
	
	public Bruch multiplizieren(Bruch bruch) {
		return new Bruch(nenner * bruch.nenner, zaehler * bruch.zaehler);
	}
	
	public Bruch multiplizieren(int faktor) {
		return new Bruch(nenner, zaehler * faktor);
	}
}
