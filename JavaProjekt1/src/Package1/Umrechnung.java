package Package1;

public class Umrechnung {

	public int dez;
	public int bin;
	public String hex;

	public Umrechnung(int zahl, String wert) {
		if(wert.toLowerCase().contains("bin")  || wert.equalsIgnoreCase("binaer")) {
			bin = zahl;
			hex = bin2hex();
			dez = bin2dez();
		} else if(wert.toLowerCase().contains("dez")  || wert.equalsIgnoreCase("dezimal")) {
			dez = zahl;
			bin = dez2bin();
		}
	}

	public int dez2bin() {
		int x = dez;
		String output = "";
		while(x>0) {
			output = ""+(x%2)+output;
			x = x/2;
		}
		return Integer.parseInt(output);
	}

	public String bin2hex() {
		return "";
	}
	
	public int bin2dez() {
		int output = 0;
		String zahl = ""+bin;
		for(int i=0; i<zahl.length(); i++) {
			//  int x = Integer.parseInt(""+zahl.charAt(i));
			int x = (int) zahl.charAt(i) -48;
			output += x*Math.pow(2,zahl.length()-1-i);
			
		}
		return output;
	}

	public int addBin() {
		return 1;
	}

}
