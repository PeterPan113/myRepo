package Package1;

public class Umrechnung {

	public int dez;
	public int bin;
	public String hex;

	public Umrechnung(int zahl, String wert) {
		if(wert.toLowerCase().contains("bin")  || wert.equalsIgnoreCase("binaer")) {
			bin = zahl;
			hex = bin2hex(bin);
			dez = bin2dez(bin);
		} else if(wert.toLowerCase().contains("dez")  || wert.equalsIgnoreCase("dezimal")) {
			dez = zahl;
			bin = dez2bin(dez);
		}
	}

	public int dez2bin(int wert) {
		int x = wert;
		String output = "";
		while(x>0) {
			output = ""+(x%2)+output;
			x = x/2;
		}
		return Integer.parseInt(output);
	}

	public String bin2hex(int wert) {
		String temp = ""+wert;
		String output = "";
		temp = lengthenString(temp);
		while(temp.length()>0) {
			String sub = temp.substring(0,4);
			wert = bin2dez(Integer.parseInt(sub));
			output += ""+getHexa(wert);
			temp = temp.substring(4, temp.length());
		}
		return output;
	}
	
	public int bin2dez(int wert) {
		int output = 0;
		String zahl = ""+wert;
		for(int i=0; i<zahl.length(); i++) {
			//  int x = Integer.parseInt(""+zahl.charAt(i));
			int x = (int) zahl.charAt(i) -48;
			output += x*Math.pow(2,zahl.length()-1-i);
			
		}
		return output;
	}
	
	public String getHexa(int wert) {
		if(wert<10) return ""+wert;
		else return ""+ (char) (wert+55);
	}
	
	public String lengthenString(String strg) {
		while(strg.length()%4 != 0) strg = "0"+strg;
		return strg;
	}

	public int addBin() {
		return 1;
	}

}